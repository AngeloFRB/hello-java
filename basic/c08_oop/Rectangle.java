package basic.c08_oop;

public class Rectangle {
    double alto;
    double ancho;

    //Constructor
    public Rectangle(double alto, double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    //Metodo para el Perímetro
    public void perimetro(){
        var perimetro = (alto * 2) + (ancho * 2);
        System.out.println("El perimetro del rectangulo es de: "+ perimetro);
    }

    //Metodo para el Área
    public void area(){
        var area = alto * ancho;
        System.out.println("El area del rectangulo es de: " + area);
    }
}
