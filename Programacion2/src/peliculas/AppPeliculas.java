package peliculas;

public class AppPeliculas {
	public static void main(String[] args) {

		Actor actor1 = new Actor();
		actor1.setNombre("Blas Blau");
		actor1.setNacionalidad("Espa�a");
		actor1.setA�oNacimiento(1983);

		Actor actor2 = new Actor();
		actor2.setNombre("Laura Pozo");
		actor2.setNacionalidad("Italia");
		actor2.setA�oNacimiento(1981);

		Actor actor3 = new Actor();
		actor3.setNombre("Marcel Cade");
		actor3.setNacionalidad("Suiza");
		actor3.setA�oNacimiento(2001);

		Actor actor4 = new Actor();
		actor4.setNombre("Violeta Volo");
		actor4.setNacionalidad("Rusia");
		actor4.setA�oNacimiento(1999);

		Director director = new Director();
		director.setNombre("Sara");
		director.setNacionalidad("Portugal");
		director.setA�oNacimiento(1994);

		Guionista guionista1 = new Guionista();
		guionista1.setNombre("Marco Smith");
		guionista1.setNacionalidad("Reino Unido");
		guionista1.setA�oNacimiento(1988);

		Guionista guionista2 = new Guionista();
		guionista2.setNombre("Cheng Shu");
		guionista2.setNacionalidad("China");
		guionista2.setA�oNacimiento(1977);

		Pelicula peli = new Pelicula();
		peli.setA�oEstreno(2027);
		peli.setDirector(director);
		peli.setGuionista(guionista1);
		peli.getListaActores().add(actor1);
		peli.getListaActores().add(actor2);
		peli.setTitulo("Do you know Joe Blas?");

		Pelicula peli1 = new Pelicula();
		peli1.setA�oEstreno(2027);
		peli1.setDirector(director);
		peli1.setGuionista(guionista2);
		peli1.getListaActores().add(actor1);
		peli1.getListaActores().add(actor2);
		peli1.getListaActores().add(actor3);
		peli1.getListaActores().add(actor4);
		peli1.setTitulo("Muerte en la sombra");

		System.out.println(peli.getListaActores());
		System.out.println(guionista1.getSueldo() + " " + guionista1.getNacionalidad());
		peli1.getListaActores().remove(2);
		peli.getListaActores().add(actor3);

		System.out.println(peli.getListaActores());
		System.out.println(peli1.getListaActores());
	}
}
