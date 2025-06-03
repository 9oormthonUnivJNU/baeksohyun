package hello.hello_spring.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum CustomErrorCode {

    DUPLICATED_MEMBER(HttpStatus.BAD_REQUEST, "001_DUPLICATED_NAME", "이미 가입된 이름입니다.");

    private final HttpStatus status;
    private final String code;
    private final String msg;
}
