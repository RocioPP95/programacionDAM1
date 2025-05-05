package ejercicio1;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class App {

	private static PersonasService service;
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		try {
			service = new PersonasService();
			while (true) {
				try {
					Integer opcion = mostrarMenu();
					if (opcion == 1) {
						consultarPorDni();
					} else if (opcion == 2) {
						consultarPorNombreApellidos();
					} else if (opcion == 3) {
						crearPersona();
					} else if (opcion == 4) {
						actualizarPersona();
					} else if (opcion == 5) {
						borrarPersona();
					} else if (opcion == 0) {
						System.out.println("Bye bye!!");
						return;
					} else {
						System.out.println("Opción no válida");
					}
				} catch (PersonaNotFoundException e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (PersonaException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	private static void borrarPersona() throws PersonaException, PersonaNotFoundException {
		System.out.println("Indique DNI de la persona que quiere borrar:");
		service.borrarPersona(pedirDato("DNI"));
	}

	private static void actualizarPersona() throws PersonaException, PersonaNotFoundException {
		System.out.println("Indique DNI de la pesona que quiere actualizar y los datos nuevos.");
		Persona persona = solicitarDatosPersona();
		try {
			persona.validar();
			service.actualizarPersona(persona);
		} catch (DatosIncompletosException e) {
			System.out.println(e.getMessage());
			actualizarPersona();
		}
	}

	private static void crearPersona() throws PersonaException {
		System.out.println("Indique DNI y datos de la nueva persona:");
		Persona persona = solicitarDatosPersona();
		try {
			persona.validar();
			service.insertarPersona(persona);
		} catch (DatosIncompletosException e) {
			System.out.println(e.getMessage());
			crearPersona();
		}
	}

	private static Persona solicitarDatosPersona() {
		Persona persona = new Persona();
		persona.setDni(pedirDato("DNI"));
		persona.setNombre(pedirDato("Nombre"));
		persona.setApellidos(pedirDato("Apellidos"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = pedirDato("Fecha nacimiento (DD/MM/YYYY)");
		persona.setFechaNacimiento(LocalDate.parse(fecha, formatter));
		return persona;
	}

	private static String pedirDato(String dato) {
		System.out.println("Indicar " + dato);
		return sc.nextLine();
	}

	private static void consultarPorDni() throws PersonaException, PersonaNotFoundException {
		String dni = pedirDato("DNI buscado");
		Persona persona = service.consultarPersona(dni);
		System.out.println("Aquí tienes tu persona:");
		System.out.println(persona);
	}

	private static void consultarPorNombreApellidos() throws PersonaException, PersonaNotFoundException {
		String filtro = pedirDato("Nombre/apellidos que estás buscando");
		List<Persona> lista = service.buscarPersonas(filtro);
		System.out.println("Aquí tienes los resultados:");
		if (lista.isEmpty()) {
			System.out.println("No se han encontrado resultados");
		}
		for (Persona persona : lista) {
			System.out.println(persona);
		}
	}

	private static Integer mostrarMenu() {
		System.out.println("Menú:");
		System.out.println("\t1. Consultar por DNI");
		System.out.println("\t2. Consultar por filtro");
		System.out.println("\t3. Insertar nueva persona");
		System.out.println("\t4. Actualizar datos persona");
		System.out.println("\t5. Borrar persona");
		System.out.println("\t0. Salir");
		Integer opcion = sc.nextInt();
		sc.nextLine();
		return opcion;
	}

}
