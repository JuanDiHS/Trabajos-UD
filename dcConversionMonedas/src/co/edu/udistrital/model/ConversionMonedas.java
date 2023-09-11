package co.edu.udistrital.model;

public class ConversionMonedas {
	private double euros, pesos, dolares;

	public ConversionMonedas() {
		pesos = 0.0;
	}

	public ConversionMonedas(double pesos) {
		this.pesos = pesos;
	}

	public double getPesos() {
		return pesos;
	}

	public void setPesos(double pesos) {
		this.pesos = pesos;
	}

	public double geteuros() {
		return euros;
	}

	public double getdolares() {
		return dolares;
	}
	public void calcularDolares() {
		dolares = pesos/2950;
	}
	public void calcularEuros() {
		euros = pesos/3450;
	}
}