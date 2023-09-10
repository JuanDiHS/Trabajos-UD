package pesoPersona;

import java.util.Scanner;

public class pesoPersona {

	public static void main(String[] args) {
		/*
		 * Desplegar el peso dado en kilos de una persona en gramos, libras y toneladas.
		 */
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el peso de la persona en kilos: ");
		double kilos = leer.nextDouble();
		double gramos = kilos * 1000;
		double libras = kilos * 2.204;
		double toneladas = kilos * 0.001;
		System.out.println(kilos + " kilos esequivalente a " + gramos + " gramos, " + libras + " libras y " + toneladas
				+ " toneladas");

	}

}
