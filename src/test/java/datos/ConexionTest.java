package datos;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class ConexionTest {
	
	Conexion con;

	@Test
	public void testGetConnection() throws SQLException {
		
		assertNotNull(Conexion.getConnection());
		
	}

}
