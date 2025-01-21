package AlumnoEj;

import java.util.Scanner;

public class ProgramaProfesor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Profesor y = new Profesor();
		System.out.println("Introduce el dni: ");
		y.setDni(sc.nextLine());
		System.out.println("Introduce el nombre: ");
		y.setNombre(sc.nextLine());
		System.out.println("Introduce la edad");
		y.setEdad(sc.nextInt());
		System.out.println(y);
		sc.close();
	}
}
