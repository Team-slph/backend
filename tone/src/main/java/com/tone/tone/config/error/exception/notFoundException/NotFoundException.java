package com.tone.tone.config.error.exception.notFoundException;

import com.tone.tone.config.error.ErrorCode;
import com.tone.tone.config.error.exception.BusinessBaseException;

public class NotFoundException extends BusinessBaseException {
    public NotFoundException(ErrorCode errorCode) {
        super(errorCode.getMessage(), errorCode);
    }
    public NotFoundException() {
        super(ErrorCode.NOT_FOUND);
    }

}
