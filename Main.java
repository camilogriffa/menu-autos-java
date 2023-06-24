import entidades.auto.Auto;
import negocio.impl.ImpAuto;
import negocio.inter.IAuto;
import java.util.Scanner;

public class Main {
  private static IAuto iAuto;
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    iAuto = (IAuto) new ImpAuto();
    boolean continuar = true;

    while (continuar) {
      System.out.println("----- Menú de Opciones -----");
      System.out.println("1. Insertar auto");
      System.out.println("2. Modificar auto");
      System.out.println("3. Eliminar auto");
      System.out.println("4. Listar autos");
      System.out.println("5. Salir");
      System.out.print("Ingrese el número de opción: ");

      int opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1:
          insertarUnAuto();
          break;
        case 2:
          modificarUnAuto();
          break;
        case 3:
          eliminarUnAuto();
          break;
        case 4:
          listaDeAutos();
          break;
        case 5:
          continuar = false;
          break;
        default:
          System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
          break;
      }
    }

    scanner.close();
  }

  public static void insertarUnAuto() {
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
    iAuto.insertarAuto(newCar);
  }

  public static void listaDeAutos() {
    iAuto.listarAutos();
  }

  public static void modificarUnAuto() {
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
    iAuto.modificarAuto(newCar, patente);
  }

  public static void eliminarUnAuto() {
    System.out.println("0. Eliminar - Ingrese la patente del vehiculo: ");
    String patente = scanner.nextLine();
    iAuto.eliminarAuto(patente);
  }
}
