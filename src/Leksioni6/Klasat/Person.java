package Leksioni6.Klasat;

public class Person {

    //bejme deklarimet, Fushat e Klases /variablaet e istances
    public String emer;
    public String mbiemer;
    public int mosha;


    //Metodat
   void Afisho(){
        System.out.println(mosha);
        System.out.println(emer);
        System.out.println(mbiemer);
    }

    public boolean isAdult(){
        if(mosha>=18){
            return  true;
        }
        else{
        return false;
        }
    }

}
