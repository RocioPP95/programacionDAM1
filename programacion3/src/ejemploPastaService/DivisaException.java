package ejemploPastaService;

public class DivisaException extends Exception {

	private static final long serialVersionUID = 7144798268658117819L;

	public DivisaException() {
	}

	public DivisaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public DivisaException(String message, Throwable cause) {
		super(message, cause);

	}

	public DivisaException(String message) {
		super(message);

	}

	public DivisaException(Throwable cause) {
		super(cause);

	}

}
