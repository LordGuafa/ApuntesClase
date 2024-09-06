package Paquete2;

public class Clase2 {

  public String atributo1 = "Atributo1";
  private String atributo2 = "Atributo2";
  protected String atributo3 = "Atributo3";

  public void metodoPublico() {
    System.out.println("Me pueden llamar de cualquier parte");
  }

  public void llamarPrivado() {
    System.out.println("Llamando al método privado");
    metodoPrivado();
  }

  private void metodoPrivado() {
    System.out.println("Solo me pueden acceder localmente");
  }

  protected void metodoProtegido() {
    System.out.println("Solo me pueden acceder si están en mi paquete");
  }
}
