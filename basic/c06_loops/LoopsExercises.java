package basic.c06_loops;

/*
Clase 50 - Ejercicios: Bucles
Vídeo: https://youtu.be/JOAqpdM36wI?t=17993
*/

import java.util.*;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.

        int index = 1;
        while(index <= 10){
            System.out.println(index);
            index++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.

        ArrayList<Integer> edades = new ArrayList<Integer>();
        edades.add(23);
        edades.add(12);
        edades.add(53);
        edades.add(2);
        System.out.println(edades);
        int a = 0;
        do {
            System.out.println(edades.get(a));
            a++;
        }while (a<edades.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

        for (int b = 1; b <= 50; b++){
            if (b % 5 == 0){
                System.out.println(b);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.

        Integer[] numbers = {2, 3, 4, 5};
        var cont = 0;
        for (int c = 0; c < numbers.length; c++){
            cont += numbers[c];
        }
        System.out.println(cont);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.

        for (int c = 0; c < numbers.length; c++){
            System.out.println(numbers[c]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        HashSet<String> autos = new HashSet<>();
        autos.add("Ferrari");
        autos.add("Toyota");
        autos.add("Chevrolet");
        autos.add("Ford");
        for (String marcas : autos){
            System.out.println(marcas);
        }

        HashMap<String, String > bancos = new HashMap<>();
        bancos.put("Banco de Credito", "BCP");
        bancos.put("Banco de la Nacion", "BN");
        bancos.put("Interbank", "INBK");
        bancos.put("ScotiaBank", "SCKB");

        for (Map.Entry<String, String> nombres : bancos.entrySet()){
            System.out.println(nombres.getKey());
            System.out.println(nombres.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

        for (int c = 10; c >= 1; c--){
            System.out.println(c);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        for (int d = 1; d <= 20; d ++){
            if (d % 3 == 0){
                continue;
            }
            System.out.println(d);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.

        Integer[] valores = {3, 2, -2, 4, 5, -6};
        for (int e = 0; e < valores.length; e++){
            if(valores[e] < 0){
                break;
            }
            System.out.println(valores[e]);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.

        int inciador = 1;
        int factorial = 5;
        for (int f = factorial; f >=1; f--){
            inciador *= f;
        }
        System.out.println(inciador);
    }
}
