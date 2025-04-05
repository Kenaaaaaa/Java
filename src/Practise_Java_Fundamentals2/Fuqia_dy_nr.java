package Practise_Java_Fundamentals2;
/*7.	Shkruani një program që merr dy numra X dhe Y dhe përdor një cikël for për të llogaritur X^Y (X në fuqinë Y).
* */


import java.util.Scanner;

public class Fuqia_dy_nr {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("FUT NUMRIN E PARE   ");
        int x=input.nextInt();
        System.out.println("FUT NUMRIN E DYTE  ");
        int y=input.nextInt();
        int i,fuqia=1;

        for(i=0;i<=y;i++){
            System.out.println(x+" * "+ i+ " = "+fuqia);
            fuqia=x<<i;

        }


    }
}
