public class IllegalTriangleException extends RuntimeException {
    public IllegalTriangleException() {
        super("Illegal Triangle Exception");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}
