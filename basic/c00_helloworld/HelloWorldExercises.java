package basic.c00_helloworld;

/*
Clase 14 - Ejercicios: Primeros pasos
Vídeo: https://youtu.be/JOAqpdM36wI?t=5108
*/

public class HelloWorldExercises {

    public static void main (String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".


        System.out.println("Angelo");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.

        System.out.println("Este es un mensaje \nen dos lineas jeje");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.

        // La lina 10 imprime mi nombre y la linea 19 imprime un mensaje en dos lineas usando un solo println

        // 4. Crea un comentario en varias líneas.

        /*Este es un comentario en varias
        lineas de codigo usando el lenguaje
        de Java, genial!
        */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.

        System.out.println("Mi edad es 24 anos");
        System.out.println("Mi color favorito es el azul");
        System.out.println("Mi ciudad es Tarapoto");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".

        System.err.println("Muestrame que hace el err");

        // 7. Utiliza varios println para imprimir una frase.

        System.out.println("Para aprender a programar");
        System.out.println("Se debe programar");
        System.out.println("No hay otra forma");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).

        System.out.println(" o o ");
        System.out.println("  v ");
        System.out.println(" ___  ");
        // 9. Intenta ejecutar el programa sin el método main y observa el error.

        //El programa no compila

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
         // Al cambiar el nombre del archivo, automoaticamete la clase toma el nueveo nombre tambien, por lo que sigue compilando sin ningun problema
    }
}