package by.mts.brest.java;

import java.io.IOException;

public class Lesson8_ {
    public static void main(String[] args) {
        int x= 10;
        int y= 20;
        int z;
        z=x+y;
        System.out.println("z=" + z);
        int poditog, itog;
        poditog = (z*x+y)*22;
        System.out.println("poditog = " + poditog + ";");
        itog = poditog*64 - y%2;
        System.out.println("itog = " +itog);

        poditog = calculateItog(2, 5, 66);

        System.out.println("poditog = " +poditog);

        poditog = calculateItog(z+33, y+5, x*3);
        System.out.println("poditog = " +poditog);

        vvodFIO("ORN", 46, 83);




    }
    //МЕТОДЫ
    // Тип возвращаемого значения и передаваемые ему переменные

    public static int calculateItog(int z, int x, int y) {
        int poditog, itog;
        poditog = (z * x + y) * 7;
        System.out.println("poditog = " + poditog + ";");
        itog = poditog * 64 - y % 2;
        return poditog;


    }
public static void vvodFIO(String fio, int vozrast, int ves) {
    System.out.println("Dannye abonenta");
    System.out.println("___________________________");
    System.out.println("FIO" + fio);
    System.out.println("___________________________");
    System.out.println("vozrast" + vozrast);
    System.out.println("___________________________");
    System.out.println("ves" + ves);
    System.out.println("___________________________");
}
}
