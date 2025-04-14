package Practise_Java_Fundamentals1;
/*Gjendja e ujit bazuar në temperaturë
- Shpjegimi: Programi lexon një temperaturë dhe përdor if për të përcaktuar nëse uji është i
ngurtë (≤ 0°C), i lëngët (0°C - 100°C), apo i gaztë (> 100°C).
- Shembull input: 85
- Shembull output: "Uji është në gjendje të lëngët."*/

import java.util.Scanner;

public class Temperatura_Ujit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Fusni temperaturen");
        int temp=input.nextInt();

        if(temp<=0){
            System.out.println("Uji eshte i ngrire");
        } else if (temp<=100) {
            System.out.println("Uji eshte i lenget");
        }
        else{
            System.out.println("Uji eshte i gazte");
        }
    }
}
