package Paquete1;

import Paquete2.Clase2;

public class Clase1 {

  public static void main(String[] args) {
    Clase2 clase2 = new Clase2();
    System.out.println(clase2.atributo1);
    System.out.println(clase2.atributo2);
    System.out.println(clase2.atributo3);
    clase2.metodoPrivado();
    clase2.metodoPublico();
    clase2.llamarPrivado();
    clase2.metodoProtegido();
  }
}
