package crusader.exception;

/**
 * Represents an error in parsing user input
 */
public class CrusaderParseException extends CrusaderException {
    public CrusaderParseException(String message) {
        super(String.format("There is a parsing error!\nDetails: %s", message));
    }
}