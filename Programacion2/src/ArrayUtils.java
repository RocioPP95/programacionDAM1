import java.util.Iterator;

public class ArrayUtils {
	public static void imprimirArray(String[] cadena) {
		for (int i = 0; i < cadena.length; i++) {
			System.out.println(cadena[i]);
		}

	}

	public static String obtenerPalabra(String[] cadena, Integer numero) {
		if (numero > cadena.length - 1) {
			return "";
		} else if (numero < 0) {
			return "";
		} else {
			String palabra = cadena[numero];
			return palabra;
		}

	}

	public static Integer buscarPalabra(String[] cadena, String palabra) {

		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i].equals(palabra)) {
				Integer numero = i;
				return numero;
			}

		}
		return -1;

	}
}