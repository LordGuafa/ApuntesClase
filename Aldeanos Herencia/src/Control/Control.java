package Control;

import Modelo.Aldeano;
import Modelo.Milicia;
import Vista.Impresora;

public class Control {

    Aldeano aldeanoRojo;
    Aldeano aldeanoAzul1;
    Aldeano aldeanoBlanco;
    Milicia miliUno;
    Impresora vista = new Impresora();

    public Control() {
        aldeanoRojo = new Aldeano("Rojo");
        aldeanoAzul1 = new Aldeano("Azul");
        aldeanoBlanco = new Aldeano("Blanco");
        miliUno = new Milicia("Negro");
        vista = new Impresora();
        iniciar();
    }

    public void iniciar() {
        // 7vista.imprimir(aldeanoRojo.caminar());
        // vista.imprimir(aldeanoAzul1.atacar());
        vista.imprimir(aldeanoBlanco.atacar());
        vista.imprimir("La milicia " + miliUno.getColor() + miliUno.armarse());
        // vista.imprimir(miliUno.caminar());
        asignarFaccion(miliUno);
        vista.imprimir(miliUno.atacar());

        aldeanoBlanco = new Milicia("Blanco");
        aldeanoBlanco.mejorar();
        asignarFaccion(aldeanoBlanco);
        vista.imprimir(aldeanoBlanco.atacar());
    }

    public void asignarFaccion(Aldeano mili) {
        switch (mili.getColor()) {
            case "Rojo":
                mili.setFaccion("inglaterra");
                break;
            case "Azul":
                mili.setFaccion("Francia");
                break;
            case "Blanco":
                mili.setFaccion("Teutónicos");
                break;

            case "Negro":
                mili.setFaccion("Hospitalarios");
                break;
            default:
                break;
        }
        vista.imprimir("La facción de la milicia es: " + mili.getFaccion());
    }
}
