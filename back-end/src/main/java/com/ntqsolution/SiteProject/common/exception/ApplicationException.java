package com.ntqsolution.SiteProject.common.exception;

public class ApplicationException extends RuntimeException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private int code;
	
	public ApplicationException() {

	}

	public ApplicationException(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
}
