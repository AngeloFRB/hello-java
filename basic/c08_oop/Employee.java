package basic.c08_oop;

public class Employee {
    private double salary;
    public Employee(double salary){
        if (salary > 0){
            this.salary = salary;
        }else {
            System.out.println("Ingrese un salario valido");
        }
    }
    public void raiseSalary(double percent){
        if (percent < 0){
            System.out.println("Solo se permite aumentos mayores al salario");
        }else {
            this.salary += salary * (percent/100);
            System.out.println("Su salario actual es de: " + salary + "USD");
        }
    }
}
