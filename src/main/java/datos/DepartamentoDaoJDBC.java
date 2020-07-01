package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dominio.Departamento;

public class DepartamentoDaoJDBC {
	// Querys SQL

	private final String SQL_SELECT = "SELECT * FROM departamento";

	private final String SQL_SELECT_BY_ID = "SELECT Departamento FROM Departamento WHERE IdDepartamento = ?";

	private final String SQL_INSERT = "INSERT INTO Departamento (Departamento) VALUES (?)";

	private final String SQL_UPDATE = "UPDATE Departamento SET Departamento = ? WHERE IdCliente = ?";

	private final String SQL_DELETE = "DELETE FROM Departamento WHERE IdDepartamento = ?";

	// Metodo para obtener todos los datos de la tabla
	public List<Departamento> listarTodo() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Departamento depa = null;

		List<Departamento> departamentos = new ArrayList<>();

		try {
			conn = Conexion.getConnection();

			ps = conn.prepareStatement(SQL_SELECT);

			rs = ps.executeQuery();

			while (rs.next()) {

				int idDepartamento = rs.getInt("idDepartamento");
				String departamento = rs.getString("Departamento");

				depa = new Departamento(idDepartamento, departamento);

				departamentos.add(depa);
			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		} finally {

			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);

		}

		return departamentos;
	}

	// Metodo para obtener datos por el ID
	public Departamento encontrarId(Departamento depa) {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Conexion.getConnection();

			// Variable donde asignamos la consulta
			ps = conn.prepareStatement(SQL_SELECT_BY_ID);
			// En el valor "?" de la consulta colocamos el Id ingresado
			ps.setInt(1, depa.getIdDepartamento());

			rs = ps.executeQuery();

			rs.absolute(1);

			// Variables que almacenan los datos de la consulta
			String departamento = rs.getString("Departamento");
			
			//Asignamos las variables
			depa.setDepartamento(departamento);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);

		}
		
		return depa;
	}
	
	//Metodo para Insertar Datos
	
	public void insertar(Departamento depa) {
		Connection conn= null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = Conexion.getConnection();
			
			ps = conn.prepareStatement(SQL_INSERT);
			ps.setString(1, depa.getDepartamento());			
			
			rs = ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}
		
		System.out.print("Departamento Creado");	
		
	}
	
	//Metodo para Modificar un Registro
	
	public void modificar(Departamento departamento) {
		
		 Connection conn = null;
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 
		 try {
			 conn = Conexion.getConnection();
			 
			 ps= conn.prepareStatement(SQL_UPDATE);
			 ps.setString(1, departamento.getDepartamento());
			 ps.setInt(2, departamento.getIdDepartamento());
			 
			 rs= ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
			
		}
		 System.out.println("Departamento Actualizado");
	}
	
	public void eliminar(Departamento departamento) {
		
		Connection conn= null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = Conexion.getConnection();
			
			ps = conn.prepareStatement(SQL_DELETE);
			ps.setInt(1, departamento.getIdDepartamento());
			
			rs = ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			Conexion.close(conn);
			Conexion.close(ps);
			Conexion.close(rs);
		}
		
		System.out.println("Departamento eliminado");
	}
}
