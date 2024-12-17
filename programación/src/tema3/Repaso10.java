package tema3;

import java.util.Scanner;

public class Repaso10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numeroAlumnos = 0;
		do {

			System.out.println("¿Cuántos alumnos hay?");
			numeroAlumnos = sc.nextInt();
			} while (!(numeroAlumnos > 0));
			//aqui siempre hay que hacer un next line para que coja el integer luego de string
			sc.nextLine();
			String[] alumnos = new String[numeroAlumnos];
			Integer[] notaMedia = new Integer[numeroAlumnos];
			Integer nota1 = 0;
			Integer nota2 = 0;
			Integer nota3 = 0;

			for (int i = 0; i < alumnos.length; i++) {
				System.out.println("¿Cuál es el nombre del alumno " + (i + 1) + "?");
				String nombre = sc.nextLine();
				alumnos[i] = nombre;
				System.out.println("¿Cuál es la nota de " + alumnos[i] + " para el examen 1?");
				nota1 = sc.nextInt();
				System.out.println("¿Cuál es la nota de " + alumnos[i] + " para el examen 2?");
				nota2 = sc.nextInt();
				System.out.println("¿Cuál es la nota de " + alumnos[i] + " para el examen 3?");
				nota3 = sc.nextInt();
				//aqui hay que poner otro next line para que se quede esperando a que el usuario vuelva a escribir ya que pide de integer a string
				sc.nextLine();
				Integer suma = nota1 + nota2 + nota3;
				Integer media = suma / 3;
				notaMedia[i] = media;

			}
			for (int i = 0; i < notaMedia.length; i++) {

				System.out.println("Listado de notas");
				System.out.println("Alumno: " + alumnos[i] + " - Nota media: " + notaMedia[i]);
			}
		
		
		sc.close();
	}
}
