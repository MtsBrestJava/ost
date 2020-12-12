package by.mts.brest.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DZArrayList {
    public static void main(String[] args) {
        String someString;
        // someString = "kakaya to";

        ArrayList<Integer> someInts = new ArrayList<Integer>();
        ArrayList<String> someName = new ArrayList<String>();

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Input a name: ");
            someString = in.nextLine();
            if(someString.contains("stop")) break;
            System.out.printf("Your name: %s \n", someString);
            someName.add(someString);

            System.out.printf("Input a oklad: ");
            int num = in.nextInt();
            System.out.printf("Your oklad: %d \n", num);
            // printf - вывод с маской (%d - вывод целочисленного значение далее указанной переменной num
            in.nextLine();
            someInts.add(num);
        }

        in.close();

        System.out.println("Prisol naschalnike i vse pereipal");
        Collections.sort(someInts);
        Collections.sort(someName, Collections.reverseOrder());
        int i = someInts.size();
        int k;
        for (k=0 ; k<i ; k++) {
            System.out.print(someName.get(k)+"  " + someInts.get(k)+"  ");
        }


    }
}
