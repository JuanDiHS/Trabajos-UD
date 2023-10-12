package Modelo;

public class Robots implements PoderFuerza, Estrategas {

	@Override
	public String CrearPlan(int CantidadTiempo, String TipoPlan) {
		return "El robot ha creado un plan para derrotar a sus enemigos.";
	}

	@Override
	public String HacerCalculos(String TipoCalculo, int CantidadSegundos) {
		
		return "El robot ha creado cálculos rápidamente para derrotar a su enemigo";
	}

	@Override
	public String PlanearRetirada(String LugarRetirada, int CantidadHeroesQueSeRetiran) {
	
		return "El robot ha planeado una retirada.";
	}

	@Override
	public String LlamarAmigos(int CantidadAmigos) {
		return "El robot ha contactado a sus amigos para luchar";
	}

	@Override
	public String LevantarCosas(String QueLevanto, int MetrosAltura) {
		return "El robot ha usado sus mecanismos para levantar cosas pesadas.";
	}

	@Override
	public String RomperEdificios(int CantidadEdificios, int PesoEdificio) {
		return "El robot ha usado sus mecanismos para romper edificios.";
	}

	@Override
	public String LanzarCosas(String QueLanzo, int CantidadMetros) {
		return "El robot ha usado sus mecanismos para lanzar cosas a su enemigo";
	}

	@Override
	public String GolpearFuerte(String QueGolpeo, int FuerzaGolpe) {
		return "El robot ha usado sus mecanismos para golpear con fuerza a sus enemigos";
	}

}
