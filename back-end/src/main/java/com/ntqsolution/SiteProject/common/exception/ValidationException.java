package com.ntqsolution.SiteProject.common.exception;

/**
* The Class SystemException.
*/
public final class ValidationException extends RuntimeException {

 /** The Constant serialVersionUID. */
 private static final long serialVersionUID = 5861310537366287163L;

 /**
  * Instantiates a new system exception.
  */
 public ValidationException() {
     super();
 }

 /**
  * Instantiates a new system exception.
  *
  * @param message the message
  * @param cause the cause
  */
 public ValidationException(final String message, final Throwable cause) {
     super(message, cause);
 }

 /**
  * Instantiates a new system exception.
  *
  * @param message the message
  */
 public ValidationException(final String message) {
     super(message);
 }

 /**
  * Instantiates a new system exception.
  *
  * @param cause the cause
  */
 public ValidationException(final Throwable cause) {
     super(cause);
 }

}
