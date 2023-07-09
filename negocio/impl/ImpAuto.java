package negocio.impl;

import java.util.Vector;

import entidades.auto.Auto;
import negocio.inter.IAuto;

public class ImpAuto implements IAuto {
  // private static Auto[] cars = new Auto[10];
  private static Vector<Auto> cars = new Vector<>();
  private static int index = 0;

  @Override
  public Vector<Auto> listarAutos() {
    if (vectorVacio()) {
      System.out.println("ESTADO LOCAL:");
      for (Auto car : cars) {
          System.out.println(
            " ID: " +
            car.getId() +
            " MARCA: " +
            car.getMarca() +
            " MODELO: " +
            cars[i].getModelo() +
            " TIPO: " +
            cars[i].getTipo() +
            " COLOR: " +
            car.getColor() +
            " PATENTE: " +
            car.getPatente() +
            " AÑO: " +
            car.getYear()
          );
      }
    } else {
      System.out.println("No hay autos registrados!");
    }
    return cars;
  }

  @Override
  public Auto buscarAuto(String patente) {
    for(Auto car : cars) {
      if(car != null && car.getPatente().equals(patente)) {
        System.out.println("<Auto encontrado>");
        System.out.println(
          "-> Marca: " + car.getMarca() +
          " " + "\n" +
          "-> Modelo: " + car.getModelo() +
          " " + "\n" +
          "-> Año: " + car.getYear() +
          " " + "\n" +
          "-> Origen: " + car.getOrigen() +
          " " + "\n" +
          "-> Puertas: " + car.getPuertas() +
          " " + "\n" +
          "-> Aire: " + toStringState(car.getTieneAire()) +
          " " + "\n" +
          "-> Alarma: " + toStringState(car.getTieneAlarma())
        ); return car;
      };
    }
    return null;
  }

  @Override
  public void insertarAuto(Auto auto) {
    if (!validarDatosAuto(auto)) {
      if (buscarAuto(auto.getPatente()) == null) {
        cars.add(auto);;
        index++;
      }
    } else System.out.println("Faltan ingresar datos para cargar el auto");
  }

  @Override
  public void eliminarAuto(String patente) {
    int carIndex = searchCarIndex(patente);
    if (carIndex != -1) {
      Auto car = cars.get(carIndex);
      System.out.println(
        "Se elimina el auto: " + "\n" +
        "(" + car.getId() + ") " +
        car.getMarca() + " " +
        car.getModelo() + " " +
        car.getYear() + " " +
        patente);
      cars.remove(carIndex);
    } else {
      System.out.println("No existe un auto con esa patente");
    }
  }

  @Override
  public void modificarAuto(Auto auto, String patente) {
    int carIndex = searchCarIndex(patente);
    if (carIndex != -1) {
      cars.set(carIndex, auto);
      System.out.println("Se modificó el auto: " + "(" + auto.getId() + ") " + patente);
    } else {
      System.out.println("No existe un auto con esa patente");
    }
  }

  @Override
  public void obtenerDatoAuto(int datoInt, String datoString, String patente) {
    int carIndex = searchCarIndex(patente);
    if (carIndex != -1) {
      Auto car = cars.get(carIndex);
      System.out.println(
        "- El dato " + datoString + " actual es: " + searchCarProperty(datoInt, car)
      );
    } else {
      System.out.println("No existe un auto con esa patente");
    }
  }

  private boolean vectorVacio() {
    return !cars.isEmpty();
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

  private int searchCarIndex(String patente) {
    for (int i = 0; i < cars.size(); i++) {
      if (cars.get(i).getPatente().equals(patente)) {
        return i;
      }
    }
    return -1;
  }

  private String searchCarProperty(int property, Auto auto) {
    String result = "";
    switch (property) {
      case 1:
        result = auto.getMarca();
        break;
      case 2:
        result = auto.getModelo();
        break;
      case 3:
        result = auto.getOrigen();
        break;
      // case 4:
      //   result = auto.getPuertas();
      //   break;
      // case 5:
      //   result = auto.getYear();
      //   break;
      case 6:
        result = auto.getColor();
        break;
      case 7:
        result = auto.getTipo();
        break;
      // case 8:
      //   result = auto.getTieneAire();
      //   break;
      // case 9:
      //   result = auto.getTieneAlarma();
      //   break;
    }
    return result;
  }

}
