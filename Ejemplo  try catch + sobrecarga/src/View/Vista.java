package View;

import java.util.Scanner;

import Controller.Control;

public class Vista {

    private Control control;

    public Vista(Control control) {
        this.control = control;
    }

    // Método para capturar texto por consola sin recibir parámetros
    public String capturar() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        return texto;
    }

    // Sobrecarga del método ` capturar ` recibiendo un parámetro
    public String capturar(String mensaje) {
        System.out.println(mensaje);
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        return texto;
    }

    // Sobrecarga del método ` capturar ` agregando un parámatro adicional
    public String capturar(int num, String mensaje) {
        return mensaje;
    }

    // Se puede cambiar el tipo de retorno del método mediante sobrecarga, pero se
    // debe diferenciar ya sea por un parámetro adicional o como en este caso
    // cambiando el orden de los parámetros
    // Recordemos que f(x,y) != f(y,x)
    public int capturar(String mensaje, int num) {
        return num;
    }

    public void mostrar(String mensaje) {
        System.out.println(mensaje);
    }
}
