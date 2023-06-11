package negocio.impl;

import entidades.auto.Auto;
import negocio.inter.IAuto;

public class ImpAuto implements IAuto {
  private static Auto[] cars = new Auto[10];
  private static int index = 0;

  @Override
  public Auto[] listarAutos() {
    if (vectorVacio()) {
      System.out.println("Listado de autos:");
      for (int i = 0; i < cars.length; i++) {
        if (cars[i] != null) {
          System.out.println(
            "(" +
            cars[i].getId() +
            ") " +
            cars[i].getMarca() +
            " " +
            cars[i].getModelo() +
            " " +
            cars[i].getYear());
        }
      }
    } else {
      System.out.println("No hay autos registrados!");
    }
    return cars;
  }

  @Override
  public Auto buscarAuto(String patente) {
    for(int i = 0; i < index; i++) {
      if(cars[i] != null && cars[i].getPatente().equals(patente)) {
        System.out.println("<Auto encontrado>");
        System.out.println(
          "-> Marca: " + cars[i].getMarca() +
          " " + "\n" +
          "-> Modelo: " + cars[i].getModelo() +
          " " + "\n" +
          "-> Año: " + cars[i].getYear() +
          " " + "\n" +
          "-> Origen: " + cars[i].getOrigen() +
          " " + "\n" +
          "-> Puertas: " + cars[i].getPuertas() +
          " " + "\n" +
          "-> Aire: " + toStringState(cars[i].getTieneAire()) +
          " " + "\n" +
          "-> Alarma: " + toStringState(cars[i].getTieneAlarma())
        );
      };
    }
    return null;
  }

  @Override
  public void insertarAuto(Auto auto) {
    if (!validarDatosAuto(auto)) {
      if (buscarAuto(auto.getPatente()) == null) {
        cars[index] = auto;
        index++;
      }
    } else System.out.println("Faltan ingresar datos para cargar el auto");
  }

  @Override
  public void eliminarAuto(String patente) {
    for (int i = 0; i < index; i++) {
      if (cars[i] != null && cars[i].getPatente().equals(patente)) {
        System.out.println(
          "Se elimina el auto: " + "\n" +
          "(" + cars[i].getId() + ") " +
          cars[i].getMarca() + " " +
          cars[i].getModelo() + " " +
          cars[i].getYear() + " " +
          patente);
        cars[i] = null;
        return;
      }
    }
    System.out.println("No existe un auto con esa patente");
  }

  @Override
  public void modificarAuto(Auto auto, String patente) {
    for (int i = 0; i < index; i++) {
      if (cars[i] != null && cars[i].getPatente().equals(patente)) {
        cars[i] = auto;
        System.out.println("Auto modificado: " + patente);
        return;
      }
    }
    System.out.println("No existe un auto con esa patente");
  }

  private boolean vectorVacio() {
    return (cars.length > 0);
  }

  private boolean validarDatosAuto(Auto auto) {
    if (auto == null)
      return true;
    if (auto.getModelo() == null)
      return true;
    if (auto.getPatente() == null)
      return true;
    return false;
  }

  private String toStringState(boolean state) {
    if (state == true) return "Si";
    else if (state == false) return "No";
    return null;
  }

}
