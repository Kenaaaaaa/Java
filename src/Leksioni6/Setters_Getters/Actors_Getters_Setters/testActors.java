package Leksioni6.Setters_Getters.Actors_Getters_Setters;

import java.util.Scanner;

public class testActors {
    public static void main(String[] args) {

        //Krijon nje konstruktor bosh
        //pasi e kemi krijuar bosh, atehere do ti cojme informacionet tek konstruktori bosh
        //meqenese nuk e aksesojme direkt dot variablin sepse eshte private, atehere
        //perdorim set
        Actors actor1=new Actors();
        Scanner input=new Scanner(System.in);

        System.out.println("Fut titullin");

        actor1.setTitulli(input.next());

        System.out.println("Fut vitin e prodhimit");
        actor1.setVitProdhimi(input.nextInt());

        System.out.println("Fut genre");
        actor1.setGenre(input.next());

        System.out.println("Fut nr Aktoreve ");
        actor1.setNrActors(input.nextInt());

        System.out.println("Fut review");
        actor1.setReview(input.nextInt());



        //Krijon nje konstruksion direkt me informacion
        // I marrim nga perdoruesi dhe pastaj ia kalojme direkt informacionet konstruktorit
        //fushat kane marre vlere qe ne krijim, keshtu qe nuk na duhen set
        //
        Scanner input2=new Scanner(System.in);

        System.out.println("Fut titullin");

         String titulli= input2.next();

        System.out.println("Fut vitin e prodhimit");
        int viti=input2.nextInt();

        System.out.println("Fut genre");
        String genre=input2.next();

        System.out.println("Fut nr Aktoreve ");
        int nrActors =input2.nextInt();

        System.out.println("Fut review");
        int review=input.nextInt();
        Actors actor2=new Actors( titulli, viti, genre, nrActors, review);


        if(   actor1.getVitProdhimi() > actor2.getVitProdhimi()){
            System.out.println("Aktori i pare po punon me shume vite");
        }
        else{
            System.out.println("Aktori i dyte punon me shume vite");
        }
    }
}
