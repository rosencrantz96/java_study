package test.ch10.test07;

public class NotExistIDException extends Exception {
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}
}
