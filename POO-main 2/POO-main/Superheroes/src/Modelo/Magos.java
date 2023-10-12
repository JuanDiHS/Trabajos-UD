package Modelo;

public interface Magos {
	String CrearPociones(String tipoPoción, int CantidadPociones);
	String Teletransportacion(float CantidadMetros, String Posicion);
	String ViajarEnElTiempo(int TiempoViajado, String dondeViajo);
	String SerInvisible (int CantidadTiempo);
	default String CelebrarVictoria (int CantidadHeroes) {
		return CantidadHeroes + " han celebrado la victoria contra los oponentes.";
	}

}
