package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Presupuesto;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Presupuesto a = new Presupuesto();
		System.out.println("Ingrese el presupuesto total: ");
		a.setMontoTotal(leer.nextDouble());
		a.calcularPrespuesto1();
		a.calcularPresupuesto2();
		a.calcularPresupuesto3();
		System.out.println("El presupuesto para urgencias es de: " + a.getpresupuesto1() + ", para pediatría es "
				+ a.getpresupuesto2() + " y para traumatología es de " + a.getpresupuesto3());
	}

}
