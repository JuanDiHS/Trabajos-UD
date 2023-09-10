import java.util.Scanner;
public class PrecioBoleto {

	public static void main(String[] args) {
		/*Calcula el precio de un boleto de viaje, tomando en cuenta el número de kilómetros que se van a recorrer, siendo el precio $120 pesos colombianos por Km.*/
		Scanner leer = new Scanner(System.in);
		System.out.println("¿Cuántos kilometros va a recorrer?: ");
		double km = leer.nextDouble();
		System.out.println("El precio total de su viaje es: " + (km*120) + " pesos.");
		

	}

}
