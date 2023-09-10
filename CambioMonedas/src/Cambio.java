import java.util.Scanner;

public class Cambio {

	public static void main(String[] args) {
		/*
		 * Calcular el cambio de monedas en dólares y euros al ingresar cierta cantidad
		 * en pesos colombianos. (tipo de cambio US$= 2.950, Euros: 3.450).
		 */
		Scanner leer = new Scanner(System.in);
		System.out.println("Conversor de pesos colombianos a dolares y euros.");
		System.out.println();
		System.out.println("Ingrese la cantidad en pesos colombianos. ");
		double pesos = leer.nextDouble();
		double dolares = pesos / 2950;
       double euros = pesos / 3450;
       System.out.println("La conversión de pesos colombianos a dolares y euros es: " + dolares + " dolares y " + euros + " euros respectivamente.");
	}

}
