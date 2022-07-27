package logica;
import logica.Fecha;
public class Articulo {
//atributos
	private int codigo;
	private String nombre;
	private double precioCosto;
	private Fecha vencimiento;
	private boolean ven = estaVencido(vencimiento);
	
	public Articulo() {}
	
	public Articulo(int a, String b, double c, Fecha d) {
		codigo=a;
		nombre=b;
		precioCosto=c;
		vencimiento=d;
		
	}

	

	@Override
	public String toString() {
			return "su codigo es: " + codigo + ",\nsu nombre es: " + nombre + ",\nsu precio es: " + precioCosto+"\ny su precio de venta es: "+precioVenta()+"\ny su fecha de vencimiento es: "+vencimiento;
			
		
	}
	public boolean estaVencido(Fecha f){
		boolean esta=false;
		return esta;
	}
	public double precioVenta() {
		return(precioCosto+precioCosto*0.30) ;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioCosto() {
		return precioCosto;
	}

	public void setPrecioCosto(double precioCosto) {
		this.precioCosto = precioCosto;
	}
	public Fecha getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(Fecha vencimiento ) {
		this.vencimiento = vencimiento;
	}
}
