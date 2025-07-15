package basic.c03_strings;

/*
Clase 34 - Ejercicios: Strings
Vídeo: https://youtu.be/JOAqpdM36wI?t=9838
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.

        var nombre = "Angelo";
        var ciudad = "Tarapoto";
        System.out.println("Me llamo " + nombre + " y vivo en " + ciudad);

        // 2. Muestra la longitud de una cadena de texto.

        System.out.println(ciudad.length());

        // 3. Muestra el primer y último carácter de un string.

        System.out.println(ciudad.charAt(0));
        System.out.println(ciudad.charAt(ciudad.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.

        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.

        var frase = " Yo naci en Tarapoto ";
        System.out.println(frase.contains("Tarapoto"));

        // 6. Formatea un string con un entero.

        var edad = 24;
        System.out.println(String.format("Este ano cumpli %d anos", edad));

        // 7. Elimina los espacios en blanco al principio y final de un string.

        System.out.println(frase.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).

        System.out.println(frase.replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.

        System.out.println(nombre.equals(ciudad));

        // 10. Comprueba si dos strings tienen la misma longitud.
        var word1 = "Anita lava la tina";
        var word2 = "La tina lava anita";
        System.out.println(word1.length()==word2.length());
    }
}
