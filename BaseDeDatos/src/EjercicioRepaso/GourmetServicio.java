package EjercicioRepaso;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GourmetServicio extends Servicio {

	public void insertarProducto(Producto producto) throws ProductoInvalidoException {
		BigDecimal negativo = new BigDecimal(0);
		if (producto.getPrecio().compareTo(negativo) <= 0) {
			throw new ProductoInvalidoException();

		}
		try (Connection conn = abrirConexion()) {

			String sql = "INSERT INTO producto VALUES(?,?, ?,?,?)";

			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, producto.getId());
			pstmt.setString(2, producto.getNombre());
			pstmt.setString(3, producto.getTipo());
			pstmt.setBigDecimal(4, producto.getPrecio());
			pstmt.setBoolean(5, producto.getDisponible());

			pstmt.execute();
		} catch (SQLException e) {
			System.out.println("Error al insertar en BBDD");
		}
	}

	public void intertarProductos(List<Producto> productos) throws ProductoInvalidoException {
		try (Connection conn = abrirConexion()) {

			try {
				conn.setAutoCommit(false);
				for (Producto producto : productos) {

					String sql = "INSERT INTO personas VALUES(?,?, ?,?.?)";

					PreparedStatement pstmt = conn.prepareStatement(sql);

					pstmt.setInt(1, producto.getId());
					pstmt.setString(2, producto.getNombre());
					pstmt.setString(3, producto.getTipo());
					pstmt.setBigDecimal(4, producto.getPrecio());
					pstmt.setBoolean(5, producto.getDisponible());
					pstmt.execute();
				}
				conn.commit();

			} catch (SQLException e) {
				conn.rollback();
				throw e;
			}
		} catch (

		SQLException e) {
			throw new ProductoInvalidoException("Erros insertando en BBDD", e);
		}
	}

	public List<Producto> consultaTipoProductos(String filtro) throws ProductoNoEncontradoException, SQLException {
		List<Producto> productos = new ArrayList<>();

		try (Connection conn = abrirConexion()) {
			String sql = "select * from productos_gourmet where tipo=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, filtro);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next() == true) {
				Producto producto = new Producto();
				productos.add(producto);
				Integer id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String tipo = rs.getString("tipo");
				BigDecimal precio = rs.getBigDecimal("precio");
				Boolean disponible = rs.getBoolean("disponible");
				producto.setId(id);
				producto.setNombre(nombre);
				producto.setTipo(tipo);
				producto.setPrecio(precio);
				producto.setDisponible(disponible);

			}
			if (productos.size() == 0) {
				throw new ProductoNoEncontradoException("No hay productos con el filtro indicado");

			}
			return productos;

		}

	}

	public void eliminaProducto(Integer id) throws ProductoInvalidoException, ProductoNoEncontradoException {

		try (Connection conn = abrirConexion()) {

			String sql = "delete from productos_gourmet where id=?";

			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, id);

			Integer cantidadBorrada = pstmt.executeUpdate();
			if (cantidadBorrada == 0) {
				throw new ProductoNoEncontradoException("No existe el producto con código " + id);
			}

		} catch (SQLException e) {
			throw new ProductoInvalidoException("Error", e);
		}

	}

	public Map<Integer, Producto> consultarProductosDisponibles(String filtro)
			throws SQLException, ProductoNoEncontradoException {
		Map<Integer, Producto> productos = new HashMap<>();

		try (Connection conn = abrirConexion()) {
			String sql = "select * from productos_gourmet where nombre = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, filtro);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next() == true) {
				Producto producto = new Producto();

				Integer id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String tipo = rs.getString("tipo");
				BigDecimal precio = rs.getBigDecimal("precio");
				Boolean disponible = rs.getBoolean("disponible");
				producto.setId(id);
				producto.setNombre(nombre);
				producto.setTipo(tipo);
				producto.setPrecio(precio);
				producto.setDisponible(disponible);
				productos.put(id, producto);
			}
			if (productos.size() == 0) {
				throw new ProductoNoEncontradoException("No hay productos con el filtro indicado");

			}
			return productos;

		}
	}

}
