package Modelo;
public class Aldeano {

  protected int vida = 50;
  protected double velocidad = 0.5;
  protected int ataque = 3;
  protected int defensa = 0;
  protected String faccion, color;
  protected boolean mejorado;

  public Aldeano(String color) {
    this.color = color;
    
  }

  public String recolectar() {
    return("Aldeano " + color+ " recolectando");
  }

  public String caminar() {
    return("Aldeano " + color+ " caminando");
  }

  public String atacar() {
    return "Aldeano " + color+ " Por el rey!";
}

  public String construir() {
    return("Aldeano " + color+ " construyendo...");
  }

  public int getAtaque() {
    return ataque;
  }

  public int getDefensa() {
    return defensa;
  }

  public String getFaccion() {
    return faccion;
  }

  public String getColor() {
    return color;
  }

  public void setAtaque(int ataque) {
    this.ataque = ataque;
  }

  public void setDefensa(int defensa) {
    this.defensa = defensa;
  }

  public void setFaccion(String faccion) {
    this.faccion = faccion;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void mejorar() {
    // Se "mejora" el aldeano modificando sus atributos
    this.ataque += 2;
    this.defensa += 2;
    this.mejorado = true;
}

  

  
}
