package com.ntqsolution.SiteProject.controller.error;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ntqsolution.SiteProject.common.exception.BusinessException;
import com.ntqsolution.SiteProject.controller.GenericResponse;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    public RestResponseEntityExceptionHandler() {
        super();
    }

    @Override
    protected ResponseEntity<Object> handleBindException(final BindException ex,
            final HttpHeaders headers, final HttpStatus status,
            final WebRequest request) {
        final BindingResult result = ex.getBindingResult();
        final GenericResponse bodyOfResponse = new GenericResponse(result.getAllErrors(),
                "Invalid" + result.getObjectName());
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            final MethodArgumentNotValidException ex, final HttpHeaders headers,
            final HttpStatus status, final WebRequest request) {
        final BindingResult result = ex.getBindingResult();
        final GenericResponse bodyOfResponse = new GenericResponse(result.getAllErrors(),
                "Invalid" + result.getObjectName());
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }
    /**
     * 2xx
     * 4xx
     * @param ex
     * @param request
     * @return
     */
    @ExceptionHandler({BusinessException.class})
    public ResponseEntity<Object> handleBussinessException(final BusinessException ex,
            final WebRequest request) {
        final GenericResponse bodyOfResponse = new GenericResponse(ex.getMessage(),
                "BusinessException");
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(),
        		ex.getStatus(), request);
    }
    
    /**
     * 5xx
     * @param ex
     * @param request
     * @return
     */
    @ExceptionHandler({ Exception.class})
    public ResponseEntity<Object> handleInternal(final RuntimeException ex,
            final WebRequest request) {
        logger.error("500 Status Code", ex);
        final GenericResponse bodyOfResponse = new GenericResponse(ex.getMessage(),
                "InternalError");
        return new ResponseEntity<Object>(bodyOfResponse, new HttpHeaders(),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
