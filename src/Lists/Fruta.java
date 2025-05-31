package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/*Krijo nje list te frutave List dhe shtoni disa fruta me duplikim.
Pas shtimit te elementeve printoni listen dhe llogaritni numrin e elementeve te saj*/
public class Fruta {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Shkruani frutat qe doni te fusni");
        List<String> frutat=new ArrayList<>();
        frutat.add(input.nextLine());
        System.out.println("Shtoni me shume fruta, shtypni 'exit' per te mbaruar");
        frutat.add(input.nextLine());
        System.out.println(frutat);
        System.out.println(frutat.size());
        for(String fruta:frutat) {
            if(fruta.equals("exit")) {
                break;
            }
            if(!frutat.contains(fruta)) {
                frutat.add(fruta);
            } else {
                System.out.println("Fruta " + fruta + " tashme ekziston ne liste.");
            }
        }
    }
}
