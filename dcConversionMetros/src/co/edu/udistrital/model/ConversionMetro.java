package co.edu.udistrital.model;

public class ConversionMetro {

	private double metros, pies, pulgadas;

	public ConversionMetro() {
		metros = 0.0;
		pies = 0.0;
		pulgadas = 0.0;
	}

	ConversionMetro(double metros, double pies, double pulgadas) {
		this.metros = metros;
		this.pies = pies;
		this.pulgadas = pulgadas;
	}

	public double getMetros() {
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}
	public double getPies() {
		return pies;
	}
	public double getPulgadas() {
		return pulgadas;
	}
	
	public void conversiónPies() {
		pies = metros * 3.281;
}
	public void conversionPulgadas() {
		pulgadas = metros * 39.37;
	}
}
