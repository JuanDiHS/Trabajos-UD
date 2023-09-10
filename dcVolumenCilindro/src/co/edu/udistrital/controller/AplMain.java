package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.VolCilindro;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		VolCilindro c = new VolCilindro();
		
		System.out.println("Digite radio: ");
		c.setRadio(leer.nextDouble());
		
		System.out.println("Digite altura: ");
		c.setAltura(leer.nextDouble());
		
		c.calcularVolumen();
		
		System.out.println("El volumen del cilindro es " + c.getVolumen());
		
	}

}