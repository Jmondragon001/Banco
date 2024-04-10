package Dominio;

public class Beneficiario {
	private String nombre;
	private String app;
	private String apm;
	private long celular;
	private String direc;
	public Beneficiario() {
	}
	public Beneficiario(String nombre, String app, String apm, long celular, String direc) {
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.celular = celular;
		this.direc = direc;
	}
	@Override
	public String toString() {
		return "Beneficiario [nombre=" + nombre + ", app=" + app + ", apm=" + apm + ", celular=" + celular + ", direc="
				+ direc + "]\n";
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
	public long getCelular() {
		return celular;
	}
	public void setCelular(long celular) {
		this.celular = celular;
	}
	public String getDirec() {
		return direc;
	}
	public void setDirec(String direc) {
		this.direc = direc;
	}

}
