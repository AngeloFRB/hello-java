package basic.c08_oop;

public class BankAccount2 {
    private double balance;
    public BankAccount2(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount >0){
            balance += amount;
        }else {
            System.out.println("Ingrese un monto valido");
        }
        System.out.println("Su saldo actual es de: " + balance);
    }
    public void withdraw(double amount){
        if (amount > 0){
            if (amount <= balance){
                balance -= amount;
            }else {
                System.out.println("No cuenta con los fondos suficientes");
            }
        }else {
            System.out.println("Ingrese un monto valido");
        }
        System.out.println("Su saldo actual es de: " + balance);
    }
    public double getBalance(){
        System.out.println("Su saldo actual es de: " + balance);
        return balance;
    }
}
