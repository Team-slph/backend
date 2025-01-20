package com.tone.tone.config.error.exception.notFoundException;

import com.tone.tone.config.error.ErrorCode;

public class ChatRoomNotFoundException extends NotFoundException{
    public ChatRoomNotFoundException(){
        super(ErrorCode.CHATROOM_NOT_FOUND);
    }
}
