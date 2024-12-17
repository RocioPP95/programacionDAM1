
public class Calculadora {
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
}
