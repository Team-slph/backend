package com.tone.tone.config.error.exception.unauthorized;

import com.tone.tone.config.error.ErrorCode;

public class ExpiredTokenException extends UnauthorizedException{
    public ExpiredTokenException(){
        super(ErrorCode.EXPIRED_TOKEN);
    }
}
