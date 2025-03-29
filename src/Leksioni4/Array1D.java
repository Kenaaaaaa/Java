package Leksioni4;

public class Array1D {
    public static void main(String[] args) {
        int[] tab=new int[5];

        //Japim vleren 5 elementeve te array
        tab[0]=5;
        tab[1]=6;
        tab[2]=7;
        tab[3]=8;
        tab[4]=9;
        System.out.println(tab);

        //Ruani piket e 7 studenteve ,

        Float [] piket=new Float[7];
        piket[0]=45f;
        piket[1]=55f;

        piket[2]=68f;

        piket[3]=76f;


        piket[4]=89f;

        piket[5]=45f;
        piket[6]=45f;

        int i;
        for (i=0;i<piket.length;i++){
            System.out.println(piket[i]);
        }

    }
}
