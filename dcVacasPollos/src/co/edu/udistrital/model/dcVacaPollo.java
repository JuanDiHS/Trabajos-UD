package co.edu.udistrital.model;

public class dcVacaPollo {
	private int NAnimales;
	private int NPatas;
	private int numVacas;
	private int var1;
	private int numPollos;

	public dcVacaPollo() {
		NAnimales = 0;
		NPatas = 0;
		numVacas = 0;
		var1 = 0;
		numPollos = 0;
	}

	public dcVacaPollo(int NAnimales, int NPatas) {
		this.NAnimales = NAnimales;
		this.NPatas = NPatas;
	}

	public int getNAnimales() {
		return NAnimales;
	}

	public void setNAnimales(int nAnimales) {
		NAnimales = nAnimales;
	}

	public int getNPatas() {
		return NPatas;
	}

	public void setNPatas(int nPatas) {
		NPatas = nPatas;
	}
	public int getNumVacas() {
		return numVacas;
	}

	public int getVar1() {
		return var1;
	}

	public int getNumPollos() {
		return numPollos;
	}
	public void calcularVar1() {
		var1 = NAnimales * 2;
	}
	public void calcularNumVacas() {
		numVacas = (var1 - NPatas) / -2;
}
	public void calcularNumPollos() {
		numPollos = NAnimales - numVacas;
	}
	@Override
	public String toString() {
		return "Número de animales: " + NAnimales + "\nNúmero de patas:" + NPatas;
	}
	
}
