package Ejercicios;

import java.util.Scanner;

public class AppAlumno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el dni: ");
		String dni = sc.nextLine();

		Alumno x = new Alumno(dni);
		x.setDni(dni);

		System.out.println("Introduce el nombre: ");
		x.setNombre(sc.nextLine());
		System.out.println("Introduce la edad: ");
		x.setEdad(sc.nextInt());
		System.out.println("Introduce la nota: ");
		x.setNota(sc.nextDouble());
		System.out.println("La nota delalumno es " + x.getNota());
		x.aprobar();
		System.out.println("La nota del alumno es " + x.getNota());

		Curso curso = new Curso();

		System.out.println("Introduce el curso: ");
		curso.setDescripcion(sc.nextLine());
		System.out.println("Introduce el identificador: ");
		curso.setIdentificador(sc.nextInt());

		System.out.println(x);

		sc.close();
	}
}
