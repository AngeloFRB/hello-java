package basic.c01_beginner;

/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.

        String MiNombre = "Angelo";
        System.out.println(MiNombre);

        // 2. Crea una variable de tipo int y asígnale tu edad.

        int MiEdad = 24;

        // 3. Crea una variable double con tu altura en metros.

        double MiEstatura = 1.70;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.

        boolean TeGustaProgramar = true;

        // 5. Declara una constante con tu email.

        final String Email = "angelofrancob01@gmail.com";
        System.out.println(Email);

        // 6. Crea una variable de tipo char y guárdale tu inicial.

        char inicial = 'A';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.

        String localidad = "San Martin";
        localidad = "Tarapoto";

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.

        int a = 12;
        int b = 10;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.

        System.out.println(localidad.getClass().getSimpleName());
        System.out.println(Email.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.

        String variable;
        variable = "Este es un string";
        System.out.println(variable);
    }
}
