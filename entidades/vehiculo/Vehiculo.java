package entidades.vehiculo;

public class Vehiculo {
  protected int id;
  protected int year;
  protected String tipo;
  protected String patente;
  protected String color;

  public Vehiculo(int id, int year, String tipo, String patente, String color) {
    this.id = id;
    this.year = year;
    this.tipo = tipo;
    this.patente = patente;
    this.color = color;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getPatente() {
    return this.patente;
  }

  public void setPatente(String patente) {
    this.patente = patente;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

}
