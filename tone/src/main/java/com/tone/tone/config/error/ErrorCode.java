package com.tone.tone.config.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    // 공통 에러
    INVALID_INPUT_VALUE(HttpStatus.BAD_REQUEST, "E1", "올바르지 않은 입력값입니다."),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "E2", "잘못된 HTTP 메서드를 호출했습니다."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "E3", "서버 에러가 발생했습니다."),
    NOT_FOUND(HttpStatus.NOT_FOUND, "E4", "존재하지 않는 정보입니다."),
    Forbidden(HttpStatus.FORBIDDEN, "E5", "권한이 없습니다."),
    // 사용자 관련 에러
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "U1", "존재하지 않는 사용자입니다."),
    DUPLICATE_USER(HttpStatus.CONFLICT, "U2", "이미 존재하는 사용자입니다."),
    USER_INFO_NOT_FOUND(HttpStatus.NOT_FOUND, "U3", "사용자 정보를 가져올 수 없습니다."),
    EMAIL_NOT_FOUND(HttpStatus.NOT_FOUND, "U4", "사용자 이메일 정보가 존재하지 않습니다."),
    INVALID_AUTH_CODE(HttpStatus.UNAUTHORIZED, "U5", "유효하지 않은 인증 코드입니다."),
    TOKEN_ISSUE_FAILED(HttpStatus.UNAUTHORIZED, "U6", "토큰 발급에 실패했습니다."),
    EXPIRED_TOKEN(HttpStatus.UNAUTHORIZED, "U7", "만료된 토큰입니다."),

    //플리 관련 에러
    PLAYLIST_DUPLICATE_TITLE(HttpStatus.CONFLICT, "P1", "이미 존재하는 플레이리스트 제목입니다."),
    PLAYLIST_DUPLICATE_MUSIC(HttpStatus.CONFLICT, "P2", "이미 추가한 노래입니다."),

    //채팅 관련 에러
    CHATROOM_NOT_FOUND(HttpStatus.NOT_FOUND, "CH1", "채팅방을 찾을 수 없습니다."),

    // 스토리 관련 에러

    // 친구 / 공개 스토리 권한 구분
    STORY_ACCESS_DENIED(HttpStatus.FORBIDDEN, "S1", "해당 스토리를 볼 권한이 없습니다.");

    private final String message;
    private final String code;
    private final HttpStatus status;

    ErrorCode(final HttpStatus status, final String code, final String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
