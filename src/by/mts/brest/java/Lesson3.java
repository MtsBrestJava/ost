package by.mts.brest.java;

public class Lesson3 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.print(" for: " + i);
        }
        i = 0;
        while (i < 10) {  System.out.print(" while: " + i);

        i++;}
        System.out.println(" ");
        i=0;
        do {
            System.out.print(" do_while: " + i);
            i++;
        } while(i<10);
        int y;
        i=0; y=0;
        do {
            System.out.print(" do_while: " + i);
            if (y==7) break; // прерывает цикл
            y++;
            i++;
        } while(i<10);

        }

    }




