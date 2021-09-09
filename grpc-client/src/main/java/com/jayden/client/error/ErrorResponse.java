package com.jayden.client.error;

import lombok.Getter;

@Getter
public class ErrorResponse {
    private String message;
    private String code;

    public ErrorResponse(ErrorCode errorCode) {
        this.message = errorCode.getMessage();
        this.code = errorCode.getCode();
    }
}
