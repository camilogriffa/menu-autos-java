package negocio.inter;

import java.util.Vector;

import entidades.auto.Auto;

public interface IAuto {
  public Vector<Auto> listarAutos();

  public Auto buscarAuto(String patente);

  public void insertarAuto(Auto auto);

  public void eliminarAuto(String patente);

  public void modificarAuto(Auto auto, String patente);

  public void obtenerDatoAuto(int datoInt, String datoString, String patente);
}
