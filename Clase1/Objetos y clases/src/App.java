public class App {
    public static void main(String[] args) throws Exception {

        // Creación de un objeto con constructor vacío
        Aldeano aldeanoDefault = new Aldeano();

        // Creación de un objeto con constructor vacío
        Aldeano aldeanoCustom = new Aldeano("Borgoñones", 0.8, 70);

        // Llamar un método
        aldeanoDefault.caminar();

        // Llamar atributos
        System.out.println("El aldeano pertenece a la facción: " + aldeanoCustom.faccion);
    }
}
