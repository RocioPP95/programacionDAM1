package EjercicioRepaso;

public class ProductoNoEncontradoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8296129072120688796L;

	public ProductoNoEncontradoException() {
		super();

	}

	public ProductoNoEncontradoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public ProductoNoEncontradoException(String message, Throwable cause) {
		super(message, cause);

	}

	public ProductoNoEncontradoException(String message) {
		super(message);

	}

	public ProductoNoEncontradoException(Throwable cause) {
		super(cause);

	}

}
