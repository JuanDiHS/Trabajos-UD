 package co.edu.udistrital.model;

public class VolCilindro {

	private double radio;
	private double altura;
	private double volumen;
	
	public VolCilindro() {
		radio = 0.0;
		altura = 0.0;
		volumen = 0.0;
	}

	public VolCilindro(double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
		this.volumen = 0.0;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getVolumen() {
		return volumen;
	}

	@Override
	public String toString() {
		return "Cilindro [radio=" + radio + ", altura=" + altura + ", volumen=" + volumen + "]";
	}

	public void calcularVolumen() {
		volumen = (Math.PI * Math.pow(radio, 2) * altura);
	}
	
	
	
}

