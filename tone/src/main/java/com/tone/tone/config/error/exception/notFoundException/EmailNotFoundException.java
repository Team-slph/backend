package com.tone.tone.config.error.exception.notFoundException;

import com.tone.tone.config.error.ErrorCode;

public class EmailNotFoundException extends NotFoundException{
    public EmailNotFoundException(){
        super(ErrorCode.EMAIL_NOT_FOUND);
    }
}
