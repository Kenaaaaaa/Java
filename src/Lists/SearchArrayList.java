package Lists;
/*Write a Java program to search for an element in an array list.

 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchArrayList {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fut vlerat e elemeneteve");
        //deklarojme nje liste te tipit Integer
        List<Integer>nrList=new ArrayList<>();
        int nr;
        //Vendosim qe te shtojme elementet ne liste
        System.out.println("Vendosni nje numer ose -1 per te mbaruar programin:");

        while(true){
            nr=input.nextInt();
            if(nr==-1){
                break;
            }
            nrList.add(nr);
        }
        for (int i = 0; i <nrList.size() ; i++) {
           if(nrList.get(i)==5){
                System.out.println("Numri 5 ndodhet ne indexing " + i);
            }
        }
    }
}
