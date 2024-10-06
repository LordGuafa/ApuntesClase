package Modelo;
public class Milicia extends Aldeano{
    private String espada = "spatha";
    private String escudo = "escudo madera";
    public Milicia(String color){
        super(color);
    }

    public String armarse(){
        return " se ha puesto su "+ espada +" y su " + escudo;
    }

    @Override
    public String atacar(){
        return "Milicia de los " + faccion + this.armarse() +" y está atacando"; 
    }
}
