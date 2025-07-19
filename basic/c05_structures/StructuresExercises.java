package basic.c05_structures;

/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.

        String[] deportes = {"futbol", "basquet", "tenis", "balonmano", "voley"};
        System.out.println(deportes.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.

        System.out.println(deportes[3]);
        deportes[3] = "natacion";
        System.out.println(deportes[3]);

        // 3. Crea un ArrayList vacío.

        var datos = new ArrayList<String>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.

        datos.add("Nombre");
        datos.add("Apellido");
        datos.add("Correo");
        datos.add("Ciudad");
        System.out.println(datos);
        datos.remove(3);
        System.out.println(datos);

        // 5. Crea un HashSet con 2 valores diferentes.

        var animales = new HashSet<String>();
        animales.add("perro");
        animales.add("gato");
        System.out.println(animales);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.

        animales.add("gato");
        System.out.println(animales);
        animales.add("raton");
        System.out.println(animales);

        // 7. Elimina uno de los elementos del HashSet.

        animales.remove("gato");
        System.out.println(animales);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.

        var persona = new HashMap<String , Integer>();
        persona.put("Angelo", 982384858);
        persona.put("Monica", 923482823);
        persona.put("Walter", 923429899);
        System.out.println(persona.get("Monica"));
        System.out.println(persona);

        // 9. Modifica uno de los contactos y elimina otro.

        persona.put("Walter", 918234432);
        System.out.println(persona);
        persona.remove("Angelo");
        System.out.println(persona);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

        String[] ejemplo = {"mouse","monitor","teclado","cpu"};
        System.out.println(ejemplo[2]);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(ejemplo));
        System.out.println(arrayList);
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(ejemplo));
        System.out.println(hashSet);
        
    }
}
