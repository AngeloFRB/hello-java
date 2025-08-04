package basic.c08_oop;

public class Student {
    int score;
    public Student(int score){
        this.score = score;
    }
    public void nota(){
        if (score >= 60){
            System.out.println("Aprobado");
        }else {
            System.out.println("Desaprobado");
        }
    }
}
