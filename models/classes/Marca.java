package models.classes;

public class Marca {

  private String marca;
  private Modelo[] modelos;

  public Marca(String marca, Modelo[] modelos) {
    super();
    this.marca = marca;
    this.modelos = modelos;
  }

  public Marca() {
    super();
    // TODO Auto-generated constructor stub
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public Modelo[] getModelos() {
    return modelos;
  }

  public void setModelos(Modelo[] modelos) {
    this.modelos = modelos;
  }


}
