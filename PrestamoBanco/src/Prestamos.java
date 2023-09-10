import java.util.Scanner;
public class Prestamos {

	public static void main(String[] args) {
		/*Una persona recibe un préstamo de X pesos de un banco y desea saber cuánto pagará de interés mensual, si el banco le cobra una tasa del 27% anual.*/
	    Scanner leer = new Scanner(System.in);
			System.out.println("Ingrese el valor del prestamo: ");
	        int prestamo = leer.nextInt();
	        System.out.println("La persona deberá pagar intereses anuales de: " + (prestamo*0.27) + " pesos");
	        double IntMensual = 0.27/12;
	        System.out.println("El interes mensual es de " + prestamo * IntMensual + " pesos" );
		}

	

	}
