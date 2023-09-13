import java.util.Scanner;

public class Matrizcifrada {

	public static void main(String[] args) {
		String palabra, clave;
		char c;
		int x = 0, a = 0, i = 0, j = 0, z = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		palabra = leer.nextLine();
		System.out.println("Ingrese una clave: ");
		clave = leer.next();
		char matriz[][] = new char[palabra.length()][clave.length()];
		double nf = (palabra.length() / clave.length()) + 1;
		for (i = 0; i < nf; i++) {
			for (j = 0; j < clave.length(); j++) {
				if (x < palabra.length()) {
					matriz[i][j] = palabra.charAt(x);
					x++;
				}
			}
		}
		for (i = 0; i < nf; i++) {
			for (j = 0; j < clave.length(); j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		System.out.println(clave);

		char caracteres[] = new char[palabra.length()];
		for (i = 0; i < palabra.length(); i++) {
			caracteres[i] = palabra.charAt(a);
			a++;
		}
		char ordenado[] = new char[clave.length()];
		for (i = 0; i < clave.length(); i++) {
			ordenado[i] = clave.charAt(z);
			z++;
		}
		boolean orden[] = new boolean[ordenado.length];
		for (i = 0; i < orden.length; i++) {
			orden[i] = false;
		}
		for (j = 0; j < ordenado.length; j++) {
			int menor = Integer.MAX_VALUE;
			int pos = -1;
			for (i = 0; i < ordenado.length; i++) {
				if ((int) ordenado[i] < menor && orden[i] == false) {
					menor = (int) ordenado[i];
					pos = i;
				}

			}
			orden[pos] = true;
			System.out.println((char) menor);

		}
		for ( i = 0; i < ordenado.length; i++) {
			for (j = 0; j < nf; j++) {
				System.out.println(matriz[j][i]);
			}
		}

	}
}
