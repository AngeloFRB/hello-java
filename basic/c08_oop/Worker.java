package basic.c08_oop;

public class Worker {
    String name;
    double salario;

    //Constructor
    public Worker(String name, double salario){
        this.name = name;
        this.salario = salario;
    }

    //Metodo para mostrar su salario
    public void showSalary(){
        System.out.println("El salario de "+ name+ " es de: S/." + salario);
    }
}
