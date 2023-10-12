package Modelo;

public interface Estrategas {
String CrearPlan (int CantidadTiempo, String TipoPlan);
String HacerCalculos (String TipoCalculo, int CantidadSegundos);
String PlanearRetirada(String LugarRetirada, int CantidadHeroesQueSeRetiran);
String LlamarAmigos (int CantidadAmigos);
}
