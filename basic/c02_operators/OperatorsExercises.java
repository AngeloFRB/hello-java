package basic.c02_operators;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.

        var suma = 4 + 4;
        var resta = 23 - 10;
        var multiplicacion = 3 * 4;
        var division = 25 / 5;
        var resto = 30 % 8;

        // 2. Crea una variable para cada tipo de operación de asignación.

        int a = 3;
        System.out.println("Valos inicial de a = 3");
        System.out.println(a += 5);
        System.out.println(a -= 1);
        System.out.println(a *= 2);
        System.out.println(a /= 4);
        System.out.println(a %= 2);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println(true == true);
        System.out.println(34 <= 12);
        System.out.println((45-3) < 67);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println(true == false);
        System.out.println(23 < 3);
        System.out.println(78 > 98);

        // 5. Utiliza el operador lógico and.

        System.out.println(true && true);

        // 6. Utiliza el operador lógico or.

        System.out.println(false || true);

        // 7. Combina ambos operadores lógicos.

        System.out.println((true && true)||(false && true));

        // 8. Añade alguna negación.

        System.out.println((true && true)||!(false && true));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        int b = 3;
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);

        // 10. Combina operadores aritméticos, de comparación y lógicos.

        System.out.println(((4 > 3)&&(5>1))||(2 > 8));
    }
}
