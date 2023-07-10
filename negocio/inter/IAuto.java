package negocio.inter;

import entidades.auto.Auto;
import util.lista.doble.impl.ImplListaDoble;

public interface IAuto {
  public Auto[] listarAutos();

  public Auto buscarAuto(String patente);

  public void insertarAuto(Auto auto);

  public void eliminarAuto(String patente, ImplListaDoble lista);

  public void modificarAuto(Auto auto, String patente);

  public void obtenerDatoAuto(int datoInt, String datoString, String patente);
}
