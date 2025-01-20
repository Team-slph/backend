package com.tone.tone.config.error.exception.unauthorized;

import com.tone.tone.config.error.ErrorCode;

public class TokenFailedException extends UnauthorizedException{
    public TokenFailedException(){
        super(ErrorCode.TOKEN_ISSUE_FAILED);
    }
}
