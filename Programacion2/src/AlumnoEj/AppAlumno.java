package AlumnoEj;

import java.util.Scanner;

public class AppAlumno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("Introduce el dni: ");
//		String dni = sc.nextLine();
//
//		Alumno x = new Alumno(dni);
//		x.setDni(dni);
//
//		System.out.println("Introduce el nombre: ");
//		x.setNombre(sc.nextLine());
//		System.out.println("Introduce la edad: ");
//		x.setEdad(sc.nextInt());
//		System.out.println("Introduce la nota: ");
//		x.setNota(sc.nextDouble());
//		System.out.println("La nota delalumno es " + x.getNota());
//		x.aprobar();
//		System.out.println("La nota del alumno es " + x.getNota());
//
//		Curso curso = new Curso();
//
//		System.out.println("Introduce el identificador: ");
//		curso.setIdentificador(sc.nextInt());
//		sc.nextLine();
//		System.out.println("Introducela descripción: ");
//		curso.setDescripcion(sc.nextLine());
//
//		System.out.println("Introduce el nombre del profesor:");
//		Profesor profe = new Profesor();
//		profe.setNombre(sc.nextLine());
//		System.out.println("Introduce la edad del profesor:  ");
//		profe.setEdad(sc.nextInt());
//
//		System.out.println(x);

//		Alumno[] array = new Alumno[3];

		Curso curso1 = new Curso(3);

		curso1.setDescripcion("DAM-DAW");
		curso1.setIdentificador(1);

		for (int i = 0; i < curso1.getAlumnos().length; i++) {
			sc.nextLine();
			// ESTO SIGNIFICA DECLARARLO PERO NO CREÁNDOLO
			Alumno rosa;
			do {
				System.out.println("Introduce el dni: ");
				rosa = new Alumno(sc.nextLine());

			} while (rosa.validarDNI() == false);

			System.out.println("Introduce el nombre: ");
			rosa.setNombre(sc.nextLine());
			System.out.println("Introduce la edad: ");
			rosa.setEdad(sc.nextInt());
			System.out.println("Introduce la nota: ");
			rosa.setNota(sc.nextDouble());
			rosa.setCurso(curso1);

			// la siguiente linea es igual a array[i]=rosa
			curso1.addAlumno(rosa);
		}
		for (int i = 0; i < curso1.getAlumnos().length; i++) {
			for (int j = i + 1; j < curso1.getAlumnos().length; j++) {
				if (curso1.getAlumnos()[i].equals(curso1.getAlumnos()[j])) {
					System.out.println("Error");
				}

			}
		}
		for (int i = 0; i < curso1.getAlumnos().length; i++) {
			if (curso1.getAlumnos()[i].validar() == false) {
				System.out.println("El alumno" + curso1.getAlumnos()[i] + " tiene datos son incorrectos.");
			}
		}
		System.out.println(curso1.getAlumnos()[0].toString());
		System.out.println(curso1.getAlumnos()[1].toString());
		System.out.println(curso1.getAlumnos()[2].toString());

		sc.close();
	}
}
