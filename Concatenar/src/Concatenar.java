import java.util.Scanner;
public class Concatenar {

	public static void main(String[] args) {
		/*Leer tres números enteros de un Digito y almacenarlos en una sola variable que contenga a esos tres dígitos.*/
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el primer número: ");
		int A = leer.nextInt();
		System.out.println("Ingrese el segundo número: ");
		int B = leer.nextInt();
		System.out.println("Ingrese el tercer número: ");
		int C = leer.nextInt();
		System.out.println("X es igual: " + A + B + C);

	}

}
