package basic.c08_oop;

/*
Clase 60 - Ejercicios: Modificadores de acceso
Vídeo: https://youtu.be/JOAqpdM36wI?t=23202
*/

public class AccessModifiersExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        var personita1 = new Persona("Luis", 24);
        System.out.println(personita1.getName());
        System.out.println(personita1.getAge());
        personita1.setName("Luis Alberto");
        personita1.setAge(34);
        System.out.println(personita1.getName());
        System.out.println(personita1.getAge());

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        var precioSeteado = new Producto(25.70);
        precioSeteado.setPrice(15.70);

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.

        var cuentaAngelo = new BankAccount2(2890.70);
        cuentaAngelo.getBalance();
        cuentaAngelo.deposit(2000);
        cuentaAngelo.withdraw(550.7);

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.

        var miLibro = new Book2("Guia de programacion en Java");
        System.out.println(miLibro.getTittle());

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

        var temperatura = new Temperature(45);
        temperatura.setCelsius(23.5);

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y
        // checkPassword(String inputPassword) que compare contraseñas.

        var zeker = new User("zeker", "qwerty123");
        zeker.setUsername("byzeker1");
        zeker.checkPassword("sdfsasdfa");

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent)
        //  que solo permita aumentos positivos.

        var salaryEmployee = new Employee(550);
        salaryEmployee.raiseSalary(50);

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el
        // método calculateArea() que devuelva el resultado de width * height.

        var rectagulo = new Rectangulo(8, 4);
        rectagulo.setHeight(10);
        rectagulo.setWidth(20);
        System.out.println(rectagulo.calculateArea());

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que
        // retorne true si la nota es mayor o igual a 60.

        var notaStudent = new Students(60);
        System.out.println(notaStudent.isPassed());
        notaStudent.setGrade(12);
        System.out.println(notaStudent.isPassed());

        // 10. Crea una clase Cars con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente
        // la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).

        var audi = new Cars(100);
        System.out.println(audi.getSpeed());
        audi.accelerate(10);
        System.out.println(audi.getSpeed());
        audi.brake(50);
        System.out.println(audi.getSpeed());
    }
}
