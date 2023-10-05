package Modelo;

public interface PoderFuerza {
	String LevantarCosas(String QueLevanto, int MetrosAltura);

	String RomperEdificios(int CantidadEdificios, int PesoEdificio);

	String LanzarCosas(String QueLanzo, int CantidadMetros);
	String GolpearFuerte(String QueGolpeo, int FuerzaGolpe);

	default String LlamarAmigos(int CantidadAmigos) {
		return "Necesito ayuda, llamaré a mis otros amigos superhéroes.";
	}

}
