package consola;
import logica.*;
public class Principal {

	public static void main(String[] args) {
		Fecha f1 = new Fecha(27, 7, 2022);
		Articulo a1 = new Articulo(2343, "jabon", 435, f1);
		System.out.println(a1);

	}

}
