package ejemploPastaService;

import java.sql.SQLException;

public class App {

	public static void main(String[] args) {

		PastaService service= new PastaService();
		try {
			service.abrirConexion();
			System.out.println("Todo ok");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
