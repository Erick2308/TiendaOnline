package dominio;

public class Usuario {
	
	int idUsuario;
	String nombres;
	String apPaterno;
	String apMaterno;
	int dni;
	int telfCell;
	int telfFijo;
	int idCiudad;
	int idDistrito;
	String direccion;
	String email;
	String pass;
	
	//Constructores
	public Usuario() {
		
	}

	public Usuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Usuario(String nombres, String apPaterno, String apMaterno, int dni, int telfCell, int telfFijo,
			int idCiudad, int idDistrito, String direccion, String email, String pass) {
		this.nombres = nombres;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.dni = dni;
		this.telfCell = telfCell;
		this.telfFijo = telfFijo;
		this.idCiudad = idCiudad;
		this.idDistrito = idDistrito;
		this.direccion = direccion;
		this.email = email;
		this.pass = pass;
	}

	public Usuario(int idUsuario, String nombres, String apPaterno, String apMaterno, int dni, int telfCell,
			int telfFijo, int idCiudad, int idDistrito, String direccion, String email, String pass) {
		super();
		this.idUsuario = idUsuario;
		this.nombres = nombres;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.dni = dni;
		this.telfCell = telfCell;
		this.telfFijo = telfFijo;
		this.idCiudad = idCiudad;
		this.idDistrito = idDistrito;
		this.direccion = direccion;
		this.email = email;
		this.pass = pass;
	}
	
	//Metodos Getters & Setters

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelfCell() {
		return telfCell;
	}

	public void setTelfCell(int telfCell) {
		this.telfCell = telfCell;
	}

	public int getTelfFijo() {
		return telfFijo;
	}

	public void setTelfFijo(int telfFijo) {
		this.telfFijo = telfFijo;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	//Metodo ToString
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombres=" + nombres + ", apPaterno=" + apPaterno + ", apMaterno="
				+ apMaterno + ", dni=" + dni + ", telfCell=" + telfCell + ", telfFijo=" + telfFijo + ", idCiudad="
				+ idCiudad + ", idDistrito=" + idDistrito + ", direccion=" + direccion + ", email=" + email + ", pass="
				+ pass + "]";
	}
	
	
	
	
	
	
}