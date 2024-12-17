package tema3;

public class Repaso1 {
	public static void main(String[] args) {

		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Integer suspensos = 0;

		for (Integer integer : listaNotas) {
			if (integer < 5)

				suspensos++;

		}
		System.out.println("Total alumnos suspensos:" + suspensos);
	}
}
