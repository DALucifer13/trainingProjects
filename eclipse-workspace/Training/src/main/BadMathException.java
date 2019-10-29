package main;

public class BadMathException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BadMathException(String msg) {
		super(msg);
	}

}
