package Model;

public abstract class Unidad {

    // Atributos a heredar
    protected int hp;
    protected String faccion;
    protected int def, defAP;

    // Constructor de la clase padre
    public Unidad(String faccion, int hp) {
        this.hp = hp;
        this.faccion = faccion;
    }

    // Método con lógica definida
    public String seleccionar() {
        return "Me has seleccionado";
    }

    // Método abstracto
    public abstract String mover();
}
