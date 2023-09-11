package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.ConversionMonedas;

public class Aplmain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ConversionMonedas a = new ConversionMonedas();
		System.out.println("Ingrese el valor en pesos colombianos: ");
		a.setPesos(leer.nextDouble());
		a.calcularDolares();
		a.calcularEuros();
		System.out.println(a.getPesos() + " pesos es equivalente en dolares a " + a.getdolares() + " y a "
				+ a.geteuros() + " euros");
	}

}
