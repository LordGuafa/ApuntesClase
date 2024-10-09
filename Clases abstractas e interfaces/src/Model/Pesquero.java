package Model;

public class Pesquero extends Unidad implements Recolectar, Navegar {

    public Pesquero(String faccion, int hp) {
        super(faccion, hp);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String recolectar() {
        return "Pescando un banco de peces";
    }

    @Override
    public String mover() {
        return navegar();
    }

    @Override
    public String navegar() {
        return "Remando hacia la zona de pesca";
    }

}
