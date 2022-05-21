package com.defipay.api.client.exception;

import com.defipay.api.client.DefipayApiError;

/**
 * An exception which can occur while invoking methods of the Defipay API.
 */
public class DefipayApiException extends RuntimeException {

    private static final long serialVersionUID = 3788669840036201041L;
    /**
     * Error response object returned by Defipay API.
     */
    private DefipayApiError error;

    /**
     * Instantiates a new Defipay api exception.
     *
     * @param error an error response object
     */
    public DefipayApiException(DefipayApiError error) {
        this.error = error;
    }

    /**
     * Instantiates a new Defipay api exception.
     */
    public DefipayApiException() {
        super();
    }

    /**
     * Instantiates a new Defipay api exception.
     *
     * @param message the message
     */
    public DefipayApiException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Defipay api exception.
     *
     * @param cause the cause
     */
    public DefipayApiException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Defipay api exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public DefipayApiException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @return the response error object from Defipay API, or null if no response object was returned (e.g. server returned 500).
     */
    public DefipayApiError getError() {
        return error;
    }

    @Override
    public String getMessage() {
        if (error != null) {
            return error.getErrorMessage();
        }
        return super.getMessage();
    }
}
