package Dominio;

public class Tarjetas {
	private Long numCuenta;
	private String tipoTarjeta;
	private String vencimiento;
	public Tarjetas() {
	}
	public Tarjetas(Long numCuenta, String tipoTarjeta, String vencimiento) {
		this.numCuenta = numCuenta;
		this.tipoTarjeta = tipoTarjeta;
		this.vencimiento = vencimiento;
	}
	@Override
	public String toString() {
		return "Tarjetas [numCuenta=" + numCuenta + ", tipoTarjeta=" + tipoTarjeta + ", vencimiento=" + vencimiento
				+ "]\n";
	}
	public Long getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(Long numCuenta) {
		this.numCuenta = numCuenta;
	}
	public String getTipoTarjeta() {
		return tipoTarjeta;
	}
	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	

}
