package ejercicioCEU;

import java.util.Scanner;

public class AppCeu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Equipo eqLocal = crearEquipo(sc, "LOCAL");
		Equipo eqVisitante = crearEquipo(sc, "VISITANTE");
		System.out.println(eqLocal);
		System.out.println(eqVisitante);

		Partido p = new Partido();
		p.setEquipoLocal(eqLocal);
		p.setEquipoVisitante(eqVisitante);
		Resultado r = new Resultado();
		p.setResultado(r);

		System.out.println("Dime el resultado (goles locales):");
		Integer golesL = sc.nextInt();
		System.out.println("Dime el resultado (goles visitantes):");
		Integer golesV = sc.nextInt();
		r.setGolesLocales(golesL);
		r.setGolesVisitantes(golesV);
		System.out.println(p);

		System.out.println("Ganador: " + p.getEquipoGanador());

		Jugador infiltrado = new Jugador("Blas Infiltrado", 99);
		eqVisitante.getListaJugadores().add(infiltrado);
		System.out.println("Equipo visitante " + eqVisitante);

		eqLocal.setCapitan(eqLocal.getListaJugadores().getLast());
		System.out.println("Equipo local " + eqLocal);

		eqVisitante.setCompeticion("Liga Nacional");
		eqLocal.setCompeticion("Copa Internacional");
		System.out.println(eqVisitante.getCompeticion());
		System.out.println(eqLocal.getCompeticion());

		sc.close();
	}

//Método a parte para no hacer bucles

	private static Equipo crearEquipo(Scanner sc, String tipoEquipo) {
		System.out.println("Dime el nombre del equipo " + tipoEquipo);
		Equipo e = new Equipo(sc.nextLine());
		for (int i = 1; i <= 3; i++) {
			System.out.println("Dime el nombre del jugador " + i);
			String nombre = sc.nextLine();
			System.out.println("Dime el dorsal del jugador " + i);
			Integer dorsal = sc.nextInt();
			sc.nextLine();

			Jugador jugador = new Jugador(nombre, dorsal);
			e.getListaJugadores().add(jugador);
		}
		e.setCapitan(e.getListaJugadores().getFirst());
		return e;

	}

}
