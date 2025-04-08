package ejemploPastaService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PastaService {

	public Connection abrirConexion() throws SQLException {
		String user = "ejercicios";
		String pass = "ejercicios";
		String url = "jdbc:oracle:thin:@//localhost:1521/XE ";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {

			System.out.println("La clase del driver no existe . revisa si has incluido la libreria");
			throw new RuntimeException("Clase del driver no existe", e);
		}

		Connection conn = DriverManager.getConnection(url, user, pass);
		return conn;

	}
}
