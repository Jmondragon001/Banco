package Dominio;

public class Clientes {
	private Long numCliente;
	private String nombre;
	private String app;
	private String apm;
	private Long celular;
	private int estatus;
	public Clientes() {
	}
	public Clientes(Long numCliente, String nombre, String app, String apm, Long celular, int estatus) {
		this.numCliente = numCliente;
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.celular = celular;
		this.estatus = estatus;
	}
	@Override
	public String toString() {
		return "Clientes [numCliente=" + numCliente + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm
				+ ", celular=" + celular + ", estatus=" + estatus + "]\n";
	}
	public Long getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(Long numCliente) {
		this.numCliente = numCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}
	public String getApm() {
		return apm;
	}
	public void setApm(String apm) {
		this.apm = apm;
	}
	public Long getCelular() {
		return celular;
	}
	public void setCelular(Long celular) {
		this.celular = celular;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	
	
}
