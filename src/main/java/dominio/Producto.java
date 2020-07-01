package dominio;

public class Producto {
	
	int idProducto;
	String nombre;
	String descripcion;
	String imgProducto;
	float precio;
	
	//Constructores
	public Producto() {
		
	}

	public Producto(int idProducto) {
		this.idProducto = idProducto;
	}

	public Producto(String nombre, String descripcion, String imgProducto, float precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imgProducto = imgProducto;
		this.precio = precio;
	}

	public Producto(int idProducto, String nombre, String descripcion, String imgProducto, float precio) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imgProducto = imgProducto;
		this.precio = precio;
	}
	
	//Metodos Getters & Setters
	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImgProducto() {
		return imgProducto;
	}

	public void setImgProducto(String imgProducto) {
		this.imgProducto = imgProducto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", imgProducto=" + imgProducto + ", precio=" + precio + "]";
	}
	

	
	
	

}

