package Leksioni2;

public class RelationalOperations {
    public static void main(String[] args) {

        //deklaro nje variabel double me vlere fillestare
        double x=3.5d;

        //shtoji variablit double 2 njesi dhe pastaj afishoje

        x+=2;
        System.out.println(x);

        //deklaro nje variable double te dyte, ku vlera iniciale ka vleren e pare +1 njesi
        //double y
        //y=x+1

        double y=(++x);

        //afisho vleren e x pasi i keni hequr y

        x-=y;
        System.out.println(x);

        //Realizo postdekrement te x
        x--;

    }
}
