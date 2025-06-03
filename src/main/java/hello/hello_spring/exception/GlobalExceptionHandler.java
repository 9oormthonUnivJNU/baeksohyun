package hello.hello_spring.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler (CustomException.class)
    //@ExceptionHandler : Spring에서 특정 예외가 발생했을 때 예외를 처리할 메서드 지정하기 위해 사용
    protected ResponseEntity<ErrorDTO> handleCustomException (CustomException e) {
        return ErrorDTO.toResponseEntity(e.getCustomerrorcode());
    }
    //protected : 외부에서의 적집 호출 방지를 위해 사용. 상속을 고려한 확장 가능성
    //handleCustomException : Spring에 의해 자동 호출되는 메서드
}
