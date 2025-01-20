package com.tone.tone.config.error.exception.forbidden;

import com.tone.tone.config.error.ErrorCode;
import com.tone.tone.config.error.exception.BusinessBaseException;

public class ForbiddenException extends BusinessBaseException {
    public ForbiddenException(ErrorCode errorCode) {
        super(errorCode.getMessage(), errorCode);
    }
}
