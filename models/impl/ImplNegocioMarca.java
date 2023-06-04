package models.impl;

import models.classes.Marca;
import models.interfaces.IMarca;

public class ImplNegocioMarca implements IMarca {

  private static Marca[] marcas = new Marca[10];
  private static int index = 0;

  @Override
  public void insertarMarca(Marca marca) {
    if (buscarMarcas(marca.getMarca()) == null)
      marcas[index] = marca;
    else
      System.out.println("La marca que intenta ingresar ya existe.");
  }

  @Override
  public void listarMarcas() {
    if (vectorVacio()) {
      for (int i = 0; i < marcas.length; i++) {
        if (marcas[i] != null)
          System.out.println("Marca: " + marcas[i].getMarca());
      }

    } else
      System.out.println("No ha Marcas registradas");
  }

  @Override
  public Marca buscarMarcas(String marca) {
    if (vectorVacio()) {
      for (int i = 0; i < marcas.length; i++) {
        if (marcas[i] != null && marcas[i].getMarca().equals(marca))
          return marcas[i];
      }
    }
    return null;
  }

  private boolean vectorVacio() {
    return (marcas.length > 0);
  }

}
