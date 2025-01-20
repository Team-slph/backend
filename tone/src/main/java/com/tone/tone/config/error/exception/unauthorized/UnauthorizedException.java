package com.tone.tone.config.error.exception.unauthorized;

import com.tone.tone.config.error.ErrorCode;
import com.tone.tone.config.error.exception.BusinessBaseException;

public class UnauthorizedException extends BusinessBaseException {
    public UnauthorizedException(ErrorCode errorCode) {
        super(errorCode.getMessage(), errorCode);
    }

}
