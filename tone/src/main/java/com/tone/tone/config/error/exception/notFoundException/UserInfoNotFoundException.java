package com.tone.tone.config.error.exception.notFoundException;

import com.tone.tone.config.error.ErrorCode;

public class UserInfoNotFoundException extends NotFoundException{
    public UserInfoNotFoundException(){
        super(ErrorCode.USER_INFO_NOT_FOUND);
    }
}
