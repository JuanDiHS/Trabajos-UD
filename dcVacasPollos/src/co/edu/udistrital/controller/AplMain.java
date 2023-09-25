package co.edu.udistrital.controller;

import java.util.Scanner;
import co.edu.udistrital.model.dcVacaPollo;
public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int var1 = 0;
		dcVacaPollo a= new dcVacaPollo();
		System.out.println("¿Cuántos animales hay en la finca?: ");
		a.setNAnimales(leer.nextInt());
		System.out.println("¿Cuantás patas de pollos y vacas hay en la finca?:");
		a.setNPatas(leer.nextInt());
		a.calcularVar1();
		if (a.getNPatas()<a.getVar1()) {
			System.out.println(
					"Tiene que ingresar por lo menos el doble de número de patas con respecto al número de animales.");
		} else if (a.getNPatas()>=a.getVar1()) {
			a.calcularNumVacas();
			a.calcularNumPollos();
			System.out.println("El número de vacas es: " + a.getNumVacas()  + " y el número de pollos es: " + a.getNumPollos());

		}
	}

}
