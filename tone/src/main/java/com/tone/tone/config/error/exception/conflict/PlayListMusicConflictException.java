package com.tone.tone.config.error.exception.conflict;

import com.tone.tone.config.error.ErrorCode;

public class PlayListMusicConflictException extends ConflictException{
    public PlayListMusicConflictException(){
        super(ErrorCode.PLAYLIST_DUPLICATE_MUSIC);
    }
}
