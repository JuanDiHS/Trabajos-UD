package co.edu.udistrital.model;

public class Prestamo {
	private int prestamo;
	private double IntMensual;

	public Prestamo() {
		prestamo = 0;
		IntMensual = 0.27;
	}

	public Prestamo(int prestamo, double IntMensual) {
		this.prestamo = prestamo;
		this.IntMensual = IntMensual;
	}


	public double getIntMensual() {
		return IntMensual;
	}

	public void setIntMensual(double intMensual) {
		IntMensual = intMensual;
	}
	
	public int getprestamo() {
		return prestamo;
	}

	public void setprestamo(int prestamo) {
		this.prestamo = prestamo;
	}
	public void calcularInteres() {
		IntMensual = prestamo * (IntMensual/12);
	}

	@Override
	public String toString() {
		return "Prestamo [prestamo=" + prestamo + ", IntMensual=" + IntMensual + "]";
	}

}
