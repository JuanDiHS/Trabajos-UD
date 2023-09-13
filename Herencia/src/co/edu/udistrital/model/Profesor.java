package co.edu.udistrital.model;

public class Profesor extends Persona {
	private int cantidadHoras;
	private String especialidad;

	public Profesor(String pnombre, int pedad, int pcantidadHoras, String pespecialidad) {
		super(pnombre, pedad);
		cantidadHoras = pcantidadHoras;
		especialidad = pespecialidad;
	}

	public int getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCantidad de horas:" + cantidadHoras + "\nEspecialidad:" + especialidad;
	}
}
