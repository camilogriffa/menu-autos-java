package util.lista.doble.impl;

import util.lista.doble.NodoListaDoble;

public interface IListaDoble {

	public void insertarNodo(NodoListaDoble nodo);

	public void eliminarNodo(NodoListaDoble nodo);

	public void listarListaDoble(String orden);

	public boolean esVacia();

}
