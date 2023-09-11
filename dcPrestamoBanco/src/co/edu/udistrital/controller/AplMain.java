package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Prestamo;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Prestamo a = new Prestamo();
		System.out.println("Ingrese la cantidad del prestamo: ");
		a.setprestamo(leer.nextInt());
		a.calcularInteres();
		System.out.println("El interes mensual es de " + a.getIntMensual());
	}

}
