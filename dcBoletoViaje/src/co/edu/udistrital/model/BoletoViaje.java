package co.edu.udistrital.model;

public class BoletoViaje {
private double km, precio;
public BoletoViaje() {
	km = 0.0;
}
public BoletoViaje(double km) {
	this.km = km;
}
public double getKm() {
	return km;
}
public void setKm(double km) {
	this.km = km;
}
public double getprecio() {
	return precio;
}
public void calcularPrecio() {
	precio = km * 120;
}
	}


