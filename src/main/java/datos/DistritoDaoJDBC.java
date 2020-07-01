package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dominio.Distrito;

public class DistritoDaoJDBC {

	private final String SQL_SELECT = "SELECT * FROM Distrito";

	private final String SQL_SELECT_BY_ID = "SELECT (distrito, idCiudad) WHERE idDistrito = ?";

	private final String SQL_INSERT = "INSERT INTO Distrito(distrito, idCiudad) VALUES (?, ?)";

	private final String SQL_UPDATE = "UPDATE Distrito SET Distrito(distrito = ?, idCiudad = ? WHERE idDistrito = ?)";

	private final String SQL_DELETE = "DELETE FROM Distrito WHERE idDistrito = ?";

	public List<Distrito> listarTodo() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Distrito> distritos = new ArrayList<>();

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_SELECT);

			rs = ps.executeQuery();

			while (rs.next()) {

				int idDistrito = rs.getInt("idDistrito");
				String distrito = rs.getString("distrito");
				int idCiudad = rs.getInt("idCiudad");

				Distrito uDistrito = new Distrito(idDistrito, distrito, idCiudad);

				distritos.add(uDistrito);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		return distritos;
	}

	public Distrito encontrarId(Distrito uDistrito) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_SELECT_BY_ID);
			ps.setInt(1, uDistrito.getIdDistrito());

			rs = ps.executeQuery();

			rs.absolute(1);

			String distrito = rs.getString("distrito");
			int idCiudad = rs.getInt("idCiudad");

			uDistrito.setDistrito(distrito);
			uDistrito.setIdCiudad(idCiudad);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		return uDistrito;
	}

	public void insertar(Distrito distrito) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_INSERT);
			ps.setString(1, distrito.getDistrito());
			ps.setInt(2, distrito.getIdCiudad());

			rs = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}
		System.out.println("Distrito Insertado");
	}

	public void modificar(Distrito distrito) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_UPDATE);
			ps.setString(1, distrito.getDistrito());
			ps.setInt(2, distrito.getIdCiudad());
			ps.setInt(3, distrito.getIdDistrito());

			rs = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}
		
		System.out.println("Distrito Actualizado");
	}
	
	public void eliminar(Distrito distrito) {
		Connection conn =null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = Conexion.getConnection();
			
			ps = conn.prepareStatement(SQL_DELETE);
			ps.setInt(1, distrito.getIdDistrito());
			
			rs = ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}
		
		System.out.println("Distrito Eliminado");
	}

}
