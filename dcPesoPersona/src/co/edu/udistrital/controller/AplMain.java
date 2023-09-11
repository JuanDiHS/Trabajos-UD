package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.PesoPersona;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		PesoPersona a = new PesoPersona();
		System.out.println("Ingrese el peso en kilogramos de la persona: ");
		a.setKilos(leer.nextDouble());
		a.calcularGramos();
		a.calcularLibras();
		a.calcularToneladas();
		System.out.println("La cantidad equivalente de " + a.getKilos()+ " kilos es " + a.getGramos() + " gramos "
				+ a.getLibras() + " libras " + a.getToneladas() + " toneladas.");
	}

}
