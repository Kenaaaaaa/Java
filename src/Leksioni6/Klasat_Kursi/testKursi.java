package Leksioni6.Klasat_Kursi;

import java.util.Scanner;

public class testKursi {
    public static void main(String[] args) {
        //Konstruktori, eshte ai qe ben kopjen e klases
        Kursi kursi1= new  Kursi();
        Scanner input= new Scanner(System.in);
        //KURSI 1
        System.out.println(" Fut titullin e kursit te pare ");
        kursi1.titulli=input.nextLine();

        System.out.println("Fut numrin e Oreve te kursit te pare ");
        kursi1.nrOresh=input.nextFloat();
        System.out.println("Fut TrainerID te kursit te pare ");
        kursi1.TrainerID=input.next();
        System.out.println("Fut numrin e muajve per kursin e pare ");
        kursi1.nrMuaj=input.nextInt();

        // KURSI 2
        Kursi kursi2=new Kursi();
        System.out.println("Fut titullin e kursit te dyte ");
        kursi2.titulli=input.next();
        System.out.println("Fut numrin e Oreve te kursit te dyte ");
        kursi2.nrOresh=input.nextFloat();
        System.out.println("Fut TrainerID te kursit te dyte ");
        kursi2.TrainerID=input.next();
        System.out.println("Fut numrin e muajve per kursin e dyte ");
        kursi2.nrMuaj=input.nextInt();


        //Kontrollo nese kursi i pare eshte me shume se 1 vit
        if(kursi1.checkMoreThan1Year()==true){
            System.out.println("Kursi i"+kursi1.titulli+" eshte me i gjate ese 1 vit");
        }
        else{
            System.out.println("Kursi i pare nuk eshte me i gjate ese 1 vit");

        }

        //Kontrollo nese kursi i dyte  eshte me shume se 1 vit
        if(kursi2.checkMoreThan1Year()==true){
            System.out.println("Kursi i "+kursi2.titulli+" eshte me i gjate ese 1 vit");
        }
        else{
            System.out.println("Kursi i pare nuk eshte me i gjate ese 1 vit");

        }

    }
}
