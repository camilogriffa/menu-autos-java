package models.impl;

import models.classes.Auto;
import models.interfaces.IAuto;

public class ImplNegocioAuto implements IAuto {

  private static Auto[] autos = new Auto[10];
  private static int index = 0;

  @Override
  public Auto buscarAuto(String nroPatente) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Auto[] listarAutos() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void insertarAuto(Auto auto) {
    if (!validarDatosAuto(auto)) {
      if (buscarAuto(auto.getPatente()) == null) {
        autos[index] = auto;
        index++;
      }
    } else
      System.out.println("Faltan ingresar datos para cargar un auto");

  }

  @Override
  public void eliminarAuto(String patente) {
    // TODO Auto-generated method stub

  }

  @Override
  public void modificarAuto(Auto auto, String patente) {
    // TODO Auto-generated method stub

  }

  private boolean validarDatosAuto(Auto auto) {
    if (auto == null)
      return true;
    if (auto.getModelo() == null)
      return true;
    if (auto.getPatente() == null)
      return true;
    return false;
  }

}
