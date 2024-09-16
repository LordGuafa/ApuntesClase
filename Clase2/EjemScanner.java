import java.util.Scanner; //importamos la libreria necesaria 

public class EjemScanner {
    public static void main(String[] args) {
        //Creamos el objeto Scanner
        Scanner lector = new Scanner(System.in);

        System.out.println("Hola que hace");
        System.out.print("nada");
        System.out.print(" parce y ud \n");

        //Guardamos lo que se vaya a ingresar por consola como un String
        String respuesta = lector.nextLine();
        System.out.println(respuesta);

        System.out.println("Responde lo siguiente: \nEdad      altura   codigo");
        //Guardamos lo que se vaya a ingresar por consola como un entero, como un double y como un long
        //cada vez que se oprima la tecla enter se guardará en la variable lo que se haya escrito
        int edad = lector.nextInt(); //Con el primer enter se guarda la edad
        double altura = lector.nextDouble();//Con el segudno enter se guarda la altura
        long codigo = lector.nextLong();//Con el tercer enter se guarda la edad

        System.out.print("Info: \n edad : " + edad + "\naltura: " + altura + "\ncodigo "  + codigo );

    }
}
