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
            // Dentro del bloque `try` se ejecuta el código a evaluar
            int number = Integer.parseInt(vista.capturar("Ingresa un numero"));
            vista.mostrar(number + " es un número entero válido: " + number);
        } catch (NumberFormatException error) {
            // Dentro del bloque `catch` se ejecuta el código que planteamos en caso de
            // fallar algo dentro del `try`. El error se captura dependiendo del tipo de
            // error que le pasemos como parámetro
            vista.mostrar(" no es un número entero válido." + error.getMessage());
        } finally {
            // Este bloque es opcional y siempre se ejecuta independientemente si se entra o
            // no al `catch`
            vista.mostrar("Esto siempre se va a ejecutar");
        }
    }
}
