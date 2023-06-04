package models.classes;

public class Vehiculo {

  private Modelo modelo;
  private float valor;
  private static String patente;

  public Vehiculo(Modelo modelo, float valor,String patente) {
    super();
    this.modelo = modelo;
    this.valor = valor;
    patente=patente;
  }

  public Vehiculo() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Modelo getModelo() {
    return modelo;
  }

  public void setModelo(Modelo modelo) {
    this.modelo = modelo;
  }

  public float getValor() {
    return valor;
  }

  public void setValor(float valor) {
    this.valor = valor;
  }

  public static String getPatente() {
    return patente;
  }

  public static void setPatente(String patente) {
    patente = patente;
  }


}
