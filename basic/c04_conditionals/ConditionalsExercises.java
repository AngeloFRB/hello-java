package basic.c04_conditionals;

/*
Clase 38 - Ejercicios: Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=11021
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).

        var edad = 32;
        if (edad >= 18){
            System.out.println("El usuario puede votar");
        }else {
            System.out.println("El usuario no puede votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        var first = 123;
        var second = 89;
        if (first > second){
            System.out.println(String.format("El numero mayo es %d", first));
        }else if (first < second){
            System.out.println(String.format("El numero mayo es %d", second));
        }else {
            System.out.println("Ambos numero son iguales");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        var numero = 57;
        if (numero > 0){
            System.out.println("El numero es positivo");
        }else if (numero < 0){
            System.out.println("El numero es negativo");
        }else {
            System.out.println("El numero es 0");
        }

        // 4. Crea un programa que diga si un número es par o impar.

        if (numero%2 == 0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.

        if(numero > 1 && numero < 100){
            System.out.println("El numero se encuentra entre el rango de 1 a 100");
        }else {
            System.out.println("El numero no se encuentra entre el rango de 1 a 100");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        var day = 2;
        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Ingrese un numero entre el rango de 1 a 7");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        var nota = 80;
        switch (nota/10){
            case 10:
            case 9:
            case 8:
                System.out.println("Sobresaliente");
                break;
            case 7:
            case 6:
            case 5:
                System.out.println("Aprobado");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("Suspenso");
                break;
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        var persona = 34;
        var acompanado = false;
        if (persona >= 15 || acompanado){
            System.out.println("Puede ingresar al cine");
        }else {
            System.out.println("Debe tener por lo menos 15 anos o estar acompanado");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        var letra = "z";
        var LetraLower = letra.toLowerCase();
        var vocales = "aeiou";
        if (vocales.contains(letra)){
            System.out.println("La letra es una vocal");
        }else {
            System.out.println("La letra es una consonante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        var a = 23;
        var b = 1223;
        var c = 23;
        if (a == b && a == c){
            System.out.println("Los tres numero son iguales");
        } else if(a > b && a > c){
            System.out.println(String.format("El numero mayo es %d", a));
        }else if (b > a && b > c){
            System.out.println(String.format("El numero mayo es %d", b));
        }else if (c > b && c > a){
            System.out.println(String.format("El numero mayo es %d", c));
        }else {

        }
    }
}
