package com.sscott.cemtrackerapi.dto.response;

import com.sun.istack.Nullable;
import org.apache.catalina.Server;
import org.springframework.http.HttpStatus;

public class ServerResponse {

    public ServerResponse(
            HttpStatus status,
            String message
    ){
        this.status = status.name();
        this.message = message;
        this.code = status.value();


    };


    public String status;
    public String message;
    public Integer code;


}
