package Practise_Java_Fundamentals4_Live_Coding.Autori;

public class Main {
    public static void main(String[] args) {

    //Krijojme autoret
    Author author1=new Author("Shakespeare","English");
    Author author2= new Author("Goethe","German");
    Author author3=new Author("Naimi","Albanian");

    //Krijojme poemat
    Poem poem1=new Poem(author1,14);
    Poem poem2=new Poem(author2,20);
    Poem poem3= new Poem(author3,18);

    //I ruajme poemat ne tabele
    Poem[] poems={poem1,poem2,poem3};

    //Gjejme autorin me poemen me te gjate
    Poem longestPoem=poems[0];
    for(int i=1;i< poems.length;i++){
        if(poems[i].getStropheNumbers() >longestPoem.getStropheNumbers()){
            longestPoem=poems[i];
        }
    }System.out.println("Autori që ka shkruar poezinë më të gjatë është: " +
            longestPoem.getCreator().getSurname());
}


}
