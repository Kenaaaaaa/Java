package Leksioni2;

public class Konvertimet {
    public static void main(String[] args) {
        int x=3,y=6;
        float result=(float)x/y;
        System.out.println(result);

        int vlera1=44;
        float vlera2=vlera1;

        System.out.println(vlera2);
        int vlera3=(int)vlera2;
        System.out.println(vlera3);

        int vlera4=(int)44.9f;
        System.out.println(vlera4);
    }
}
