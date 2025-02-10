package videoJuego;

public class AppJuego {
	public static void main(String[] args) {
		Jugador rocio = new Jugador();
		EquipoCombate amarillo= new EquipoCombate();
		rocio.setEquipoCombate(amarillo);
		
		Asesino jorge= new Asesino("jorge", "123");
		amarillo.getListaPersonajes().add(jorge);
		Asesino juan= new Asesino("juan", "345");
		amarillo.getListaPersonajes().add(juan);
		Asesino fran= new Asesino("fran", "111");
		amarillo.getListaPersonajes().add(fran);
		
		Parasito blas= new Parasito("Blas","B69");
		
		System.out.println(blas.toString());
		
		
		amarillo.getListaPersonajes().add(blas);
		
		Integer puntosfinal=amarillo.sumarPuntos();
		System.out.println(puntosfinal +" puntos final");
		
		if (amarillo.comprobarMaxPersonajes(blas)) {
			amarillo.getListaPersonajes().add(blas);
		}
		
		System.out.println(amarillo.getListaPersonajes());
		
		Parasito maria = new Parasito("maria", "35b");
		Parasito ana= new Parasito("ana","87y");
		
		if (amarillo.comprobarMaxPersonajes(maria)) {
			amarillo.getListaPersonajes().add(maria);	
	
			}
		if (amarillo.comprobarMaxPersonajes(ana)) {
			amarillo.getListaPersonajes().add(ana);
			
		}
			
		
		System.out.println(amarillo.getListaPersonajes());
		System.out.println(amarillo.sumarPuntos()+" puntos final");
	}
}
