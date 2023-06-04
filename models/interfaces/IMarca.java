package models.interfaces;

import models.classes.Marca;

public interface IMarca {
  public void insertarMarca(Marca marca);

  public void listarMarcas();

  public Marca buscarMarcas(String marca);

}
