package com.ntqsolution.SiteProject.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.validation.ObjectError;

/**
 * Define a GenericResponse which use in Rest Controller.
 */
public class GenericResponse {

    /** The message of the response *. */
    private String message;

    /** The error of the response *. */
    private String error;

    /**
     * Constructor a GenericResponse.
     *
     * @param message The message of the response.
     */
    public GenericResponse(final String message) {
        super();
        this.message = message;
    }

    /**
     * Constructor a GenericResponse.
     *
     * @param message The message of the response.
     * @param error The error of the response.
     */
    public GenericResponse(final String message, final String error) {
        super();
        this.message = message;
        this.error = error;
    }

    /**
     * Constructor a GenericResponse.
     *
     * @param allErrors All messages of the response.
     * @param error The error of the response.
     */
    public GenericResponse(List<ObjectError> allErrors, String error) {
        this.error = error;
        message = allErrors.stream().map(e -> e.getDefaultMessage())
                .collect(Collectors.joining(","));
    }

    /**
     * Get the message of the response.
     *
     * @return The message of the response.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set the new message for the response.
     *
     * @param message The new message of the response.
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     * Get the error of the response.
     *
     * @return The error of the response.
     */
    public String getError() {
        return error;
    }

    /**
     * Set the new error of the response.
     *
     * @param error The new error of the response.
     */
    public void setError(final String error) {
        this.error = error;
    }

}
