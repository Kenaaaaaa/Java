package Leksioni6.Klasat;

public class testPerson {
    public static void main(String[] args) {
        //automatikisht rreshti me poshte, ben thirrjen e kopjes bosh bydefault person
        Person person1=new Person();
        person1.emer="Kena";
        person1.mbiemer="Agalliu";
        person1.mosha=70;

        person1.Afisho();

        Person person2=new Person();
        person2.mosha=12;
        person2.mbiemer="Fiktiv";
        person2.emer="Test";
        //Java thote a ka nje metode me te njejtin emer me klasen Person, ne kete rast Java ta krijon vete bydefault, mta ben lidhjen

        if(person1.mosha>person2.mosha){
            System.out.println(person1.emer+" eshte me i madh ne moshe");
        }
        else {
            System.out.println(person2.emer+ " eshte me i madh ne moshe");
        }

        System.out.println(person1.emer+" Is Adult ? "+ person1.isAdult());
    }
}
