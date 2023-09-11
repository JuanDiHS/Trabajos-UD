package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.DistanciaPC;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		DistanciaPC a = new DistanciaPC();
		System.out.println("Ingrese la coordenada X del primer punto: ");
		a.setX1(leer.nextDouble());
		System.out.println("Ingrese la coordenada Y del primer punto: ");
		a.setY1(leer.nextDouble());
		System.out.println("Ingrese la coordenada X del segundo punto: ");
		a.setX2(leer.nextDouble());
		System.out.println("Ingrese la coordenada y del segundo punto: ");
		a.setY2(leer.nextDouble());
		a.hallarDistancia();
		System.out.println("La distancia entre los puntos " + a.getX1() + "," + a.getY1() + " y los puntos " + a.getX2()
				+ "," + a.getY2() + " es " + a.getDistancia());
	}

}
