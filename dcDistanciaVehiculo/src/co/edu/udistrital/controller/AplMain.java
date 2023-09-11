package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.DistanciaVehiculo;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		DistanciaVehiculo a = new DistanciaVehiculo();
		System.out.println("Ingrese la aceleración del vehículo: ");
		a.setW(leer.nextDouble());
		System.out.println("Ingrese el tiempo que mantiene esa aceleración: ");
		a.setT(leer.nextDouble());
		a.hallarDistancia();
		System.out.println("La distancia que alcanza el vehículo con una aceleración constante de: " + a.getW()
				+ "m/s^2 durante " + a.getT() + " segundos es de " + a.getD() + " metros");
	}

}
