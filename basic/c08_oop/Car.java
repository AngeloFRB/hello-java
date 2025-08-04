package basic.c08_oop;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Car {
    String brand;
    String model;
    public void showdata(String brand, String model){
        System.out.println("El auto es de marca: " + brand + " y modelo: " + model);
    }
}
