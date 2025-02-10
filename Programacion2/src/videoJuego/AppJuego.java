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
		
		
	}
}
