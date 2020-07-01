package dominio;
import java.util.Date;

public class Pedido {
	
	int idPedido;
	int idUsuario;
	Date fechaPedido;
	float montoTotal;
	
	//Constructores
	public Pedido() {
		
	}

	public Pedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Pedido(int idUsuario, float montoTotal) {
		this.idUsuario = idUsuario;
		this.montoTotal = montoTotal;
	}

	public Pedido(int idPedido, int idUsuario, Date fechaPedido, float montoTotal) {
		this.idPedido = idPedido;
		this.idUsuario = idUsuario;
		this.fechaPedido = fechaPedido;
		this.montoTotal = montoTotal;
	}

	//Metodos Getters & Setters
	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public float getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(float montoTotal) {
		this.montoTotal = montoTotal;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", idUsuario=" + idUsuario + ", fechaPedido=" + fechaPedido
				+ ", montoTotal=" + montoTotal + "]";
	}

}