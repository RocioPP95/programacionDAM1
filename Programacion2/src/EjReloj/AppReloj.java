package EjReloj;

import java.util.Scanner;

public class AppReloj {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean formato24horas = false;

		Reloj reloj = new Reloj();

		do {
			System.out.println("Introduce la hora: ");
			reloj.setHoras(sc.nextInt());
			System.out.println("Introduce los minutos: ");
			reloj.setMinutos(sc.nextInt());
			System.out.println("Introduce los segundos: ");
			reloj.setSegundos(sc.nextInt());
			if (reloj.check() == false) {
				System.out.println("La hora es incorrecta.");
			}
		} while (reloj.check() == false);
		System.out.println("La hora es: " + reloj.toString());

		reloj.ponerEnhora(reloj.getHoras(), reloj.getMinutos(), reloj.getSegundos());
		reloj.setFormato24Horas(formato24horas);

		reloj.ponerEnHora(24, 17);
		if (reloj.check()) {
			System.out.println("La hora " + reloj.toString() + " es correcta");
		} else {
			System.out.println("La hora " + reloj.toString() + " no es correcta");
		}

		reloj.ponerEnHora(21, 82);
		if (reloj.check()) {
			System.out.println("La hora " + reloj.toString() + " es correcta");
		} else {
			System.out.println("La hora " + reloj.toString() + " no es correcta");
		}

		reloj.ponerEnhora(17, 16, 15);
		if (reloj.check()) {
			System.out.println("La hora " + reloj.toString() + " es correcta");
		} else {
			System.out.println("La hora " + reloj.toString() + " no es correcta");
		}

		Reloj reloj1 = new Reloj(17, 16, 15);

		if (reloj.equals(reloj1)) {
			System.out.println("La hora " + reloj.toString() + " y l ahora " + reloj1.toString() + " son iguales");

		} else {
			System.out.println("La hora " + reloj.toString() + " y l ahora " + reloj1.toString() + " no son iguales");
		}

		sc.close();
	}
}
