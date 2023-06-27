package util.pila;

import entidades.auto.Auto;

public class NodoPila {

  public Auto auto;

  public NodoPila sig;

  public NodoPila(Auto auto) {
    this.auto = auto;
    this.sig = null;
  }

}
