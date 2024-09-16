public class estructurasDeControl {

    public static void main(String[] args) {
        // If: Se usa para la toma de decisiones
        int edad = 18;
        if (edad < 18) {
            System.out.println("Solo se permiten mayores de edad");
        } else {
            System.out.println("Bienvenido!!!");
        }

        // Switch: Permite elegir entre varias opciones predefinidas sin tener que
        // anidar tantos if
        int validar = 2;
        switch (validar) {
            case 1:
                System.out.println("Caso 1");
                break; // La palabra reservada "break" se usa para salir del bloque. También sirve en
            // bloques for y while
            case 2:
                System.out.println("Caso 2");
                break;
            default:
                System.out.println("Entro aquí si no se entra a ningún caso");
                break;
        }
        // For: se usa para iterar sobre algo UNA CANTIDAD ESPECÍFICA DE VECES de veces
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // While, Se usa para iterar indefinidamente HASTA QUE SE CUMPLA UNA CONDICIÓN
        int otraEdad = 0;
        while (otraEdad < 18) {
            System.out.println(
                    "Solo tienes " + otraEdad + " años, necesitas tener 18");
            otraEdad++; // Al igual que en C++ si queremos incrementar de a 1, podemos utilizar el "++"
        }
        // Do while: Funciona exactamente igual que el while con la diferencia que
        // SIEMPRE VA A INGRESAR AL MENOS UNA VEZ a lla lógica de su contenido

        Boolean ejemplo = true;
        do {
            System.out.println("Entro al menos una vez aunque la condición no se cumpla");

        } while (!ejemplo); // Una forma de establecer la negación de una condición (Booleano) es poniendo
                            // el símbolo "!"

    }
}
