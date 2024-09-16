/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Personas.Aldeano;

/**
 *
 * @author nicod
 */
public class Cuartel {
    public static void main(String[] args) {
        //Creamos el objeto
        Aldeano vago = new Aldeano("Niko", 22);
        
        //Imprimimos la informacion del objeto:
        //Como edad es un atributo privado es necesario el get para acceder a su valor y obtenerlo
        //Como esta clase está en un paquete distinto al de aldeano recordemos que el salario es privado para esta clase, por ende necesitamos tambien de un get
        System.out.println("El aldeano es: " + vago.nombre + " edad: " + vago.getEdad() + " salario: " + vago.getSalario());
        
        //Ahora cambiamos el valor de los atributos del objeto
        vago.nombre = "Vago"; //como el nombre es público no tenemos restriccion para cambiar su valor
        System.out.println("Nuevo nombre; " + vago.nombre);
        vago.setEdad(17);  //como la edad es privada necesitamos del set que reemplaza el valor 
        System.out.println("Nueva edad: " + vago.getEdad());
        vago.setSalario(" ninguno pinche sángano ");//como estamos en un paquete distinto necesitamos de un set para modificar el valor de salario
        System.out.println("Nuevo salario: " + vago.getSalario());
        
        
        //Al estar en una clase de un paquete disitnto al de aldeanos, solo tenemos acceso a los métodos públicos, que son los siguientes:
        vago.llamarPrivado();
        vago.metodoPublico();
    }
}