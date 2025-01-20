package com.tone.tone.config.error.exception.notFoundException;

import com.tone.tone.config.error.ErrorCode;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException(){
        super(ErrorCode.USER_NOT_FOUND);
    }
}
