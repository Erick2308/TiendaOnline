package dominio;

public class Departamento {
	
	int idDepartamento;
	String departamento;
	
	//Constructor
	
	public Departamento() {
		
	}

	//Constructores
	public Departamento(int idDepartamento) {		
		this.idDepartamento = idDepartamento;
	}
	
	public Departamento(String departamento) {		
		this.departamento = departamento;
	}

	public Departamento(int idDepartamento, String departamento) {		
		this.idDepartamento = idDepartamento;
		this.departamento = departamento;
	}

	//Metodos Getters & Setters
	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	//Metodo ToString
	@Override
	public String toString() {
		return "Departamento [idDepartamento=" + idDepartamento + ", Departamento=" + departamento + "]";
	}
	
	
	
	
	
	
	

}
