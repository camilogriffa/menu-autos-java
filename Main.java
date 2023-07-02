import entidades.auto.Auto;
import negocio.impl.ImpAuto;
import negocio.inter.IAuto;
import util.pila.impl.ImplPila;

import java.util.Scanner;

public class Main {
  private static IAuto iAuto;
  private static Scanner scanner = new Scanner(System.in);

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
    System.out.println("  1. FORD");
    System.out.println("  2. TOYOTA");
    System.out.println("  3. CHEVROLET");
    int marcaSel = scanner.nextInt();
    scanner.nextLine();
    String marca = "MARCA";
    switch (marcaSel) {
      case 1:
        marca = "FORD";
        break;
      case 2:
        marca = "TOYOTA";
        break;
      case 3:
        marca = "CHEVROLET";
        break;
      default:
        break;
    }

    System.out.println("2. Ingresar modelo: ");
    String modelo = "MODELO";
    switch (marcaSel) {
      case 1:
        System.out.println("  1. RANGER");
        System.out.println("  2. RAPTOR");
        System.out.println("  3. FOCUS");
        int fordSel = scanner.nextInt();
        scanner.nextLine();
        if (fordSel == 1) {
          modelo = "RANGER";
        } else if (fordSel == 2) {
          modelo = "RAPTOR";
        } else if (fordSel == 3) {
          modelo = "FOCUS";
        }
        break;
      case 2:
        System.out.println("  1. HILUX");
        System.out.println("  2. ETIOS");
        System.out.println("  3. RAV4");
        int toyotaSel = scanner.nextInt();
        scanner.nextLine();
        if (toyotaSel == 1) {
          modelo = "HILUX";
        } else if (toyotaSel == 2) {
          modelo = "ETIOS";
        } else if (toyotaSel == 3) {
          modelo = "RAV4";
        }
        break;
      case 3:
        System.out.println("  1. S10");
        System.out.println("  2. CRUZE");
        System.out.println("  3. CAMARO");
        int chevroletSel = scanner.nextInt();
        scanner.nextLine();
        if (chevroletSel == 1) {
          modelo = "S10";
        } else if (chevroletSel == 2) {
          modelo = "CRUZE";
        } else if (chevroletSel == 3) {
          modelo = "CAMARO";
        }
        break;
      default:
        break;
    }

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
      Auto ult = pila.obtenerUltimaPosicion();
      iAuto.modificarAuto(ult, ult.getPatente());
      System.out.println("Acción anterior deshecha");
    } else {
      System.out.println("No existe una accion por deshacer");
    }
  }

  public static void rehacerAccion(ImplPila pila, ImplPila pilaAux) {
    Auto reh = pilaAux.desapilar();
      if (reh != null) {
        pila.apilar(reh);
        iAuto.modificarAuto(reh, reh.getPatente());
        System.out.println("Acción anterior rehecha");
      } else {
        System.out.println("No existe una accion por rehacer");
      }
  }
}
