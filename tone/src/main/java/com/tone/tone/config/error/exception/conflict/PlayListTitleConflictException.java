package com.tone.tone.config.error.exception.conflict;

import com.tone.tone.config.error.ErrorCode;

public class PlayListTitleConflictException extends ConflictException{
    public PlayListTitleConflictException(){
        super(ErrorCode.PLAYLIST_DUPLICATE_TITLE);
    }
}
