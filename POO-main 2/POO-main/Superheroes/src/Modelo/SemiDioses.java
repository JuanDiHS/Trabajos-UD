package Modelo;

public class SemiDioses implements Magos, Estrategas{
	public String Teletransportacion() {
		
		return "El semi-dios se ha teletransportado a otra ubicación";
	}


	@Override
	public String CelebrarVictoria(int CantidadHeroes) {
		return Magos.super.CelebrarVictoria(CantidadHeroes);
	}


	public String ViajarEnElTiempo() {
		
		return "El semi-dios se ha teletransportado a otra ubicación";
	}



	@Override
	public String CrearPlan(int CantidadTiempo, String TipoPlan) {
		return "El semi-dios ha creado un plan para ganar la batalla";

	}


	@Override
	public String HacerCalculos(String TipoCalculo, int CantidadSegundos) {
		return "El semi-dios ha hecho los cálculos para crear un plan";		
	}


	@Override
	public String PlanearRetirada(String LugarRetirada, int CantidadHeroesQueSeRetiran) {
		return "Con los cálculos que hizo el dios ha planeado una retirada.";
	}


	@Override
	public String LlamarAmigos(int CantidadAmigos) {
		return "El semi-dios ha pedido ayuda a sus amigos para ganar la batalla.";
	}


	@Override
	public String CrearPociones(String tipoPoción, int CantidadPociones) {
		return "El semi-dios ha creado pociones para lanzar a sus enemigos";
	}


	@Override
	public String Teletransportacion(float CantidadMetros, String Posicion) {
		return "El semi-dios se ha teletransportado a otra ubicación";
	}


	@Override
	public String ViajarEnElTiempo(int TiempoViajado, String dondeViajo) {
		return "El semi-dios se ha teletransportado a otra ubicación";	
		}


	@Override
	public String SerInvisible(int CantidadTiempo) {
		return "El semi-dios se ha hecho invisible.";	
		}

}
