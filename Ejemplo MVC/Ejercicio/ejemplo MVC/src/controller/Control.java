package controller;

import java.util.ArrayList;

//Se importan las clases creadas ubicadas en otras carpetas de nuestro proyecto
import model.Pedido;
import view.Vista;

/*
 * Ejemplo de comentario usando varias lineas
 * para textos demasiado largos
 * 
 */
public class Control {

    // Se crean variables para manejar la vista y los modelos que tengamos en
    // nuestro proyecto
    Vista vista;
    Pedido cliente;

    // Variables auxiliares del programa
    int entrada;
    String nombre;

    // Ejemplo de cómo se crea un arraylist
    ArrayList<Pedido> historial = new ArrayList<Pedido>();

    // Dentro de nuestro constructor en Control inicializamos nuesta vista, como
    // buena práctica se recomienda utilizar la inyección de clases
    public Control() {
        vista = new Vista(this);

        // Nuestra función menu() arranca la lógica de todo el código
        menu();
    }

    public void menu() {

        vista.mostrar("Ingrese su nombre");
        nombre = vista.capturar();

        do {
            vista.mostrar("\nQue bebida desea ordenar?: ");
            vista.mostrar("\t1. T�.");
            vista.mostrar("\t2. Late de Vainilla.");
            vista.mostrar("\t3. Soda.");
            vista.mostrar("\t4. Caf� negro normal.");
            int opcion = Integer.parseInt(vista.capturar());

            vista.mostrar("\nNombre cliente: " + nombre);
            vista.mostrar("\tPedido:\t\t\tPrecio:");

            cliente = new Pedido();
            switch (opcion) {
                case 1:
                    vista.mostrar("\tT�.\t\t\t" + cliente.getPrecioTe());
                    break;
                case 2:
                    vista.mostrar("\tLate de Vainilla.\t" + cliente.getPrecioLate());
                    break;
                case 3:
                    vista.mostrar("\tSoda.\t\t\t" + cliente.getPrecioSoda());
                    break;
                case 4:
                    vista.mostrar("\tCaf� negro normal.\t" + cliente.getPrecioCafe());
                    break;
                default:
                    vista.mostrar("Opci�n no v�lida.");
            }
            // Añadiendo elementos a un arraylist
            historial.add(cliente);

            // Iterando sobre los objetos de tipo Pedido dentro dek arraylist
            for (Pedido test : historial) {
                vista.mostrar("Precio: " + String.valueOf(test.getPrecioCafe()));

            }
            vista.mostrar(historial.toString());

            vista.mostrar("\n�Desea seguir pidiendo? (SI = 1 / NO = Cualquier otra tecla.)");
            entrada = Integer.parseInt(vista.capturar());
        } while (entrada == 1);
        vista.mostrar("Gracias por usar nuestro servicio.");
    }

}
