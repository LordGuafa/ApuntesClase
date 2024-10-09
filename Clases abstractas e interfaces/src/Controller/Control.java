package Controller;

import Model.Aldeano;
import Model.Pesquero;
import View.Vista;

public class Control {

    Vista vista;
    Aldeano aldeano;
    Pesquero pesquero;

    public Control() {
        vista = new Vista();
        init();
    }

    public void init() {
        // Se crean las clases
        aldeano = new Aldeano("Borgoña", 50, 3);
        pesquero = new Pesquero("Bizantino", 100);

        // Se prueban los métodos
        vista.mostrar(aldeano.seleccionar());
        vista.mostrar(pesquero.seleccionar());
        vista.mostrar(aldeano.mover());
        vista.mostrar(pesquero.mover());
    }
}
