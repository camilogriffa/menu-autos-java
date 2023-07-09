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
    int id;
    do {
      try {
        System.out.println("0. Ingresar id (identificador numérico: 1, 2, 3, 4...): ");
        id = scanner.nextInt();
        if (id <= 99) {
          break;
        } else {
          System.out.println("0. El identificador debe ser menor o igual a 99. Inténtalo nuevamente.");
        }
      } catch (Exception e) {
        System.out.println("0. Error: Ingresa un identificador válido. Inténtalo nuevamente.");
        scanner.nextLine();
      }
    } while (true);
    System.out.println("0. Identificador ingresado: " + id);

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
    System.out.println("  1. ARGENTINA");
    System.out.println("  2. BRASIL");
    System.out.println("  3. ALEMANIA");
    System.out.println("  4. JAPON");
    int origenSel = scanner.nextInt();
    scanner.nextLine();
    String origen = "ORIGEN";
    switch (origenSel) {
      case 1:
        origen = "ARGENTINA";
        break;
      case 2:
        origen = "BRASIL";
        break;
      case 3:
        origen = "ALEMANIA";
        break;
      case 4:
        origen= "JAPON";
        break;
      default:
        break;
    }

    System.out.println("4. Ingresar puertas: ");
    System.out.println("  1. DOS");
    System.out.println("  2. CUATRO");
    System.out.println("  3. CINCO");
    int puertasSel = scanner.nextInt();
    scanner.nextLine();
    int puertas = 1;
    switch (puertasSel) {
      case 1:
        puertas = 2;
        break;
      case 2:
        puertas = 4;
        break;
      case 3:
        puertas = 5;
        break;
      default:
        break;
    }

    System.out.println("5. Ingresar año: ");
    System.out.println("  1. 2021");
    System.out.println("  2. 2022");
    System.out.println("  3. 2023");
    int yearSel = scanner.nextInt();
    scanner.nextLine();
    int year = 2023;
    switch (yearSel) {
      case 1:
        year = 2021;
        break;
      case 2:
        year = 2022;
        break;
      case 3:
        year = 2023;
        break;
      default:
        break;
    }

    System.out.println("6. Ingresar patente: ");
    String patente = scanner.nextLine();

    System.out.println("7. Ingresar color: ");
    System.out.println("  1. NEGRO");
    System.out.println("  2. BLANCO");
    System.out.println("  3. AMARILLO");
    int colorSel = scanner.nextInt();
    scanner.nextLine();
    String color = "COLOR";
    switch (colorSel) {
      case 1:
        color = "NEGRO";
        break;
      case 2:
        color = "BLANCO";
        break;
      case 3:
        color = "AMARILLO";
        break;
      default:
        break;
    }

    System.out.println("8. Ingresar tipo: ");
    System.out.println("  1. 4X4");
    System.out.println("  2. URBANO");
    System.out.println("  3. DEPORTIVO");
    int tipoSel = scanner.nextInt();
    scanner.nextLine();
    String tipo = "TIPO";
    switch (tipoSel) {
      case 1:
        tipo = "4X4";
        break;
      case 2:
        tipo = "URBANO";
        break;
      case 3:
        tipo = "DEPORTIVO";
        break;
      default:
        break;
    }

    System.out.println("9. Ingresar si tiene aire: ");
    System.out.println("  1. TRUE");
    System.out.println("  2. FALSE");
    int tieneAireSel = scanner.nextInt();
    scanner.nextLine();
    boolean tieneAire = false;
    switch (tieneAireSel) {
      case 1:
        tieneAire = true;
        break;
      case 2:
        tieneAire = false;
        break;
      default:
        tieneAire = false;
        break;
    }

    System.out.println("10. Ingresar si tiene alarma: ");
    System.out.println("  1. TRUE");
    System.out.println("  2. FALSE");
    int tieneAlarmaSel = scanner.nextInt();
    scanner.nextLine();
    boolean tieneAlarma = false;
    switch (tieneAlarmaSel) {
      case 1:
        tieneAlarma = true;
        break;
      case 2:
        tieneAlarma = false;
        break;
      default:
        tieneAlarma = false;
        break;
    }

    Auto newCar = new Auto(id, year, tipo, patente, color, marca, modelo, origen, puertas, tieneAire, tieneAlarma);
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
