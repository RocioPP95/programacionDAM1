package Ej6;

public class ParametroIncorrectoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3916652548070846463L;

	public ParametroIncorrectoException() {
		super();
	}

	public ParametroIncorrectoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public ParametroIncorrectoException(String message, Throwable cause) {
		super(message, cause);

	}

	public ParametroIncorrectoException(String message) {
		super(message);

	}

	public ParametroIncorrectoException(Throwable cause) {
		super(cause);

	}

}
