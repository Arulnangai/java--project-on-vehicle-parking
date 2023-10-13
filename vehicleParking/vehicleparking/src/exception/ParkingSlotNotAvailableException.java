package exception;

public class ParkingSlotNotAvailableException extends Exception {
    public ParkingSlotNotAvailableException() {
    }

    public ParkingSlotNotAvailableException(String message) {
        super(message);
    }

    public ParkingSlotNotAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingSlotNotAvailableException(Throwable cause) {
        super(cause);
    }

    public ParkingSlotNotAvailableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
