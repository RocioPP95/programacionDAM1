package peliculas;

import java.util.Scanner;

import ejercicioCEU.Equipo;

public class AppPeliculas {
	public static void main(String[] args) {

		Actor actor1 = new Actor();
		actor1.setNombre("Blas Blau");
		actor1.setNacionalidad("Espa�a");
		actor1.setAñoNacimiento(1983);

		Actor actor2 = new Actor();
		actor2.setNombre("Laura Pozo");
		actor2.setNacionalidad("Italia");
		actor2.setAñoNacimiento(1981);

		Actor actor3 = new Actor();
		actor3.setNombre("Marcel Cade");
		actor3.setNacionalidad("Suiza");
		actor3.setAñoNacimiento(2001);

		Actor actor4 = new Actor();
		actor4.setNombre("Violeta Volo");
		actor4.setNacionalidad("Rusia");
		actor4.setAñoNacimiento(1999);

		Director director = new Director();
		director.setNombre("Sara");
		director.setNacionalidad("Portugal");
		director.setAñoNacimiento(1994);

		Guionista guionista1 = new Guionista();
		guionista1.setNombre("Marco Smith");
		guionista1.setNacionalidad("Reino Unido");
		guionista1.setAñoNacimiento(1988);

		Guionista guionista2 = new Guionista();
		guionista2.setNombre("Cheng Shu");
		guionista2.setNacionalidad("China");
		guionista2.setAñoNacimiento(1977);

		Pelicula peli = new Pelicula();
		peli.setAñoEstreno(2027);
		peli.setDirector(director);
		peli.setGuionista(guionista1);
		peli.getListaActores().add(actor1);
		peli.getListaActores().add(actor2);
		peli.setTitulo("Do you know Joe Blas?");

		Pelicula peli1 = new Pelicula();
		peli1.setAñoEstreno(2027);
		peli1.setDirector(director);
		peli1.setGuionista(guionista2);
		peli1.getListaActores().add(actor1);
		peli1.getListaActores().add(actor2);
		peli1.getListaActores().add(actor3);
		peli1.getListaActores().add(actor4);
		peli1.setTitulo("Muerte en la sombra");

		System.out.println(peli.getListaActores());
		System.out.println(guionista1.getSueldo() + "�, " + guionista1.getNacionalidad());
		peli1.getListaActores().remove(2);
		peli.getListaActores().add(actor3);

		System.out.println(peli.getListaActores());
		System.out.println(peli1.getListaActores());
	}

	// SI TUVIESE UN SCANNER TENDRIA QUE CERRARLO ANTES DE ESTE METODO
	// no hace falta poner .seguido de algo para poner el siguiente metodo solo hace
	// falta poner el metodo                
//	private static Actor crearActor(String nombre, String nacionalidad, Integer a�o) {
//		Actor x= new Actor();
//		x.setNombre(nombre);
//		x.setNacionalidad(nacionalidad);
//		x.setA�oNacimiento(a�o);
//		return x;
//}
}
