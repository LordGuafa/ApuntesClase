public class App{
    public static void main(String[] args) {

        //Declaramos las variables
        int naturales[] = new int[10];
        int[] enteros = {-5, -4, -3, -2 , -1};
        int i,j;

        /*Un for each que imprime el arreglo "enteros" con sus valores iniciales
        la forma enque trabaja este foreach es:
        - crea una variable que se irá iterando y guardará el elemento del arreglo 
        que esté trabajando en dicha iteración. 
        Entonces crea la variable n, va a al primer elemento del arreglo, crea un copia que guarda en n
        y realiza la instrucción, en este caso, imprimir el elemento
           */
        System.out.println("Arreglo enteros inicial");
        for (int n: enteros) {
            System.out.print(n + " ");
        }

        //Intentamos cambiar el valor de los elementos del arreglo mediante un foreach,
         //pero no funcionará debido a que estamos es modificando la variable número
         // no el elemento del arreglo
        for (int numero : enteros) {
            numero = 0;  // Cambia la copia de "numero", no el arreglo original
        }

        //Un foreach que usamos para imprimir nuevamente el arreglo,
        //pero veremos que sus valores no han cambiado
        System.out.println("\n"+"Arreglo enteros tras el cambio");
        for(int y: enteros){
            System.out.print(y + " ");
        }

        //Llenamos el arreglo de naturales
        //Este for itera en cada poscición del arreglo y al contenido le asigan i+1
        for(i=0;i<10;i++){
            naturales[i] = i+1;
        }

        //Un for para imprimir el arreglo "naturales"
        System.out.print("\n"+"Arreglo naturales inicial" + "\n");
        for(int k=0;k<naturales.length;k++){
            System.out.print(naturales[k] + " ");
        }

        //Este for itera en cada poscición del arreglo y al contenido le asigan i+1
        for(j=0;j<naturales.length;j++){
            naturales[j] = j*2;
        }
        //Un for que imprime el arreglo "naturales" después de modificar su contenido
        System.out.println("\n"+"Arreglo naturales tras el cambio");
        for (int y : naturales) {
            System.out.print(y+ " ");
        }

        /*
         * No permite modificar la colección (como añadir o eliminar elementos) durante la iteración 
         * si estás usando ciertas colecciones como List.
         * No tienes acceso al índice del elemento actual de forma directa
         */

    }
}
