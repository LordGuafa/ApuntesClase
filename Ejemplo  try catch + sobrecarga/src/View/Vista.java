package View;

import java.util.Scanner;

import Controller.Control;

public class Vista {

    private Control control;

    public Vista(Control control) {
        this.control = control;
    }

    public String capturar() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        return texto;
    }

    public String capturar(String mensaje) {
        System.out.println(mensaje);
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        return texto;
    }

    public String capturar(int num, String mensaje) {
        return mensaje;
    }

    public int capturar(String mensaje, int num) {
        return num;
    }

    public void mostrar(String mensaje) {
        System.out.println(mensaje);
    }
}
