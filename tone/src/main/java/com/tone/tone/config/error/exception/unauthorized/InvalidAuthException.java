package com.tone.tone.config.error.exception.unauthorized;

import com.tone.tone.config.error.ErrorCode;

public class InvalidAuthException extends UnauthorizedException{
    public InvalidAuthException(){
        super(ErrorCode.INVALID_AUTH_CODE);
    }
}
