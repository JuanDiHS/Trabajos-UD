package co.edu.udistrital.model;

public class DistanciaPC {

	private double x1, y1, x2, y2, distancia;

	public DistanciaPC() {
		x1 = 0.0;
		y1 = 0.0;
		x2 = 0.0;
		y2 = 0.0;
		distancia = 0.0;
	}

	public DistanciaPC(double x1, double y1, double x2, double y2, double distancia) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.distancia = distancia;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	public double getDistancia() {
		return distancia;
	}

	public void hallarDistancia() {
		distancia = Math.sqrt((Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))));
	}

}
