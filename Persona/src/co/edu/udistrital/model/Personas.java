package co.edu.udistrital.model;

public class Personas {

	public String nombre;
	public int edad;

	// constructor
	public Personas() {
		nombre = "";
		edad = 0;
	}

	@Override
	public String toString() {
		return "Persona nombre: " + nombre + "\n Edad=" + edad;

	}

	public boolean sonNombresIguales(Personas x) {
    	 if(nombre.equals(x.nombre)) {
    		 return true;
    	 }else {
    		 return false;
    	 }
     
}
public String esMayor(Personas x) {
	if(edad>x.edad) {
		return "Es mayor";
	}else if(edad == x.edad){
		return "Es igual";
	}else{
		return "Es menor";
	}
	}
public String saludar (Personas x) {
	return " Hola a todos";
}
public String saludarAAlguien (Personas x) {
	return "Hola " + x.nombre;
}
public Personas (String nombre, int edad){
	 this.nombre = nombre;
	 this.edad = edad;
}
}

	
	

