package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dominio.Pedido_Producto;;

public class Pedido_ProductoDaoJDBC {

	private final String SQL_SELECT = "SELECT * FROM Pedido_Producto";

	private final String SQL_SELECT_BY_ID = "SELECT (idPedido, idProducto) WHERE idPedido_Producto = ?";

	private final String SQL_INSERT = "INSERT INTO Pedido_Producto(idPedido, idProducto) VALUES (?, ?)";

	private final String SQL_UPDATE = "UPDATE Pedido_Producto SET Pedido_Producto(idPedido = ?, idProducto = ? WHERE idPedido_Producto = ?)";

	private final String SQL_DELETE = "DELETE FROM Pedido_Producto WHERE idPedido_Producto = ?";

	public List<Pedido_Producto> listarTodo() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Pedido_Producto> pedidos_productos = new ArrayList<>();

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_SELECT);

			rs = ps.executeQuery();

			while (rs.next()) {

				int idPedido_Producto = rs.getInt("idPedido_Producto");
				int idPedido = rs.getInt("idPedido");
				int idProducto = rs.getInt("idProducto");

				Pedido_Producto pedido_producto = new Pedido_Producto(idPedido_Producto, idPedido, idProducto);

				pedidos_productos.add(pedido_producto);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		return pedidos_productos;
	}

	public Pedido_Producto encontrarId(Pedido_Producto pedido_producto) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_SELECT_BY_ID);
			ps.setInt(1, pedido_producto.getIdPedido_Producto());

			rs = ps.executeQuery();

			rs.absolute(1);

			int idPedido = rs.getInt("idPedido");
			int idProducto = rs.getInt("idProducto");

			pedido_producto.setIdPedido(idPedido);
			pedido_producto.setIdProducto(idProducto);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		return pedido_producto;
	}

	public void insertar(Pedido_Producto pedido_producto) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_INSERT);
			ps.setInt(1, pedido_producto.getIdPedido());
			ps.setInt(2, pedido_producto.getIdProducto());

			rs = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}
		System.out.println("Pedido_Producto Insertado");
	}

	public void modificar(Pedido_Producto pedido_producto) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_UPDATE);
			ps.setInt(1, pedido_producto.getIdPedido());
			ps.setInt(2, pedido_producto.getIdProducto());
			ps.setInt(3, pedido_producto.getIdPedido_Producto());

			rs = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		System.out.println("Pedido_Producto Actualizado");
	}

	public void eliminar(Pedido_Producto pedido_producto) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_DELETE);
			ps.setInt(1, pedido_producto.getIdPedido_Producto());

			rs = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		System.out.println("Pedido_Producto Eliminado");
	}

}
