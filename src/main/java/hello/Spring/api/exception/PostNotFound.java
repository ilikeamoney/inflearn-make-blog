package hello.Spring.api.exception;

/**
 * status -> 404
 */
public class PostNotFound extends SuperException {

    private static final String MESSAGE = "존재하지 않는 글입니다.";

    public PostNotFound() {
        super(MESSAGE);
    }

    public PostNotFound(Throwable cause) {
        super(MESSAGE, cause);
    }


    // 에러코드 하위 타입에서 정의
    @Override
    public int getStatusCode() {
        return 404;
    }
}
