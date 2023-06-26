package util.pila.impl;

import entidades.auto.Auto;

public interface IPila {
	public void apilar(Auto car);

	public Auto desapilar();

	public void listarPila();

}
