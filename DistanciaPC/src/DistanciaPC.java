import java.util.Scanner;
public class DistanciaPC {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese dos puntos en el plano cartesiano ");
		System.out.println("Coordenada eje X primer punto: ");
		double x1 = leer.nextDouble();
		System.out.println("Coordenada eje Y primer punto: ");
		double y1 = leer.nextDouble();
		System.out.println("Coordenada eje X segundo punto: ");
		double x2 = leer.nextDouble();
		System.out.println("Coordenada eje Y segundo punto: ");
		double y2 = leer.nextDouble();
		double distancia = Math.sqrt((Math.pow(x2-x1, 2)+ (Math.pow(y2-y1, 2))));
		System.out.println("La distancia entre los dos puntos es: " + distancia);
		
		

	}

}
