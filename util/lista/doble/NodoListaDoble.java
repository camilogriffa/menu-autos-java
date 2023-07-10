package util.lista.doble;

import entidades.auto.Auto;

public class NodoListaDoble {
  public Auto dato;
  public NodoListaDoble sig, ant;

  public NodoListaDoble(Auto dato) {
    this.dato = dato;
    this.sig = this.ant = null;
  }

  public Auto getDato() {
    return dato;
  }

  public void setDato(Auto dato) {
    this.dato = dato;
  }

  public NodoListaDoble getSiguiente() {
    return sig;
  }

  public void setSiguiente(NodoListaDoble siguiente) {
    this.sig = siguiente;
  }

  public NodoListaDoble getAnterior() {
    return ant;
  }

  public void setAnterior(NodoListaDoble anterior) {
    this.ant = anterior;
  }
}
