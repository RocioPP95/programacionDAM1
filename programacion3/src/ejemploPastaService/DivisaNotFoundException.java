package ejemploPastaService;

public class DivisaNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5710317632236530704L;

	public DivisaNotFoundException() {
	}

	public DivisaNotFoundException(String message) {
		super(message);

	}

	public DivisaNotFoundException(Throwable cause) {
		super(cause);

	}

	public DivisaNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public DivisaNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
