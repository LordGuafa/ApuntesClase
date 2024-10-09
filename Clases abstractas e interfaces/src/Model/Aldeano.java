package Model;

public class Aldeano extends Unidad implements Atacar, Recolectar {

    private int atq;

    public Aldeano(String faccion, int hp, int atq) {
        super(faccion, hp);
        this.atq = atq;
    }

    @Override
    public String mover() {
        return "Moviéndose a pie al destino";
    }

    @Override
    public String atacar() {
        return "Atacando con un poder de " + this.atq;
    }

    @Override
    public String recolectar() {
        return "Recolectando recursos";
    }

}
