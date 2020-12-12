package by.mts.brest.java;

import java.util.Arrays;

public class Lesson4massiv {
    public static void main(String[] args) {
        int i=0;
        int nash_massive []; // [] наш массив
        nash_massive=new int[3];
        int nash_massive2 [] = new int [] {1,2,3,4,5,6,7}; // [] наш массив
        int nash_massive3 [] = new int [4];
        nash_massive3[0]=98;
        nash_massive3[1]=34;
        nash_massive3[2]=1;
        nash_massive3[3]=13345;
        while (i<4)
        {System.out.println(nash_massive3[i]);
        i++;}

        System.out.println("nash_massive3: "+ Arrays.toString(nash_massive3));
       // nash_massive3[4]=4344;
        int nash_massive4 [] = new int [i+6];
        for (i=0;i<10;i++){
            nash_massive4 [i]=i+20;
        System.out.println("nash_massive4: "+ Arrays.toString(nash_massive4));}

        String string_array1[] = new String[5];
        for (i=0;i<5;i++){
            string_array1[i]="i+20";
        System.out.println("string_array1: "+ Arrays.toString(string_array1));}

        System.out.println("dlina1: "+ string_array1.length);
        for (int z=0; z < string_array1.length;z++)
        {string_array1[z]="Stroka" + Integer.toString(z);
        System.out.println(string_array1[z]);}

        int dvumern[][] = new int [3][5];
        dvumern[0][0] = 10;
        System.out.println(dvumern[0][0]);
        for (i=0;i<dvumern.length;i++){
            dvumern[i][i]=i;
            System.out.println("dvumern: "+ Arrays.toString(dvumern));}

        String dvumernString[][]=new String[][]
                {{"Stroka01","Stroka02"},{"Stroka11","Stroka12"}};
        System.out.println("massive "+Arrays.toString(dvumernString[0]));
        System.out.println("massive "+Arrays.toString(dvumernString[1]));

        int dvumerni[][] = new int [3][3];
        dvumerni[0][1] = 1;
        dvumerni[2][1] = 1;
        dvumerni[2][2] = 1;
        System.out.println("massive "+Arrays.toString(dvumerni));


    }
}
