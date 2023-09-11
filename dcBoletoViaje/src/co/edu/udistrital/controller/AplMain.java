package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.BoletoViaje;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		BoletoViaje a = new BoletoViaje();
		System.out.println("Ingrese la cantidad de kilometros. ");
		a.setKm(leer.nextDouble());
		a.calcularPrecio();
		System.out.println("El precio del viaje es de: " + a.getprecio());
	}

}
