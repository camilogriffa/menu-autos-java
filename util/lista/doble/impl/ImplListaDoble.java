package util.lista.doble.impl;

import util.lista.doble.NodoListaDoble;

public class ImplListaDoble implements IListaDoble {
  public NodoListaDoble inicio, ultimo;

  public void insertarNodo(NodoListaDoble nodo) {
    if (esVacia()) {
			inicio = ultimo = nodo;
    } else {
			ultimo.sig = nodo;
			nodo.ant = ultimo;
			ultimo = nodo;
		}
  };

	public void eliminarNodo(NodoListaDoble nodo) {
    if (inicio == nodo && ultimo == nodo) {
			inicio = null;
			ultimo = null;
		} else if (inicio == nodo) {
			inicio = nodo.sig;
			inicio.ant = null;
		} else if (ultimo == nodo) {
			ultimo = nodo.ant;
			ultimo.sig = null;
		} else {
			nodo.ant.sig = nodo.sig;
			nodo.sig.ant = nodo.ant;
		}
  };

	public void listarListaDoble(String orden) {
    if (orden.equals("asc")) {
			NodoListaDoble aux = inicio;
			while (aux != null) {
				System.out.println("AUTO: " + aux.dato.toString());
				aux = aux.sig;
			}
		} else {
			NodoListaDoble aux = inicio;
			while (aux != null) {
				System.out.println("AUTO: " + aux.dato.toString());
				aux = aux.ant;
			}
		}
  };

	@Override
	public boolean esVacia() {
		return (inicio == null && ultimo == null);
	}

}
