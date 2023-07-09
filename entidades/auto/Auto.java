package entidades.auto;
import entidades.vehiculo.Vehiculo;

public class Auto extends Vehiculo {
  protected String marca;
  protected String modelo;
  protected String origen;
	protected int puertas;
	protected boolean tieneAire;
	protected boolean tieneAlarma;

  public Auto(int id, int year, String tipo, String patente, String color, String marca, String modelo, String origen, int puertas, boolean tieneAire, boolean tieneAlarma) {
    super(id, year, tipo, patente, color);
    this.marca = marca;
    this.modelo = modelo;
    this.origen = origen;
    this.puertas = puertas;
    this.tieneAire = tieneAire;
    this.tieneAlarma = tieneAlarma;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getOrigen() {
    return this.origen;
  }

  public void setOrigen(String origen) {
    this.origen = origen;
  }

  public int getPuertas() {
    return this.puertas;
  }

  public void setPuertas(int puertas) {
    this.puertas = puertas;
  }

  public boolean isTieneAire() {
    return this.tieneAire;
  }

  public boolean getTieneAire() {
    return this.tieneAire;
  }

  public void setTieneAire(boolean tieneAire) {
    this.tieneAire = tieneAire;
  }

  public boolean isTieneAlarma() {
    return this.tieneAlarma;
  }

  public boolean getTieneAlarma() {
    return this.tieneAlarma;
  }

  public void setTieneAlarma(boolean tieneAlarma) {
    this.tieneAlarma = tieneAlarma;
  }

  @Override
	public String toString() {
		return
      " ID: " +
      getId() +
      " MARCA: " +
      getMarca() +
      " MODELO: " +
      getModelo() +
      " TIPO: " +
      getTipo() +
      " COLOR: " +
      getColor() +
      " PATENTE: " +
      getPatente() +
      " AÑO: " +
      getYear();
	}

}
