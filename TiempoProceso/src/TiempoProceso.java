import java.util.Scanner;

public class TiempoProceso {

	public static void main(String[] args) {
		/*
		 * Escriba un programa donde se ingrese el tiempo necesario para un cierto
		 * proceso en horas, minutos y segundos. Se calcule el costo total del proceso
		 * sabiendo que el costo por segundo es 3.25 pesos colombianos.
		 */
		Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese cuántas horas demorará el proceso ");
       int horas = leer.nextInt();
       System.out.println("Ingrese cuántos minutos demorará el proceso: ");
       int minutos = leer.nextInt();
       System.out.println("Ingrese cuántos segundos demorará el proceso: ");
       double segundos = leer.nextDouble();
       double totalTiempo = (horas*3600) + (minutos*60) + segundos;
       System.out.println("El costo total del proceso es " + totalTiempo * 3.25);
	}

}
