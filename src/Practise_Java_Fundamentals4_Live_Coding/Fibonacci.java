package Practise_Java_Fundamentals4_Live_Coding;

import java.util.Scanner;

/*Write  an  application  that  will  take  a  positive  number  from  the  user  (type  int)  and
calculate the Fibonacci number at the indicated index. For example, if the number equals
5, your program should print the fifth Fibonacci number. In Fibonacci sequence, each
number  is  the  sum  of  the  two  preceding  ones.  For  example,  the  first  few  Fibonacci
numbers are:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...*/
public class Fibonacci {
    //Metoda Fibonacci
    static int Fibonac(int n){
        if(n==1 || n==2){
            return 1;
        }
        int a=1,b=1;
        int rezultati=0;
        for (int i = 3; i <=n; i++) {
            rezultati=a+b;
            a=b;
            b=rezultati;
        }
        return rezultati;
    }
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Fut nr pozitiv");
        int n= input.nextInt();

        int fib=Fibonac(n);
        System.out.println("Nr Fibonaci tek index  ="+n+" eshte "+fib);
    }
}
