package Encapsulation.Student;

public class Student {
   private String name;
    private int age;
   private  String className;

    //konstruktoret
    public Student(){
    }

    //Konstruktor me parametra
    public Student(String name, int age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }
    //setters
    public void setName(String name){
        this.name=name;
    }

    //getters
    public String getName(){
        return name;
    }

    //Metoda per te shfaqur informacionin e studentit

    @Override
    public String toString() {
        return super.toString();
    }
}
