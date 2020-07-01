package datos;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {

	/*
	 * private final String user = "root";
	 * 
	 * private final String password = "SirconVS20++";
	 * 
	 * // private final String urlConeccion = //
	 * "jdbc:mysql://localhost:3306/carteleradb?zeroDateTimeBehavior=convertToNull";
	 * 
	 * private final String url =
	 * "jdbc:mysql://localhost:3306/carteleradb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
	 * 
	 * private final String driverClass = "com.mysql.jdbc.Driver";
	 * 
	 * private Connection conn;
	 * 
	 * public static Conexion() {
	 * 
	 * try { Class.forName(driverClass); conn = DriverManager.getConnection(url,
	 * user, password); if (conn != null) { System.out.println("Coneccion exitosa");
	 * }
	 * 
	 * } catch (ClassNotFoundException | SQLException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); }
	 * 
	 * return conn;
	 * 
	 * }
	 * 
	 * public Connection getConnection() {
	 * 
	 * return conn; }
	 */

	// URL para acceder a la BD
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/db_tiendaonline?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";

	// Usuario y Password de la BD
	private static final String user = "root";
	private static final String pass = "SirconVS20++";

	// Metodo para establecer conexion de la BD
	public static DataSource getDataSource() {

		// Metodo de Commons dbcp
		BasicDataSource ds = new BasicDataSource();

		// Especificamos nuestra URL, usuario y password de la BD
		ds.setUrl(JDBC_URL);
		ds.setUsername(user);
		ds.setPassword(pass);

		// Indicamos el tamaño de nuestro pool de Conexiones
		ds.setInitialSize(50);

		// Retornamos el resultado del obj 
		return ds;
	}

	// Metodo para obtener la Conexion
	public static Connection getConnection()
	  throws SQLException {
	  
	  //Lamar al metodo getDataSource, donde esta almacenado la url, usuario y password de la BD
	  
	 return getDataSource().getConnection(); }

	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
	}

	public static void close(PreparedStatement ps) {
		try {
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
	}

	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
	}

}
