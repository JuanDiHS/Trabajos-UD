package co.edu.udistrital.model;

public class DistanciaVehiculo {

	private double T, W, D;

	public DistanciaVehiculo() {
		T = 0.0;
		W = 0.0;
		D = 0.0;
	}

	public DistanciaVehiculo(double T, double W, double D) {
		this.T = T;
		this.W = W;
		this.D = D;
	}

	public double getT() {
		return T;
	}

	public void setT(double t) {
		T = t;
	}

	public double getW() {
		return W;
	}

	public void setW(double w) {
		W = w;
	}

	public double getD() {
		return D;
	}

	public void hallarDistancia() {
		D = (W * Math.pow(T, 2)) / 2;
	}
}
