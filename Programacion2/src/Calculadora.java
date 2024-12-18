
public class Calculadora {
	private static final String DIV = "DIV";
	private static final String MUL = "MUL";
	private static final String SUB = "SUB";
	private static final String ADD = "ADD";

	public static Integer sumar(Integer numero, Integer numero1) {
		Integer suma = numero + numero1;
		return suma;
	}

	public static Integer restar(Integer numero, Integer numero1) {
		Integer resta = numero - numero1;
		return resta;
	}

	public static Integer multiplicar(Integer numero, Integer numero1) {
		Integer multi = numero * numero1;
		return multi;
	}

	public static Integer dividir(Integer numero, Integer numero1) {
		if (numero1 == 0) {
			return null;
		}
		Integer divi = numero / numero1;
		return divi;
	}

	public static Integer calcular(String cadena, Integer numero, Integer numero1) {
		if (cadena.equalsIgnoreCase(ADD)) {
			return Calculadora.sumar(numero, numero1);
		}
		if (cadena.equalsIgnoreCase(SUB)) {
			return Calculadora.restar(numero, numero1);
		}
		if (cadena.equalsIgnoreCase(MUL)) {
			return Calculadora.multiplicar(numero, numero1);
		}
		if (cadena.equalsIgnoreCase(DIV)) { // para sacar la constante click derecho-refactor-extraer constante
			return Calculadora.dividir(numero, numero1);
		}
		// siempre te pide un return si no entra en los demás if
		return null;
	}
}
