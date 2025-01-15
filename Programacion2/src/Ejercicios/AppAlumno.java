package Ejercicios;

import java.util.Scanner;

public class AppAlumno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Introduce el dni: "); String dni = sc.nextLine();
		 * 
		 * Alumno x = new Alumno(dni); x.setDni(dni);
		 * 
		 * System.out.println("Introduce el nombre: "); x.setNombre(sc.nextLine());
		 * System.out.println("Introduce la edad: "); x.setEdad(sc.nextInt());
		 * System.out.println("Introduce la nota: "); x.setNota(sc.nextDouble());
		 * System.out.println("La nota delalumno es " + x.getNota()); x.aprobar();
		 * System.out.println("La nota del alumno es " + x.getNota());
		 * 
		 * Curso curso = new Curso();
		 * 
		 * System.out.println("Introduce el curso: ");
		 * curso.setDescripcion(sc.nextLine());
		 * System.out.println("Introduce el identificador: ");
		 * curso.setIdentificador(sc.nextInt());
		 * 
		 * System.out.println(x);
		 */

		String dni;
		Alumno[] array = new Alumno[3];
		Curso curso1 = new Curso();
		curso1.setDescripcion("DAM-DAW");
		curso1.setIdentificador(1);

		for (int i = 0; i < array.length; i++) {
			sc.nextLine();

			do {
				System.out.println("Introduce el dni: ");
				dni = sc.nextLine();
				Alumno.validarDNI();

			} while (Alumno.validarDNI() == false);

			Alumno rosa = new Alumno(dni);
			rosa.setDni(dni);
			System.out.println("Introduce el nombre: ");
			rosa.setNombre(sc.nextLine());
			System.out.println("Introduce la edad: ");
			rosa.setEdad(sc.nextInt());
			System.out.println("Introduce la nota: ");
			rosa.setNota(sc.nextDouble());
			rosa.setCurso(curso1);
			array[i] = rosa;
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					System.out.println("Error");
				}

			}
		}

		sc.close();
	}
}
