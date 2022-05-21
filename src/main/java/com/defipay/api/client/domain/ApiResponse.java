package com.defipay.api.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse<T> {
    @JsonProperty(value = "data")
    T result;
    private boolean success;
    @JsonProperty(value = "code")
    private int errorCode;
    @JsonProperty(value = "msg")
    private String errorMessage;

    public ApiResponse() {
    }

    public ApiResponse(T result, boolean success, int errorCode,
                       String errorMessage) {
        this.result = result;
        this.success = success;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public T getResult() {
        return result;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }



    @Override
    public String toString() {
        return "Response{" +
                "success=" + success +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                ", result=" + result +
                '}';
    }
}
