package models.interfaces;

import models.classes.Auto;

public interface IAuto {

  public Auto buscarAuto(String nroPatente);

  public Auto[] listarAutos();

  public void insertarAuto(Auto auto);

  public void eliminarAuto(String patente);

  public void modificarAuto(Auto auto, String patente);

}
