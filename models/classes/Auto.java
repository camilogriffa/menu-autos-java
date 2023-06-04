package models.classes;

public class Auto {
  private String color;
  private int cantPuertas;
  private boolean tieneAire;
  private boolean tieneAlrma;
  public Auto() {
    super();
  }

  public Auto(Modelo modelo, float valor, String patente) {
    super();
  }

  public Auto(Modelo modelo, float valor, String patente, String color, int cantPuertas, boolean tieneAire,
              boolean tieneAlrma) {
    super();
    this.color = color;
    this.cantPuertas = cantPuertas;
    this.tieneAire = tieneAire;
    this.tieneAlrma = tieneAlrma;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getCantPuertas() {
    return cantPuertas;
  }

  public void setCantPuertas(int cantPuertas) {
    this.cantPuertas = cantPuertas;
  }

  public boolean isTieneAire() {
    return tieneAire;
  }

  public void setTieneAire(boolean tieneAire) {
    this.tieneAire = tieneAire;
  }

  public boolean isTieneAlrma() {
    return tieneAlrma;
  }

  public void setTieneAlrma(boolean tieneAlrma) {
    this.tieneAlrma = tieneAlrma;
  }

  public String getPatente() {
    return null;
  }

  public Object getModelo() {
    return null;
  }


}
