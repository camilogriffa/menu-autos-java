package util.pila.impl;

import util.pila.nodo.NodoPila;

public class PilaImpl implements IPila {

	private NodoPila ult;

	public PilaImpl() {
		this.ult = null;
	}

	@Override
	public void apilar(NodoPila nodo) {
		if (esVacia())
			ult = nodo;
		else {
			nodo.ant = ult;
			ult = nodo;
		}
	}

	@Override
	public void apilarConOrdenacion(NodoPila nodo) {
		if (esVacia())
			ult = nodo;
		else {
			if (nodo.dato > ult.dato) {
				nodo.ant = ult;
				ult = nodo;
			} else
				ordenarPila(nodo);
		}
	}

	@Override
	public NodoPila desapilar() {
		NodoPila aux = null;
		if (!esVacia()) {
			aux = ult;
			ult = ult.ant;
		}
		return aux;
	}

	@Override
	public void listarPila() {
		if (!esVacia()) {
			NodoPila aux = ult;
			while (aux != null) {
				System.out.println(aux.dato);
				aux = aux.ant;
			}
		} else
			System.out.println("La pila esta vacia");

	}

	private boolean esVacia() {
		if (ult == null)
			return true;
		return false;
	}

	private void ordenarPila(NodoPila nodo) {
		NodoPila actual=ult;
		while (actual != null) {
			if (actual.dato > nodo.dato && actual.ant != null && actual.ant.dato < nodo.dato) {
				nodo.ant = actual.ant;
				actual.ant = nodo;
			}else if(actual.dato > nodo.dato && actual.ant== null )
				actual.ant = nodo;
			actual = actual.ant;
		}
	}
}
