package solid.liskovsubstitution.wrong;

public class DocumentRuntimeException extends RuntimeException {
    private String errorCode;

    public DocumentRuntimeException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}