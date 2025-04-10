package ejemploPastaService;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

	public void crearDivisa(Divisa divisa) throws SQLException {

		// 1� abrir conexion (asegurandonos que luego se cierra)
		try (Connection conn = abrirConexion()) {

			// 2� escribir SQL con una cadena con par�metros

			String sql = "INSERT INTO divisas VALUES(?,?, ?,?)";

			// 3� crear preparedStatement a partir de la conexion

			PreparedStatement pstmt = conn.prepareStatement(sql);

			// 4� Indicamos los valores de los par�metros

			pstmt.setString(1, divisa.getCodigo());
			pstmt.setString(2, divisa.getDescripcion());
			pstmt.setString(3, divisa.getPais());
			pstmt.setBigDecimal(4, divisa.getConversion());

			// 5� ejecutar
			pstmt.execute();
		}
	}

	public void actualizarConversionDivisa(String codigo, BigDecimal factorNuevo) throws SQLException {
		// 1� abrir conexion (asegurandonos que luego se cierra)
		try (Connection conn = abrirConexion()) {

			// 2� escribir SQL con una cadena con par�metros

			String sql = "update divisas set cambio_euro =? where cod_divisa=?";

			// 3� crear preparedStatement a partir de la conexion

			PreparedStatement pstmt = conn.prepareStatement(sql);

			// 4� Indicamos los valores de los par�metros

			pstmt.setBigDecimal(1, factorNuevo);
			pstmt.setString(2, codigo);

			// 5� ejecutar
			pstmt.execute();
		}

	}
}
