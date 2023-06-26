package util.pila.impl;

import entidades.auto.Auto;
import util.pila.NodoPila;

public class ImplPila implements IPila {

  private NodoPila ult;

  public ImplPila() {
		this.ult = null;
	}

  @Override
  public void apilar(Auto car) {
    NodoPila nodo = new NodoPila(car);
    if (esVacia())
      ult = nodo;
    else {
      nodo.sig = ult;
      ult = nodo;
    }
  }

  @Override
  public Auto desapilar() {
    Auto aux = null;
    if (!esVacia()) {
      aux = ult.auto;
      ult = ult.sig;
    }
    return aux;
  }

  @Override
  public void listarPila() {
    if (!esVacia()) {
      NodoPila aux = ult;
      while (aux != null) {
        System.out.println(aux.auto);
        aux = aux.sig;
      }
    } else {
			System.out.println("No existen autos almacenados");
		}
  }

  private boolean esVacia() {
    if (ult == null)
      return true;
    return false;
  }

};
