package Modelo;

public class Alien implements Asesinos, PoderFuerza {

	@Override
	public String LevantarCosas(String QueLevanto, int MetrosAltura) {

		return "El alien ha levantado algo con su poder sobrenatural";
	}

	@Override
	public String RomperEdificios(int CantidadEdificios, int PesoEdificio) {
		return "El alien ha roto un edificio con su poder sobrenatural";
	}

	@Override
	public String LanzarCosas(String QueLanzo, int CantidadMetros) {
		return "El alien ha lanzado algo con sus poderes sobrenaturales";
	}

	@Override
	public String GolpearFuerte(String QueGolpeo, int FuerzaGolpe) {
		return "El alien ha golpeado con mucha fuerza a su oponente con sus poderes sobrenaturales";
	}

	@Override
	public String MatarATodos(int CantidadEnemigos, int CantidadTiempo) {
		return "El alien ha usado su tecnología para matar a todos al mismo tiempo";
	}

	@Override
	public String MatarSigilosamente(int CantidadEnemigos, String MomentoDelDia) {
		return "El alien ha usado su tecnología para matar a su oponente sin hacer ni un sonido";
	}

	@Override
	public String SacarUnArma(int CantidadArmas, String TipoArma) {
		return "El alien ha sacado un arma cosmica.";
	}

	@Override
	public String Boxear(int CantidadMetros, int CantidadEnemigos) {
		return "El alien aprovecha sus dotes para pelear cuerpo a cuerpo.";
	}

}
