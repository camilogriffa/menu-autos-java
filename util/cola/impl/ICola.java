package util.cola.impl;

import util.cola.nodo.NodoCola;

public interface ICola {
	
	public void addElemento(NodoCola nodo);
	
	public void addElemento2(NodoCola nodo);
	
	public NodoCola eliminarElemento();
	
	public void listarElementos();
	
}
