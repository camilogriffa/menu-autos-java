package util.pila.impl;

import util.pila.NodoPila;

public interface IPila {
	public void apilar(NodoPila nodo);

	public void apilarConOrdenacion(NodoPila nodo);

	public NodoPila desapilar();

	public void listarPila();

}
