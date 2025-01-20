package com.tone.tone.config.error.exception.conflict;

import com.tone.tone.config.error.ErrorCode;
import com.tone.tone.config.error.exception.BusinessBaseException;

public class ConflictException extends BusinessBaseException {
    public ConflictException(ErrorCode errorCode) {
        super(errorCode.getMessage(), errorCode);
    }
}
