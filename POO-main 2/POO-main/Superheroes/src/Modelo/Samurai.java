package Modelo;

public class Samurai implements Asesinos {
	@Override
	public String MatarATodos(int CantidadEnemigos, int CantidadTiempo) {
		return "El samurai ha matado a sus enemigos.";	}

	@Override
	public String MatarSigilosamente(int CantidadEnemigos, String MomentoDelDia) {
		return "El samurai ha matado a sus enemigos sin hacer ruido";		
	}

	@Override
	public String SacarUnArma(int CantidadArmas, String TipoArma) {
		return "EL samurai ha sacado un arma";		
	}

	@Override
	public String Boxear(int CantidadMetros, int CantidadEnemigos) {
		return "El samurai ha tenido una pelea cuerpo a cuerpo";
	}

}
