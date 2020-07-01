package dominio;

public class Pedido_Producto {
	
	int idPedido_Producto;
	int idPedido;
	int idProducto;
	
	//Constructores
	public Pedido_Producto() {
		
	}
	
	public Pedido_Producto(int idPedido_Producto) {
		this.idPedido_Producto = idPedido_Producto;
	}
	
	public Pedido_Producto(int idPedido, int idProducto) {
		this.idPedido = idPedido;
		this.idPedido = idProducto;
	}
	
	public Pedido_Producto(int idPedido_Producto, int idPedido, int idProducto) {
		this.idPedido_Producto = idPedido_Producto;
		this.idPedido = idPedido;
		this.idPedido = idProducto;
	}

	//Metodos Getters & Setters
	public int getIdPedido_Producto() {
		return idPedido_Producto;
	}

	public void setIdPedido_Producto(int idPedido_Producto) {
		this.idPedido_Producto = idPedido_Producto;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Pedido_Producto [idPedido_Producto=" + idPedido_Producto + ", idPedido=" + idPedido + ", idProducto="
				+ idProducto + "]";
	}

}