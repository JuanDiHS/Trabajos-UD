package co.edu.udistrital.model;

public class Presupuesto {

	private double montoTotal, presupuesto1, presupuesto2, presupuesto3;

	public Presupuesto() {
		montoTotal = 0.0;
	}

	public Presupuesto(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public double getpresupuesto1() {
		return presupuesto1;
	}

	public double getpresupuesto2() {
		return presupuesto2;
	}

	public double getpresupuesto3() {
		return presupuesto3;
	}
public void calcularPrespuesto1() {
	presupuesto1 = montoTotal * 0.37;
}
public void calcularPresupuesto2() {
	presupuesto2 = montoTotal * 0.42;
}
public void calcularPresupuesto3() {
	presupuesto3 = montoTotal * 0.21;
}
}
