package assg3_senowitzo19;

/**
 * @author Owen - Senowitz
 * class that does all the exception handling
 */
public class BookNotFoundException extends RuntimeException{
	// initializes message string
	private String message;
	/**
	 * default constructor for BookNotFoundException
	 */
	public BookNotFoundException() {
		this.message = "";
	}
	/**
	 * default constructor for BookNotFoundException with the parameter message string
	 * @param message
	 */
	public BookNotFoundException(String message) {
		this.message = message;
	}
	/**
	 * returns the error message
	 */
	@Override
	public String getMessage() {
		return message;
	}
}
