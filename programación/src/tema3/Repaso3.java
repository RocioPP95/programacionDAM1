package tema3;

public class Repaso3 {
	public static void main(String[] args) {
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Integer notas = 0;
		Integer mayor = 0;
		Integer menor = 999;
		for (int i = 0; i < listaNotas.length; i++) {
			notas = listaNotas[i];
			if (notas >= 5) {
				if (notas > mayor) {
					mayor = notas;
				}
				if (notas < menor) {
					menor = notas;
				}
			}

		}
		System.out.println("Nota mayor de los aprobados:" + mayor);
		System.out.println("Nota menor de los aprobados:" + menor);
	}
}
