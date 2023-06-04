package models.impl;

import models.classes.Modelo;
import models.interfaces.IModelo;

public class ImplNegocioModelo implements IModelo {
  private static Modelo[] modelos = new Modelo[10];
  private static int index = 0;

  @Override
  public void insertarModelo(Modelo modelo) {
    if (buscarModelo(modelo.getModelo()) == null) {
      modelos[index] = modelo;
      index++;
      System.out.println("Modelo insertado correctamente");
    } else {
      System.out.println("El modelo ya existe");
    }
  }

  @Override
  public Modelo[] listarModelos() {
    return modelos;
  }

  private Modelo buscarModelo(String modelo) {
    for (Modelo m : modelos) {
      if (m != null && m.getModelo().equals(modelo)) {
        return m;
      }
    }
    return null;
  }

}
