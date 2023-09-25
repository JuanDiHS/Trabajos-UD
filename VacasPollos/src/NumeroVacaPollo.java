import java.util.Scanner;

public class NumeroVacaPollo {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int NAnimales, NPatas = 0, numVacas, numPollos = 0, var1 = 0, resta;
		System.out.println("¿Cuántos animales hay en la finca?: ");
		NAnimales = leer.nextInt();
		System.out.println("¿Cuantás patas de pollos y vacas hay en la finca?:");
		NPatas = leer.nextInt();
		var1 = NAnimales * 2;
		resta = NPatas - NAnimales;
		if (NPatas<var1) {
			System.out.println(
					"Tiene que ingresar por lo menos el doble de número de patas con respecto al número de animales.");
		} else if (NPatas>=var1) {
			numVacas = (var1 - NPatas) / -2;
			numPollos = NAnimales - numVacas;
			System.out.println("El número de vacas es: " + numVacas + " y el número de pollos es: " + numPollos);

		}

	}
}
