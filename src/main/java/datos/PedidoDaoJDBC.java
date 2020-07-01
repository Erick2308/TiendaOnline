package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dominio.Pedido;

public class PedidoDaoJDBC {
	
	private final String SQL_SELECT = "SELECT * FROM Pedido";

	private final String SQL_SELECT_BY_ID = "SELECT (idUsuario, fechaPedido, montoTotal) WHERE idPedido = ?";

	private final String SQL_INSERT = "INSERT INTO Pedido(idUsuario, montoTotal) VALUES (?, ?)";

	private final String SQL_UPDATE = "UPDATE Pedido SET Pedido(idUsuario = ?, fechaPedido = ?, montoTotal = ? WHERE idPedido = ?)";

	private final String SQL_DELETE = "DELETE FROM Pedido WHERE idPedido = ?";

	public List<Pedido> listarTodo() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Pedido> pedidos = new ArrayList<>();

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_SELECT);

			rs = ps.executeQuery();

			while (rs.next()) {

				int idPedido = rs.getInt("idPedido");
				int idUsuario = rs.getInt("idUsuario");
				Date fechaPedido = rs.getDate("fechaPedido");
				float montoTotal = rs.getFloat("montoTotal");

				Pedido pedido = new Pedido(idPedido, idUsuario, fechaPedido, montoTotal);

				pedidos.add(pedido);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		return pedidos;
	}

	public Pedido encontrarId(Pedido pedido) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_SELECT_BY_ID);
			ps.setInt(1, pedido.getIdPedido());

			rs = ps.executeQuery();

			rs.absolute(1);

			int idUsuario = rs.getInt("idUsuario");
			Date fechaPedido = rs.getDate("fechaPedido");
			float montoTotal = rs.getFloat("montoTotal");

			pedido.setIdUsuario(idUsuario);
			pedido.setFechaPedido(fechaPedido);
			pedido.setMontoTotal(montoTotal);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		return pedido;
	}

	public void insertar(Pedido pedido) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_INSERT);
			ps.setInt(1, pedido.getIdUsuario());
			ps.setFloat(2, pedido.getMontoTotal());

			rs = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}
		System.out.println("Pedido Insertado");
	}

	public void modificar(Pedido pedido) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_UPDATE);
			ps.setInt(1, pedido.getIdUsuario());
			ps.setDate(2, (java.sql.Date) pedido.getFechaPedido());
			ps.setFloat(3, pedido.getMontoTotal());
			ps.setInt(4, pedido.getIdPedido());

			rs = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		System.out.println("Pedido Actualizado");
	}

	public void eliminar(Pedido pedido) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_DELETE);
			ps.setInt(1, pedido.getIdPedido());

			rs = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		System.out.println("Pedido Eliminado");
	}

}
