package dominio;

public class Distrito {
	
	int idDistrito;
	String distrito;
	int idCiudad;
	
	//Constructores
	public Distrito() {
		
	}

	public Distrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public Distrito(String distrito, int idCiudad) {
		this.distrito = distrito;
		this.idCiudad = idCiudad;
	}

	public Distrito(int idDistrito, String distrito, int idCiudad) {
		this.idDistrito = idDistrito;
		this.distrito = distrito;
		this.idCiudad = idCiudad;
	}

	//Metodos Getters & Setters
	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	//Metodo ToString
	@Override
	public String toString() {
		return "Distrito [idDistrito=" + idDistrito + ", distrito=" + distrito + ", idCiudad=" + idCiudad + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
