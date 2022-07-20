package solid.liskovsubstitution.correct;

public class DocumentException extends Exception {
    private String errorCode;

    public DocumentException(String errorCode, String errorMessage) {
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