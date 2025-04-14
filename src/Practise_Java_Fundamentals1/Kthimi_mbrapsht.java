package Practise_Java_Fundamentals1;
/* Kthimi i një numri mbrapsht
- Shpjegimi: Programi lexon një numër dhe përdor një cikël while për ta kthyer atë (p.sh. 123
→ 321).
- Shembull input: 456
- Shembull output: 654
*/


import java.util.Scanner;

public class Kthimi_mbrapsht {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Fut numrin qe do ");
        int nr=input.nextInt();

        int mbetja=0,nr_mbrapsht=0,i=1;

        while(nr>0){
            mbetja=nr%10;      //6
            nr=nr/10;              //45


        nr_mbrapsht=nr_mbrapsht*10+mbetja;//6
    }
        System.out.println(nr_mbrapsht);

    }
}
