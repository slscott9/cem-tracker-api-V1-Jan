package com.sscott.cemtrackerapi.error;

import com.sun.istack.Nullable;
import org.springframework.http.HttpStatus;

public class ErrorResponse {

    public ErrorResponse(
            HttpStatus status,
            String message,
            String stackTrace
    ){
        this.status = status.name();
        this.message = message;
        this.stackTrace = stackTrace;
        this.code = status.value();


    };


    public ErrorResponse(
            HttpStatus status,
            String message
    ){
        this.status = status.name();
        this.message = message;
        this.stackTrace = null;
        this.code = status.value();
    };



    public String status;
    public String message;
    @Nullable
    public String stackTrace;
    public Integer code;

}
