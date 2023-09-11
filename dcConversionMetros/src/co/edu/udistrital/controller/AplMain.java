package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.ConversionMetro;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ConversionMetro a = new ConversionMetro();
		System.out.println("Ingrese la cantidad en metros: ");
		a.setMetros(leer.nextDouble());
		a.conversionPulgadas();
		a.conversiónPies();
		System.out.println(a.getMetros() + " metros es equivalente a " + a.getPies() + " pies y a " + a.getPulgadas() + " pulgadas.");
	}

}
