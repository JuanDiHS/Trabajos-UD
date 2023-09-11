package co.edu.udistrital.model;

public class PesoPersona {
	private double kilos, gramos, libras, toneladas;

	public PesoPersona() {
		kilos = 0.0;
		gramos = 0.0;
		libras = 0.0;
		toneladas = 0.0;
	}

	public PesoPersona(double kilos, double gramos, double libras, double toneladas) {
		this.kilos = kilos;
		this.gramos = gramos;
		this.libras = libras;
		this.toneladas = toneladas;
	}

	public double getKilos() {
		return kilos;
	}

	public void setKilos(double kilos) {
		this.kilos = kilos;
	}
	public double getGramos() {
		return gramos;
	}
	public double getLibras() {
		return libras;
	}
	public double getToneladas() {
		return toneladas;
	}
	public void calcularGramos() {
		gramos = kilos * 1000;
	}
	public void calcularLibras() {
		libras = kilos * 2.204;
	}
	public void calcularToneladas() {
		toneladas = kilos * 0.001;
	}

}
