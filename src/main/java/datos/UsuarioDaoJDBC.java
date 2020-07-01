package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dominio.Usuario;

public class UsuarioDaoJDBC {
	
	private final String SQL_SELECT = "SELECT * FROM Usuario";

	private final String SQL_SELECT_BY_ID = "SELECT (nombres, apPaterno, apMaterno, dni, telfCell, telfFijo, idCiudad, "
			+ "idDistrito, direccion, email, pass) WHERE idUsuario = ?";

	private final String SQL_INSERT = "INSERT INTO Usuario(nombres, apPaterno, apMaterno, dni, telfCell, telfFijo, "
			+ "idCiudad, idDistrito, direccion, email, pass ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	private final String SQL_UPDATE = "UPDATE Pedido SET Usuario(nombres = ?, apPaterno = ?, apMaterno = ?, dni = ?, "
			+ "telfCell = ?, telfFijo = ?, idCiudad = ?, idDistrito = ?, direccion = ?, email = ?, pass = ?"
			+ " WHERE idUsuario = ?)";

	private final String SQL_DELETE = "DELETE FROM Usuario WHERE idUsuario = ?";

	public List<Usuario> listarTodo() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Usuario> usuarios = new ArrayList<>();

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_SELECT);

			rs = ps.executeQuery();

			while (rs.next()) {

				int idUsuario = rs.getInt("idUsuario");
				String nombres = rs.getString("nombres");
				String apPaterno = rs.getString("apPaterno");
				String apMaterno = rs.getString("apMaterno");
				int dni = rs.getInt("dni");
				int telfCell = rs.getInt("telfCell");
				int telfFijo = rs.getInt("telfFijo");
				int idCiudad = rs.getInt("idCiudad");
				int idDistrito = rs.getInt("idDistrito");
				String direccion = rs.getString("direccion");
				String email = rs.getString("email");
				String pass = rs.getString("pass");

				Usuario usuario = new Usuario(idUsuario, nombres, apPaterno, apMaterno, dni, telfCell, telfFijo, idCiudad, idDistrito, direccion, email, pass);

				usuarios.add(usuario);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		return usuarios;
	}

	public Usuario encontrarId(Usuario usuario) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_SELECT_BY_ID);
			ps.setInt(1, usuario.getIdUsuario());

			rs = ps.executeQuery();

			rs.absolute(1);

			String nombres = rs.getString("nombres");
			String apPaterno = rs.getString("apPaterno");
			String apMaterno = rs.getString("apMaterno");
			int dni = rs.getInt("dni");
			int telfCell = rs.getInt("telfCell");
			int telfFijo = rs.getInt("telfFijo");
			int idCiudad = rs.getInt("idCiudad");
			int idDistrito = rs.getInt("idDistrito");
			String direccion = rs.getString("direccion");
			String email = rs.getString("email");
			String pass = rs.getString("pass");

			usuario.setNombres(nombres);
			usuario.setApPaterno(apPaterno);
			usuario.setApMaterno(apMaterno);
			usuario.setDni(dni);
			usuario.setTelfCell(telfCell);
			usuario.setTelfFijo(telfFijo);
			usuario.setIdCiudad(idCiudad);
			usuario.setIdDistrito(idDistrito);
			usuario.setDireccion(direccion);
			usuario.setEmail(email);
			usuario.setPass(pass);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		return usuario;
	}

	public void insertar(Usuario usuario) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_INSERT);
			ps.setString(1, usuario.getNombres());
			ps.setString(2, usuario.getApPaterno());
			ps.setString(3, usuario.getApMaterno());
			ps.setInt(4, usuario.getDni());
			ps.setInt(5, usuario.getTelfCell());
			ps.setInt(6, usuario.getTelfFijo());
			ps.setInt(7, usuario.getIdCiudad());
			ps.setInt(8, usuario.getIdDistrito());
			ps.setString(9, usuario.getDireccion());
			ps.setString(10, usuario.getEmail());
			ps.setString(11, usuario.getPass());			

			rs = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}
		System.out.println("Usuario Creado");
	}

	public void modificar(Usuario usuario) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_UPDATE);
			ps.setString(1, usuario.getNombres());
			ps.setString(2, usuario.getApPaterno());
			ps.setString(3, usuario.getApMaterno());
			ps.setInt(4, usuario.getDni());
			ps.setInt(5, usuario.getTelfCell());
			ps.setInt(6, usuario.getTelfFijo());
			ps.setInt(7, usuario.getIdCiudad());
			ps.setInt(8, usuario.getIdDistrito());
			ps.setString(9, usuario.getDireccion());
			ps.setString(10, usuario.getEmail());
			ps.setString(11, usuario.getPass());
			ps.setInt(12, usuario.getIdUsuario());

			rs = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		System.out.println("Usuario Actualizado");
	}

	public void eliminar(Usuario usuario) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_DELETE);
			ps.setInt(1, usuario.getIdUsuario());

			rs = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		System.out.println("Usuario Eliminado");
	}

}
