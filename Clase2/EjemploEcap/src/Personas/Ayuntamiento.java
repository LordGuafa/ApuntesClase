/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author nicod
 */
public class Ayuntamiento {
    public static void main(String[] args) {
        
        //Creamos el objeto
        Aldeano farmer = new Aldeano("Luis", 28);
        
        //Imprimimos la informacion del objeto:
        //Como edad es un atributo privado es necesario el get para acceder a su valor y obtenerlo
        //Como esta clase está en el mismo paquete que Aldeano, el salario es público en este caso y no tenemos restriccion para acceder a él 
        System.out.println("El aldeano es: " + farmer.nombre + " edad: " + farmer.getEdad() + " salario: " + farmer.salario);
        //Ahora cambiamos el valor de los atributos del objeto
        farmer.nombre = "Samuel";//como el nombre es público no tenemos restriccion para cambiar su valor
        System.out.println("Nuevo nombre; " + farmer.nombre);
        farmer.setEdad(20); //como la edad es privada necesitamos del set que reemplaza el valor 
        System.out.println("Nueva edad: " + farmer.getEdad());
        farmer.salario = "5 oros";//como estamos en el mismo paquete tenemos libre acceso para cambiar el valor de "salario"
        System.out.println("Nuevo salario: " + farmer.salario);
        
        
        //Al estar en el mismo paquete al de aldeanos, tenemos acceso a los métodos públicos y los protegidos (pero no al método privado), que son los siguientes:
        farmer.llamarPrivado();
        farmer.metodoPublico();
        farmer.metodoProtegido();
    }
}