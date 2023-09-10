import java.util.Scanner;

public class RadCilindro {

	public static void main(String[] args) {
		/*
		 * Dado el radio de la base y la altura del Cilidro, calcular el volumen del
		 * cilindro.
		 */

		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el valor del radio: ");
		double radio = leer.nextDouble();
		System.out.println("Ingrese la altura del cilindro: ");
		double altura = leer.nextDouble();
		double volumen = Math.PI * Math.pow(radio, 2) * altura;
		System.out.println("El volumen del cilindro con altura " + altura + " y radio de " + radio + " es " + volumen);
	}

}
