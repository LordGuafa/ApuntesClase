package Controller;

import View.Vista;

public class Control {
    Vista vista;

    public Control() {
        vista = new Vista(this);
        pedirNumero();
    }

    public void pedirNumero() {
        try {
            int number = Integer.parseInt(vista.capturar("Ingresa un numero"));
            vista.mostrar(number + " es un número entero válido: " + number);
        } catch (NumberFormatException e) {
            vista.mostrar(" no es un número entero válido.");
        } finally {
            vista.mostrar("Esto siempre se va a ejecutar");
        }
    }
}
