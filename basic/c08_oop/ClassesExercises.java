package basic.c08_oop;

/*
Clase 58 - Ejercicios: Clases y objetos
Vídeo: https://youtu.be/JOAqpdM36wI?t=21434
*/

import com.sun.tools.jconsole.JConsoleContext;

import java.util.ArrayList;

public class ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.

//        var libro = new Book();
//        libro.tittle = "Juego de Tronos";
//        libro.autor = "George R. Martin";
//        System.out.println(libro.autor);
//        System.out.println(libro.tittle);

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.

        var sonido  = new Dog();
        sonido.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.

        var nuevoLibro = new Book("Aprendiedo Java", "MoureDev");

        // 4. Crea una clase Car con atributos brand y model y un método showData().

        var auto  = new Car();
        auto.showdata("Chevroles", "Sonic");

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).

        var carlos = new Student(23);
        carlos.nota();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.

        var cuenta = new BankAccount(240.50);
        cuenta.deposit(100);

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.

        var rectangulo1 = new Rectangle(3, 5);
        rectangulo1.area();
        rectangulo1.perimetro();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.

        var salarioWalter = new Worker("Walter", 12000);
        salarioWalter.showSalary();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        ArrayList<Persons> personas = new ArrayList();
        var persona1 = new Persons("Jose", 23, "masculino");
        var persona2 = new Persons("Maria", 54, "femenino");
        var persona3 = new Persons("Andre", 3, "femenino");
        var persona4 = new Persons("Robert", 87, "masculino");

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        for(Persons persona : personas){
            System.out.println("Nombre: " + persona.nombre);
            System.out.println("Edad: " + persona.edad);
            System.out.println("Genero: " + persona.sexo);
            System.out.println("-------------------------------------");
        }

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var producto = new Product("Leche entera", 15.5);
        producto.descuento(50);
    }
}
