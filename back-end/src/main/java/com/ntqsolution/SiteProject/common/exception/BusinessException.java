package com.ntqsolution.SiteProject.common.exception;

import org.springframework.http.HttpStatus;

/**
 * The Class BusinessException.
 */
public final class BusinessException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5861310537366287163L;
	private HttpStatus status = HttpStatus.NOT_FOUND;

	/**
	 * Instantiates a new business exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public BusinessException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new business exception.
	 *
	 * @param message
	 *            the message
	 */
	public BusinessException(final String message) {
		super(message);
	}

	/**
	 * Instantiates a new business exception.
	 *
	 * @param cause
	 *            the cause
	 */
	public BusinessException(final Throwable cause) {
		super(cause);
	}
	
	public BusinessException(final HttpStatus status, String message) {
		super(message);
		this.setStatus(status);
	}
	
	public BusinessException(final HttpStatus status) {
		super();
		this.setStatus(status);
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	} 
}
