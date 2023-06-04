package util.pila.impl;

import util.pila.nodo.NodoPila;

public interface IPila {
	
	public void apilar(NodoPila nodo);
	
	public void apilarConOrdenacion(NodoPila nodo);
	
	public NodoPila desapilar();
	
	public void listarPila();
	
	
}
