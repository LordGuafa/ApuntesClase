package view;

import java.util.Scanner;

import controller.Control;

public class Vista {
    // Para utilizar la inyección de dependencias se requiere una variable de tipo
    // Control que se utilizará en el constructor
    Control control;

    public Vista(Control control) {
        this.control = control;
    }

    // Método para mostrar por consola los mensajes del programa
    public void mostrar(String mensaje) {
        System.out.println(mensaje);
    }

    // Método para capturar los datos introducidos por teclado
    public String capturar() {
        Scanner sc = new Scanner(System.in);
        String mensaje = sc.nextLine();
        return mensaje;
    }

    public String capturar(String texto) {
        System.out.println(texto);
        Scanner sc = new Scanner(System.in);
        String mensaje = sc.nextLine();
        return mensaje;
    }
}
