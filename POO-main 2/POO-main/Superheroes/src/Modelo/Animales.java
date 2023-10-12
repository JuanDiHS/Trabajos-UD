package Modelo;

public class Animales implements PoderFuerza{

	@Override
	public String LevantarCosas(String QueLevanto, int MetrosAltura) {
		
		return "El animal ha levantado algo para golpear a su enemigo";
	}

	@Override
	public String RomperEdificios(int CantidadEdificios, int PesoEdificio) {
		
		return "El animal ha roto un edificio mientras peleaba";
	}

	@Override
	public String LanzarCosas(String QueLanzo, int CantidadMetros) {
		
		return "El animal ha lanzado una cosa a su enemigo";
	}

	@Override
	public String GolpearFuerte(String QueGolpeo, int FuerzaGolpe) {

		return "El animal ha golpeado con fuerza a su oponente.";
	}

	
	
	

}
