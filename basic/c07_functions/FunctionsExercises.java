package basic.c07_functions;

/*
Clase 55 - Ejercicios: Funciones
Vídeo: https://youtu.be/JOAqpdM36wI?t=19521
*/

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {

    public static void main(String[] args) {
        bienvenida();
        saludo("Angelo");
        System.out.println(resta(23, 3));
        System.out.println(cuadrado(8));
        System.out.println(parImpar(40));
        System.out.println(mayoDeEdad(32));
        System.out.println(longitud("Aprediendo Java"));
        System.out.println(media(new int[]{2, 2}));
        System.out.println(factoria(5));
        autos(new ArrayList<>(Arrays.asList("Toyota","Audi", "Chevrolet")));
    }
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".

    public static void bienvenida(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }


        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    public static void saludo(String nombre){
        System.out.println("Hola " + nombre + ", bienvenido.");
    }

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
    public static Integer resta (int a, int b){
        return a - b;
    }

        // 4. Crea un método que calcule el cuadrado de un número (n * n).

    public static Integer cuadrado(int n){
        return n * n;
    }

        // 5. Escribe una función que reciba un número y diga si es par o impar.

    public static String parImpar(int p){
        return p % 2 == 0? "Es par" : "Es impar";
    }

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).

    public static boolean mayoDeEdad(int edad){
        return edad >= 18? true: false;
    }

        // 7. Implementa una función que reciba una cadena y retorne su longitud.

    public static Integer longitud(String cadena){
        return cadena.length();
    }

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.

    public static double media(int[] numeros){
        var suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        var media = suma/numeros.length;
        return media;

    }

        // 9. Escribe un método que reciba un número y retorna su factorial.

    public static Integer factoria(int f){
        var fact = 1;
        for (int i = f; i >= 1; i--){
            fact *= i;
        }
        return fact;
    }

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
     public static void autos(ArrayList<String> listaAutos){
         for(String modelos : listaAutos){
            System.out.println(modelos);
        }
     }

}
