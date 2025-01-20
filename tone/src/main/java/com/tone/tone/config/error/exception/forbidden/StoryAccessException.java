package com.tone.tone.config.error.exception.forbidden;

import com.tone.tone.config.error.ErrorCode;

public class StoryAccessException extends ForbiddenException {
    public StoryAccessException(){
        super(ErrorCode.STORY_ACCESS_DENIED);
    }
}
