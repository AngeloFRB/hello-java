package basic.c08_oop;

public class Rectangulo {
    private int width;
    private int height;
    public Rectangulo(int width, int height){
        if (width > 0 && height > 0){
            this.width = width;
            this.height = height;
        }else {
            System.out.println("Ambos valores deben ser positivos");
        }
    }
    public void setWidth(int width){
        if (width > 0){
            this.width = width;
        }else {
            System.out.println("Ingrese un valor valido");
        }
    }
    public void setHeight(int height){
        if (height > 0){
            this.height = height;
        }else {
            System.out.println("Ingrese un valor valido");
        }
    }
    public int calculateArea(){
        return width * height;
    }
}
