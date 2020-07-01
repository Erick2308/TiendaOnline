package datos;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dominio.Departamento;

public class DepartamentoDaoJDBCTest {
	Departamento departamento;
	DepartamentoDaoJDBC depaJDBC;
	List<Departamento> departamentos;

	@Test
	public void testListarTodo() {
		departamentos = depaJDBC.listarTodo();
		
		assertNotNull(departamentos);
	}

	@Test
	public void testEncontrarId() {
		Departamento dDepa = new Departamento(2);
		
		departamento = depaJDBC.encontrarId(dDepa);
		
		assertNotNull(departamento);
	}

}
