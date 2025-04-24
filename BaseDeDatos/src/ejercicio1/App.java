package ejercicio1;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class App {

	private static PersonasService service;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			service = new PersonasService();
			iniciar(sc);
			consultarPorDni(sc);
			consultarPorNombreApellidos(sc);
			insertarDatos(sc);

		} catch (PersonaNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (PersonaException e) {
			e.printStackTrace();
		}

	}

	private static void iniciar(Scanner sc) throws PersonaException, PersonaNotFoundException {
		String opcion;
		do {
			System.out.println("Selecciona una opción:\n 1.Consultar por Dni \n 2.Consultar por nombre ya pellidos"
					+ " \n 3.Insertar Datos \n 4.Actualizar Persona \n 5.Borrar persona  \n 6.Exit ");
			opcion = sc.nextLine();
			if (opcion.equals("1")) {
				consultarPorDni(sc);
			}
			if (opcion.equals("2")) {
				consultarPorNombreApellidos(sc);
			}
			if (opcion.equals("3")) {
				insertarDatos(sc);
			}
			if (opcion.equals("4")) {

			}
			if (opcion.equals("5")) {

			}
			if (opcion.equals("6")) {

			}
		} while (!opcion.equals("6"));

	}

	private static void consultarPorDni(Scanner sc) throws PersonaException, PersonaNotFoundException {
		System.out.println("Dime DNI que estás buscando");
		String dni = sc.nextLine();
		Persona persona = service.consultarPersona(dni);
		System.out.println("Aquí tienes tu persona:");
		System.out.println(persona);
	}

	private static void consultarPorNombreApellidos(Scanner sc) throws PersonaException, PersonaNotFoundException {
		System.out.println("Dime nombre/apellidos que estás buscando");
		String filtro = sc.nextLine();
		List<Persona> lista = service.buscarPersonas(filtro);
		System.out.println("Aquí tienes los resultados:");
		if (lista.isEmpty()) {
			System.out.println("No se han encontrado resultados");
		}
		for (Persona persona : lista) {
			System.out.println(persona);
		}
	}

	private static void insertarDatos(Scanner sc) {

		Persona persona = new Persona();
		System.out.println("Inserta dni");
		persona.setDni(sc.nextLine());
		System.out.println("Inserta nombre");
		persona.setNombre(sc.nextLine());
		System.out.println("Inserta apellidos");
		persona.setApellidos(sc.nextLine());
		System.out.println("Inserta fecha nacimiento");
		String cadena = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha = LocalDate.parse(cadena, formatter);
		persona.setFechaNacimiento(fecha);
		try {
			persona.validar();
			service.insertarPersona(persona);
		} catch (DatosIncompletosException e) {
			System.out.println(e.getMessage());
			insertarDatos(sc);
		}
	}
	


}
