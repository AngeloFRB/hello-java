package basic.c08_oop;

public class Product {
    String product;
    double precio;
    public Product(String product, double precio){
        this.product = product;
        this.precio = precio;
    }
    public void descuento(double descuento){
        var newPrice = precio - (precio * descuento/100);
        System.out.println("El valor del producto: "+ product + " con descuento del "+ descuento+ "% es de "+ newPrice);
    }

}
