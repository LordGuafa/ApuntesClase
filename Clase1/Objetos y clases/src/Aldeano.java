public class Aldeano {
    // Atributos de una clase (variables que lo conforman)

    String faccion;
    double velocidad = 0.5; // Los atributos pueden venir con valores por defecto
    int hp = 50;

    // Constructor vacío: Se utiliza para crear los objetos de esta clase con
    // atributos por defecto. Si no se crea un constructor con parámetros Java crea
    // uno de estos de forma automática sin tener que declararlo
    public Aldeano() {
        this.faccion = "Gaia"; // Se utiliza la palabra reservada "this" para apuntar al atributo del objeto
                               // especifico que se está creando
    }

    // Constructor con parámetros: Lo usamos cuando creamos objetos cuyos atributos
    // son definidos durante la ejecución del programa
    public Aldeano(String faccion, double velocidad, int hp) {
        // Por buenas prácticas los parámetros que pasamos por el constructor tienen el
        // mismo nombre de su atributo asignado por legibilidad de código
        this.faccion = faccion;
        this.velocidad = velocidad;
        this.hp = hp;
    }

    // Métodos: Son funciones que definen el comportamiento de una clase (lógica)
    public void caminar() {
        System.out.println("Aldeano caminando");
    }
}
