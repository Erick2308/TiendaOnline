package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.DepartamentoDaoJDBC;
import datos.UsuarioDaoJDBC;
import dominio.Departamento;
import dominio.Usuario;

@WebServlet("/registro")
public class ServletRegistro extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		
		String nombres = req.getParameter("nombres");
		String apPaterno = req.getParameter("apPaterno");
		String apMaterno = req.getParameter("apMaterno");
		int dni = Integer.parseInt(req.getParameter("dni"));
		int telfCell = Integer.parseInt(req.getParameter("telfCell"));
		int telfFijo = Integer.parseInt(req.getParameter("telfFijo"));
		int idCiudad = Integer.parseInt(req.getParameter("departamento"));
		int idDistrito = Integer.parseInt(req.getParameter("distrito"));
		String direccion = req.getParameter("direccion");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		Usuario usuario = new Usuario(nombres, apPaterno, apMaterno, dni, telfCell, telfFijo, idCiudad, idDistrito, direccion, email, pass);
		UsuarioDaoJDBC registrar = new UsuarioDaoJDBC();
		
		registrar.insertar(usuario);
		
		
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		
		DepartamentoDaoJDBC departamentoDAO = new DepartamentoDaoJDBC(); 
		
		try {
			List<Departamento> departamentos = departamentoDAO.listarTodo();
			req.setAttribute("departamentos", departamentos);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("registro.jsp");
			dispatcher.forward(req, res);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new ServletException(e);
		}		
		
	}

}
