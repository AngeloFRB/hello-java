package basic.c08_oop;

public class Temperature {
    private double celsius;
    public Temperature(double celsius){
        this.celsius = celsius;
    }
    public void setCelsius(double celsius){
        if (celsius <= -100 || celsius >= 100){
            System.out.println("Valos no valido, por favor ingrese una temperatura entre -100  y 100 grados celsius");
        }else {
            this.celsius = celsius;
            System.out.println("La temperatura actual es de: "+ celsius + " grados celsius");
        }
    }
}
