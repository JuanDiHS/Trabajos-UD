package co.edu.udistrital.model;

public class Estudiante extends Persona {
	private String Carrera;

	public Estudiante(String penombre, int pedad, String pcarrera) {
		super(penombre, pedad);
		Carrera = pcarrera;
	}

	public String getCarrera() {
		return Carrera;
	}

	public void setCarrera(String carrera) {
		Carrera = carrera;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCarrera:" + Carrera;
	}

}
