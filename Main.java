import entidades.auto.Auto;
import negocio.impl.ImpAuto;
import negocio.inter.IAuto;
import util.pila.impl.ImplPila;

import java.util.Scanner;

public class Main {
  private static IAuto iAuto;
  private static Scanner scanner = new Scanner(System.in);
  // private static Stack<Auto> accionesRealizadas = new Stack<>(); comento estas lineas ya que no estamos haciendo uso de estas clases
  // private static Stack<Auto> accionesDeshacer = new Stack<>();


  public static void main(String[] args) {
    iAuto = (IAuto) new ImpAuto();
    boolean continuar = true;
    ImplPila pilaAutos = new ImplPila();
    ImplPila pilaAutosAux = new ImplPila();

    while (continuar) {
      System.out.println("----- Menú de Opciones -----");
      System.out.println("1. Insertar auto");
      System.out.println("2. Modificar auto");
      System.out.println("3. Eliminar auto");
      System.out.println("4. Listar autos");
      System.out.println("5. Deshacer acción");
      System.out.println("6. Rehacer acción");
      System.out.println("7. Salir del programa");
      System.out.print("Ingrese el número de opción: ");

      int opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1:
          insertarUnAuto(pilaAutos);
          break;
        case 2:
          modificarUnAuto(pilaAutos);
          break;
        case 3:
          eliminarUnAuto();
          break;
        case 4:
          listaDeAutos(pilaAutos);
          break;
        case 5:
          deshacerAccion(pilaAutos, pilaAutosAux);
          break;
        case 6:
          rehacerAccion(pilaAutos, pilaAutosAux);
          break;
        case 7:
          continuar = false;
          break;
        default:
          System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
          break;
      }
    }

    scanner.close();
  }

  public static void insertarUnAuto(ImplPila pila) {
    System.out.println("0. Ingresar id (identificador numérico): ");
    int id = scanner.nextInt();
    scanner.nextLine();

    System.out.println("1. Ingresar marca: ");
    String marca = scanner.nextLine();

    System.out.println("2. Ingresar modelo: ");
    String modelo = scanner.nextLine();

    System.out.println("3. Ingresar origen: ");
    String origen = scanner.nextLine();

    System.out.println("4. Ingresar puertas: ");
    int puertas = scanner.nextInt();
    scanner.nextLine();

    System.out.println("5. Ingresar año: ");
    int año = scanner.nextInt();
    scanner.nextLine();

    System.out.println("6. Ingresar patente: ");
    String patente = scanner.nextLine();

    System.out.println("7. Ingresar color: ");
    String color = scanner.nextLine();

    System.out.println("8. Ingresar tipo (urbano, todoterreno, deportivo): ");
    String tipo = scanner.nextLine();

    System.out.println("9. Ingresar si tiene aire (true, false): ");
    boolean tieneAire = scanner.nextBoolean();
    scanner.nextLine();

    System.out.println("10. Ingresar si tiene alarma (true, false): ");
    boolean tieneAlarma = scanner.nextBoolean();
    scanner.nextLine();

    Auto newCar = new Auto(id, año, tipo, patente, color, marca, modelo, origen, puertas, tieneAire, tieneAlarma);
    pila.apilar(newCar);
    iAuto.insertarAuto(newCar);
  }

  public static void listaDeAutos(ImplPila pila) {
    iAuto.listarAutos();
    pila.listarPila();
  }

  public static void modificarUnAuto(ImplPila pila) {
    System.out.println("0. Modificar - Ingrese la patente del vehiculo: ");
    String patente = scanner.nextLine();

    if (iAuto.buscarAuto(patente) == null) {
      System.out.println("No hay autos para modificar con esa patente.");
      return;
    }

    System.out.println("1. Modificar - Marca: ");
    iAuto.obtenerDatoAuto(1, "marca", patente);
    String marca = scanner.nextLine();

    System.out.println("2. Modificar - Modelo: ");
    iAuto.obtenerDatoAuto(2, "modelo", patente);
    String modelo = scanner.nextLine();

    System.out.println("3. Modificar - Origen: ");
    iAuto.obtenerDatoAuto(3, "origen", patente);
    String origen = scanner.nextLine();

    System.out.println("4. Modificar - Puertas: ");
    int puertas = scanner.nextInt();
    scanner.nextLine();

    System.out.println("5. Modificar - Año: ");
    int año = scanner.nextInt();
    scanner.nextLine();

    System.out.println("6. Modificar - Color: ");
    iAuto.obtenerDatoAuto(6, "color", patente);
    String color = scanner.nextLine();

    System.out.println("7. Modificar - Tipo: ");
    iAuto.obtenerDatoAuto(7, "tipo", patente);
    String tipo = scanner.nextLine();

    System.out.println("8. Modificar - Aire: ");
    boolean tieneAire = scanner.nextBoolean();
    scanner.nextLine();

    System.out.println("9. Modificar - Alarma: ");
    boolean tieneAlarma = scanner.nextBoolean();
    scanner.nextLine();

    System.out.println("10. Modificar - Identificador: ");
    int id = scanner.nextInt();
    scanner.nextLine();

    Auto newCar = new Auto(id, año, tipo, patente, color, marca, modelo, origen, puertas, tieneAire, tieneAlarma);
    pila.apilar(newCar);
    iAuto.modificarAuto(newCar, patente);
  }

  public static void eliminarUnAuto() {
    System.out.println("0. Eliminar - Ingrese la patente del vehiculo: ");
    String patente = scanner.nextLine();
    iAuto.eliminarAuto(patente);
  }

  public static void deshacerAccion(ImplPila pila, ImplPila pilaAux) {
    Auto des = pila.desapilar();
    if (des != null) {
      pilaAux.apilar(des);
      System.out.println("Acción anterior deshecha");
    } else {
      System.out.println("No existe una accion por deshacer");
    }
  }

  public static void rehacerAccion(ImplPila pila, ImplPila pilaAux) {
    Auto reh = pilaAux.desapilar();
      if (reh != null) {
        pila.apilar(reh);
        System.out.println("Acción anterior rehecha");
      } else {
        System.out.println("No existe una accion por rehacer");
      }
  }
}
