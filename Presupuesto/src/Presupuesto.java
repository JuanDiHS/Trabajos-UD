import java.util.Scanner;

public class Presupuesto {

	public static void main(String[] args) {
		/*
		 * Obtener la cantidad de dinero que recibirá cada área para cualquier monto
		 * presupuestal.
		 */

		Scanner leer = new Scanner(System.in);
		System.out.println("Programa qué calcula montos presupuestales de 3 áreas diferentes. ");
		System.out.println();
		System.out.println("Ingrese el monto total. ");
		int montoTotal = leer.nextInt();
		double presupuesto1 = montoTotal * 0.37;
		double presupuesto2 = montoTotal * 0.42;
		double presupuesto3 = montoTotal * 0.21;
		System.out.println("El presupuesto para Urgencias es " + presupuesto1);
		System.out.println("El presupuesto para Pediatría es " + presupuesto2);
		System.out.println("El presupuesto para Traumatología es " + presupuesto3);
	}

}
