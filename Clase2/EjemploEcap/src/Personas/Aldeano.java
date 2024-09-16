/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author nicod
 */
public class Aldeano {
    
    //Declaramos atributos
    public String nombre;
    private int edad;
    protected String salario = "3 oros"; //Inicializamos el atributo salario para que tenga un valor por defecto

    //Al crear el objeto se inicializan los atributos que estaban sin valor
    public Aldeano(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Un método público al que todos tienen acceso
    public void metodoPublico() {
    System.out.println("Me pueden llamar de cualquier parte");
  }
    
    //Un método público al que todos tienen acceso, pero esté me llamará al método privado
  public void llamarPrivado() {
    System.out.println("Llamando al método privado");
    metodoPrivado();
  }
  
  //Método al que solo esta clase tiene acceso, es decir solo un método de esta clase puede llamar a este "metodoPrivado"
  private void metodoPrivado() {
    System.out.println("Solo me pueden acceder localmente");
  }

  
  protected void metodoProtegido() {
    System.out.println("Solo me pueden acceder si están en mi paquete");
  }

  
  //El método getter que me retorna el valor del atributo edad
    public int getEdad() {
        return edad;
    }
    
    //El método setter que me permite cambiar el valor del atributo edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    //El método getter que me retorna el valor del atributo salario
    public String getSalario() {
        return salario;
    }

    //El método setter que me permite cambiar el valor del atributo edad
    public void setSalario(String salario) {
        this.salario = salario;
    }
}
