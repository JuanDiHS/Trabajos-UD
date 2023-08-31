package co.edu.udistrital.controller;

import co.edu.udistrital.model.Personas;

public class AplMain {

	public static void main(String[] args) {
		Personas a;
		a = new Personas();

		Personas b = new Personas();
		System.out.println("Edad A: " + a.edad);
		System.out.println("Edad B: " + b.edad);
		System.out.println(" ");

		a.nombre = "Juan Diego";
		a.edad = 17;

		b.nombre = "Veronica";
		b.edad = 50;
		System.out.println(a);
		System.out.println();
		System.out.println(b);
		System.out.println();
		System.out.println("¿Tienen nombres iguales? " + a.sonNombresIguales(b));
		System.out.println();
		System.out.println("Juan Diego " + a.esMayor(b) + " que Veronica.");
		System.out.println(" ");
		System.out.println(a.nombre + a.saludar(b));
		System.out.println(" ");
		System.out.println(b.nombre + a.saludar(b));
		System.out.println("");
		System.out.println(a.saludarAAlguien(b));
		System.out.println("");
		System.out.println(b.saludarAAlguien(a));
		System.out.println("");
	}
	Personas c = new Personas("Alejandro", 27);
	Personas d = new Personas("Alejandra", 28);
	System.out.println(c.nombre);)
} }
