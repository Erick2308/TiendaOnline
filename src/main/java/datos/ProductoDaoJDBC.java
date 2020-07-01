package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dominio.Producto;

public class ProductoDaoJDBC {

	private final String SQL_SELECT = "SELECT * FROM Producto";

	private final String SQL_SELECT_BY_ID = "SELECT (idProducto, nombre, descripcion, imgProducto, precio) WHERE idProducto = ?";

	private final String SQL_INSERT = "INSERT INTO Pedido(nombre, descripcion, imgProducto, precio) VALUES (?, ?, ?, ?)";

	private final String SQL_UPDATE = "UPDATE Pedido SET Pedido(nombre = ?, descripcion = ?, imgProducto = ?, precio = ? WHERE idProducto = ?)";

	private final String SQL_DELETE = "DELETE FROM Pedido WHERE idProducto = ?";

	public List<Producto> listarTodo() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Producto> productos = new ArrayList<>();

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_SELECT);

			rs = ps.executeQuery();

			while (rs.next()) {

				int idProducto = rs.getInt("idProducto");
				String nombre = rs.getString("nombre");
				String descripcion = rs.getString("descripcion");
				String imgProducto = rs.getString("imgProducto");
				float precio = rs.getFloat("precio");

				Producto producto = new Producto(idProducto, nombre, descripcion, imgProducto, precio);

				productos.add(producto);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		return productos;
	}

	public Producto encontrarId(Producto producto) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_SELECT_BY_ID);
			ps.setInt(1, producto.getIdProducto());

			rs = ps.executeQuery();

			rs.absolute(1);

			String nombre = rs.getString("nombre");
			String descripcion = rs.getString("descripcion");
			String imgProducto = rs.getString("imgProducto");
			float precio = rs.getFloat("precio");

			producto.setNombre(nombre);
			producto.setDescripcion(descripcion);
			producto.setImgProducto(imgProducto);
			producto.setPrecio(precio);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		return producto;
	}

	public void insertar(Producto producto) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_INSERT);
			ps.setString(1, producto.getNombre());
			ps.setString(2, producto.getDescripcion());
			ps.setString(3, producto.getImgProducto());
			ps.setFloat(4, producto.getPrecio());

			rs = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}
		System.out.println("Producto Insertado");
	}

	public void modificar(Producto producto) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_UPDATE);
			ps.setString(1, producto.getNombre());
			ps.setString(2, producto.getDescripcion());
			ps.setString(3, producto.getImgProducto());
			ps.setFloat(4, producto.getPrecio());
			ps.setInt(5, producto.getIdProducto());

			rs = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		System.out.println("Producto Actualizado");
	}

	public void eliminar(Producto producto) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_DELETE);
			ps.setInt(1, producto.getIdProducto());

			rs = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}

		System.out.println("Producto Eliminado");
	}

}
