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
          System.out.println("0. Ingresar id (identificador numérico): ");
          int id = scanner.nextInt();
          scanner.nextLine();
          System.out.println("1. Ingresar marca: ");
          String marca = scanner.nextLine();
          System.out.println("2. Ingresar modelo: ");
          String modelo = scanner.nextLine();
          System.out.println("3. Ingresar origin: ");
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
          Auto newCar = new Auto(
            id,
            año,
            tipo,
            patente,
            color,
            marca,
            modelo,
            origen,
            puertas,
            tieneAire,
            tieneAlarma
          );
          iAuto.insertarAuto(newCar);
          break;
        case 2:
          iAuto.modificarAuto(null, null);
          break;
        case 3:
          iAuto.eliminarAuto(null);
          break;
        case 4:
          iAuto.listarAutos();
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
}
