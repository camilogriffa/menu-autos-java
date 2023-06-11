package negocio.inter;

import entidades.auto.Auto;

public interface IAuto {
  public Auto[] listarAutos();

  public Auto buscarAuto(String patente);

  public void insertarAuto(Auto auto);

  public void eliminarAuto(String patente);

  public void modificarAuto(Auto auto, String patente);
}
