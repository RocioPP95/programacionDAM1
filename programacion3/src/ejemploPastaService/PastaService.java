package ejemploPastaService;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

		// 1º abrir conexion (asegurandonos que luego se cierra)
		try (Connection conn = abrirConexion()) {

			// 2º escribir SQL con una cadena con parámetros

			String sql = "INSERT INTO divisas VALUES(?,?, ?,?)";

			// 3º crear preparedStatement a partir de la conexion

			PreparedStatement pstmt = conn.prepareStatement(sql);

			// 4º Indicamos los valores de los parámetros

			pstmt.setString(1, divisa.getCodigo());
			pstmt.setString(2, divisa.getDescripcion());
			pstmt.setString(3, divisa.getPais());
			pstmt.setBigDecimal(4, divisa.getConversion());

			// 5º ejecutar
			pstmt.execute();
		}
	}

	public void actualizarConversionDivisa(String codigo, BigDecimal factorNuevo) throws SQLException {
		// 1º abrir conexion (asegurandonos que luego se cierra)
		try (Connection conn = abrirConexion()) {

			// 2º escribir SQL con una cadena con parámetros

			String sql = "update divisas set cambio_euro =? where cod_divisa=?";

			// 3º crear preparedStatement a partir de la conexion

			PreparedStatement pstmt = conn.prepareStatement(sql);

			// 4º Indicamos los valores de los parámetros

			pstmt.setBigDecimal(1, factorNuevo);
			pstmt.setString(2, codigo);

			// 5º ejecutar
			pstmt.execute();
		}

	}

	// si hay algun error en bbdd lanza divisaException
	// si no existe el codigo divisa indicado lanza DivisaNotFoundException
	public Integer borrarDivisa(String codigo) throws DivisaException, DivisaNotFoundException {

		// 1º abrir conexion (asegurandonos que luego se cierra)
		try (Connection conn = abrirConexion()) {

			// 2º escribir SQL con una cadena con parámetros

			String sql = "delete from divisas where cod_divisa=?";

			// 3º crear preparedStatement a partir de la conexion

			PreparedStatement pstmt = conn.prepareStatement(sql);

			// 4º Indicamos los valores de los parámetros

			pstmt.setString(1, codigo);

			// 5º ejecutar
			Integer cantidadBorrada = pstmt.executeUpdate();
			if (cantidadBorrada == 0) {
				throw new DivisaNotFoundException("No existe la divisa con código " + codigo);
			}
			return cantidadBorrada;
		} catch (SQLException e) {
			throw new DivisaException("Error", e);
		}
	}

	// Devuelve todas las divisas que empiecen por el filtro indicado
	public List<Divisa> buscarDivisas(String filtro) throws SQLException, DivisaNotFoundException {

		List<Divisa> divisas = new ArrayList<>();

		try (Connection conn = abrirConexion()) {
			String sql = "select * from divisas where des_divisa like ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, filtro + "%");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next() == true) {
				Divisa divisa = new Divisa();
				divisas.add(divisa);
				String codDivisa = rs.getString("cod_divisa");
				String desDivisa = rs.getString("des_divisa");
				String pais = rs.getString("pais");
				BigDecimal cambioEuro = rs.getBigDecimal("cambio_euro");
				divisa.setCodigo(codDivisa);
				divisa.setDescripcion(desDivisa);
				divisa.setPais(pais);
				divisa.setConversion(cambioEuro);

			}
			if (divisas.size() == 0) {
				throw new DivisaNotFoundException("No hay divisas con el filtro indicado");

			}
			return divisas;

		}

	}

	// Devuelve la divisa de bbdd con el codigo indicado
	// si no existe lanza DivisaNotFoundException
	// si hay algun error en bbss lanza DivisaException
	public Divisa consultarDivisa(String codigo) throws DivisaException, DivisaNotFoundException {

		try (Connection conn = abrirConexion()) {
			String sql = "select * from divisas where cod_divisa = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, codigo);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next() == true) {
				Divisa divisa = new Divisa();
				BigDecimal cambioEuro = rs.getBigDecimal("cambio_euro");
				divisa.setCodigo(rs.getString("cod_divisa"));
				divisa.setDescripcion(rs.getString("des_divisa"));
				divisa.setPais(rs.getString("pais"));
				divisa.setConversion(rs.getBigDecimal("cambio_euro"));
				return divisa;
			}
			throw new DivisaNotFoundException("No hay divisa " + codigo);

		} catch (SQLException e) {
			throw new DivisaException("Error en BBDD", e);
		}

	}
}
