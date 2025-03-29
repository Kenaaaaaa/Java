package Leksioni2;

public class Operatoret {
    public static void main(String[] args) {
        int x=4,y=2;
        boolean result;
        result=x>y;
        System.out.println(result);

        //shto me dy njesi dhe krahaso a eshte i ndryshem nga x
        y+=2;
        boolean output;
        output=(x!=y);
        System.out.println(output);


        //zbrit 3 njesi nga x dhe krahaso a eshte me i vogel ose i barabarte me 2
        x-=3;
        result=(x<=2);
        System.out.println(result);


        //kontrollo nese x eshte i barabarte me 0
        result=(x==0);
        System.out.println(result);

        //kontrollo nqs resultat ruan vleren tru si vleredhenie te fundit
        System.out.println(result==true);
    }
}
