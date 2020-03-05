package rpis81.alexandrov.oop.model.exception;

public class RegistrationNumberFormatException extends RuntimeException {

    public RegistrationNumberFormatException() {
        super();
    }

    public RegistrationNumberFormatException(String message) {
        super(message);
    }

    public RegistrationNumberFormatException(Throwable object, String message) {
        super(message, object);
    }
}
