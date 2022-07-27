package logica;

public class Fecha {
	private int dia;
	private int anio;
	private int mes;
	
	public Fecha() {}
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.anio = anio;
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	@Override
	public String toString() {
		return "dia=" + dia +  ", mes=" + mes +", año=" + anio;
	}
		
	}
	

