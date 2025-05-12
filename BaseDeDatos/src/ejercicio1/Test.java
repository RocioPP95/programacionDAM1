package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
	private static PersonasService service;

	public static void main(String[] args) {
		service = new PersonasService();

		List<Persona> personas = new ArrayList<>();
		Persona persona = new Persona();
		persona.setDni("123245");
		persona.setNombre("ROcio");
		persona.setApellidos("Pacheco");
		persona.setFechaNacimiento(LocalDate.of(2022, 02, 1));
		personas.add(persona);

		Persona persona2 = new Persona();
		persona2.setDni("12324445");
		persona2.setNombre("ROcio");
		persona2.setApellidos("Pacheco");
		persona2.setFechaNacimiento(LocalDate.of(2022, 02, 1));
		personas.add(persona2);

		Persona persona3 = new Persona();
		persona3.setDni("12322245");
		persona3.setNombre("Rocio");
		persona3.setApellidos("Pacheco");
		persona3.setFechaNacimiento(LocalDate.of(2022, 02, 1));
		personas.add(persona3);
		
		try {
			service.insertarPersonas(personas);
		} catch (PersonaException e) {
			e.printStackTrace();
		}
	}

}
