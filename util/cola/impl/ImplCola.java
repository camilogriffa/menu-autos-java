package util.cola.impl;

import util.cola.NodoCola;

public class ImplCola implements ICola {

  private NodoCola pri;
  private NodoCola ult;

  public void ColaImpl() {
		this.pri=null;
		this.ult=null;
	}

  @Override
  public void addElemento(NodoCola nodo) {
    if (esVacia())
      pri = nodo;
    else {
      if (pri.sig == null)
        pri.sig = nodo;
      else {
        NodoCola actual = buscarUltimo();
        actual.sig = nodo;
      }
    }
  }

  @Override
  public void addElemento2(NodoCola nodo) {
    if (esVacia())
      pri = ult = nodo;
    else {
      ult.sig = nodo;
      ult = nodo;
    }
  }

  @Override
  public NodoCola eliminarElemento() {
    NodoCola aux = null;
    if (!esVacia()) {
      aux = pri;
      pri = pri.sig;
    }

    return aux;
  }

  @Override
  public void listarElementos() {
    // TODO Auto-generated method stub

  }

  private boolean esVacia() {
    if (pri == null)
      return true;
    return false;
  }

  private NodoCola buscarUltimo() {
    NodoCola aux = pri.sig;
    while (aux.sig != null) {
      aux = aux.sig;
    }
    return aux;
  }

}
