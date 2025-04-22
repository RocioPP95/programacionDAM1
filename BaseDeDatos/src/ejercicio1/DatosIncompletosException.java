package ejercicio1;

public class DatosIncompletosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2963102027742830983L;

	public DatosIncompletosException() {
	}

	public DatosIncompletosException(String message) {
		super(message);

	}

	public DatosIncompletosException(Throwable cause) {
		super(cause);

	}

	public DatosIncompletosException(String message, Throwable cause) {
		super(message, cause);

	}

	public DatosIncompletosException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
