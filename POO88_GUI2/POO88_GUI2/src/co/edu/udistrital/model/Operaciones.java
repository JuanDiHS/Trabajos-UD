package co.edu.udistrital.model;

import co.edu.udistrital.controller.Cero;

public class Operaciones {

	public static int sumar(int a, int b) {
		return (a + b);
	}

	public static int restar(int a, int b) {
		return (a - b);
	}

	public static int multiplicar(int a, int b) {
		return (a * b);
	}

	public static double dividir(int a, int b) throws Cero{
		if (b == 0) {
			throw new Cero("No se puede dividir por cero");
	}
		return (a / b);
}
}
