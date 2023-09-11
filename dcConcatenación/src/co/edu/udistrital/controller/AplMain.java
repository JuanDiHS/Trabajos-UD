package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Concatenación;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Concatenación a = new Concatenación();
		System.out.println("Digite el primer número: ");
		a.setA(leer.nextInt());
		System.out.println("Digite el segundo número: ");
		a.setB(leer.nextInt());
		System.out.println("Digite el tercer número: ");
		a.setC(leer.nextInt());
		a.Concatenar();
		System.out.println("X es igual a: " + a.getconcatenación());
	}

}
