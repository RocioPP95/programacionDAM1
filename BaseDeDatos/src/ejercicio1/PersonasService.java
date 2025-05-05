package ejercicio1;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PersonasService extends Service {

	public Persona consultarPersona(String dni) throws PersonaNotFoundException, PersonaException {
		// 1� abrir conexion (asegurandonos que luego se cierra)
		try (Connection conn = abrirConexion()) {

			// 2� escribir SQL con una cadena con par�metros

			String sql = "select * from personas where dni=? ";

			// 3� crear preparedStatement a partir de la conexion

			PreparedStatement pstmt = conn.prepareStatement(sql);

			// 4� Indicamos los valores de los par�metros

			pstmt.setString(1, dni);
			// 5� ejecutar
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				insertar(rs);
			}
			throw new PersonaNotFoundException("No hay persona con dni " + dni);
		} catch (SQLException e) {
			throw new PersonaException("Error en BBDD", e);
		}

	}

	public List<Persona> buscarPersonas(String filtro) throws PersonaNotFoundException, PersonaException {
		List<Persona> personas = new ArrayList<>();

		try (Connection conn = abrirConexion()) {
			String sql = "select * from personas where nombre like ? or apellidos like ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + filtro + "%");
			pstmt.setString(2, "%" + filtro + "%");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				personas.add(insertar(rs));

			}
			if (personas.size() == 0) {
				throw new PersonaNotFoundException("No hay personas con el filtro indicado");

			}
			return personas;

		} catch (SQLException e) {
			throw new PersonaException();
		}

	}

	private Persona insertar(ResultSet rs) throws SQLException {
		Persona persona = new Persona();
		persona.setDni(rs.getString("dni"));
		persona.setNombre(rs.getString("nombre"));
		persona.setApellidos(rs.getString("apellidos"));
		persona.setFechaNacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
		return persona;

	}

	public void insertarPersona(Persona persona) {

		// 1� abrir conexion (asegurandonos que luego se cierra)
		try (Connection conn = abrirConexion()) {

			// 2� escribir SQL con una cadena con par�metros

			String sql = "INSERT INTO personas VALUES(?,?, ?,?)";

			// 3� crear preparedStatement a partir de la conexion

			PreparedStatement pstmt = conn.prepareStatement(sql);

			// 4� Indicamos los valores de los par�metros

			pstmt.setString(1, persona.getDni());
			pstmt.setString(2, persona.getNombre());
			pstmt.setString(3, persona.getApellidos());
			pstmt.setDate(4, Date.valueOf(persona.getFechaNacimiento()));

			// 5� ejecutar
			pstmt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void actualizarPersona(Persona persona) throws PersonaException, PersonaNotFoundException {
		try(Connection conn = abrirConexion()){
			String sql = "UPDATE PERSONAS SET NOMBRE = ?, APELLIDOS = ?, FECHA_NACIMIENTO = ? WHERE DNI = ? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, persona.getNombre());
			pstmt.setString(2, persona.getApellidos());
			pstmt.setDate(3, Date.valueOf(persona.getFechaNacimiento()));
			pstmt.setString(4, persona.getDni());
			Integer numeroActualizados =pstmt.executeUpdate();
			if (numeroActualizados==0) {
				throw new PersonaNotFoundException("No existe persona con ese dni");
				
			}
		}
		catch(SQLException e) {
			throw new PersonaException("Error actualizando en BBDD", e);
		}
		
	}
	
	
	public  void borrarPersona(String dni) throws PersonaException, PersonaNotFoundException {
		try(Connection conn = abrirConexion()){
			String sql = "DELETE FROM PERSONAS WHERE DNI = ? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dni);
			Integer registrosAfectados= pstmt.executeUpdate();
			if (registrosAfectados ==0) {
				throw new PersonaNotFoundException("No existe persona con ese dni");
				
			}
		}
		catch(SQLException e) {
			throw new PersonaException("Error borrando en BBDD", e);
		}
		
	}


}
