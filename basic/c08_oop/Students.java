package basic.c08_oop;

public class Students {
    private int grade;
    public  Students(int grade){
        if (grade >= 0 && grade <= 100){
            this.grade = grade;
        }else{
            System.out.println("La nota debe estar entre 0 y 100");
        }
    }
    public void setGrade(int grade){
        if (grade > 0){
            this.grade = grade;
        }else{
            System.out.println("La nota debe estar entre 0 y 100");
        }
    }
    public boolean isPassed(){
        return grade>=60;
    }
}
