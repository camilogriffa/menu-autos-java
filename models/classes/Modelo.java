package models.classes;
import java.util.Date;
public class Modelo {

  private String modelo;
  private Date fechaModdelo;
  private Marca marca;

  public Modelo(String modelo, Date fechaModdelo,Marca marca) {
    super();
    this.modelo = modelo;
    this.fechaModdelo = fechaModdelo;
    this.marca=marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public Date getFechaModdelo() {
    return fechaModdelo;
  }

  public void setFechaModdelo(Date fechaModdelo) {
    this.fechaModdelo = fechaModdelo;
  }


}
