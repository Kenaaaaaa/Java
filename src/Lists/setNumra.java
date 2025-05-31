package Lists;
/*Krijoni nje Set me disa numra dhe shtoni disa elemente te njejta
* Printoni elementet unike te Set-it*/
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setNumra {
    public static void main(String[] args) {
        //set apo arraylist do si tip klasa jo primitive
        Scanner input = new Scanner(System.in);
        Set<Integer> numberSet=new HashSet<> ();
        System.out.println("Fut vlerat");
        while(true){
            int numri = input.nextInt();
            if(numri == 0) {
                break; // Nese numri eshte 0, dalim nga cikli
            }
            numberSet.add(numri);
            for(Integer numb:numberSet){
                // Shton numrin ne set, automatikisht eleminon duplikimet
            }
        }

    }
}
