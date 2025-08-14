package basic.c08_oop;

public class Producto {
    private double price;
    public Producto(double price){
        this.price = price;
    }
    public void setPrice(double price){
        if(price > 0){
            this.price = price;
            System.out.println(price);
        }else {
            System.out.println("Ingrese un precio valido");
        }
    }
}
