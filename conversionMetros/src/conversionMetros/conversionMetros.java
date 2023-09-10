package conversionMetros;

import java.util.Scanner;

public class conversionMetros {

	public static void main(String[] args) {
		/* Convertir una distancia en metros a pies y pulgadas. */
		Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una distancia en metros. ");
       double metros = leer.nextDouble();
       double pies = metros * 3.281;
       double pulgadas = metros * 39.37;
       System.out.println(metros + " metro/s es equivalente a " + pies + " pie/s" + " y " + pulgadas + " pulgada/s" );
	}

}
