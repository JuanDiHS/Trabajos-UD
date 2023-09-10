package distanciaVehiculo;

import java.util.Scanner;

public class distanciaVehiculo {
	/*
	 * Un vehículo inicia su marcha desde reposo y a una aceleración constante de W
	 * m/s2 durante T segundos. Determine la distancia recorrida por el vehículo
	 */
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la aceleración del vehículo: ");
		double W = leer.nextDouble();
		System.out.println("Ingrese la cantidad de segundos que mantiene esa aceleración: ");
		double T = leer.nextDouble();
		double D = (W * Math.pow(T, 2)) / 2;
		System.out.println("La distancia recorrida por un vehículo que va a una aceleración constante de : " + W
				+ " m/s^2 durante " + T + " segundos es de: " + D + " metros");
	}

}
