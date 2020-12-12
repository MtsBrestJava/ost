package by.mts.brest.java.Lesson9;

import java.util.ArrayList;
import java.util.Comparator;

public class Lesson9_class2 {

    public static void main(String[] args) {
        Human sasha = new Human("Sasha L",15,65);
        Human sergeyIvaniukovich;
        Human temporaryHuman;
        /* sasha.name = "Sasha L";
        sasha.age = 15;
        sasha.weigth = 65;*/
        sasha.riseAge();
        System.out.println("sasha.weightIndex = " + sasha.weightIndex);

        Human sasha2 = new Human();
        sasha2.name = "Sasha2 Y";
        sasha2.age = 45;
        sasha2.weigth = 68;
        Human leha = new Human();
        leha.name = "Leha R"; leha.age = 31; leha.weigth = 66;
        Human serega = new Human();
        serega.name = "Serega I"; serega.age = 22; serega.weigth = 69;
        Human ruslan = new Human();
        ruslan.name = "Ruslan O"; ruslan.age = 29; ruslan.weigth = 64;



        ArrayList<Human> mtsHumans = new ArrayList<>();
        mtsHumans.add(sasha);
        mtsHumans.add(sasha2);
        mtsHumans.add(leha);
        mtsHumans.add(serega);
        mtsHumans.add(ruslan);

        printHumans(mtsHumans);
        mtsHumans.sort(Comparator.comparing(a -> a.age));
        printHumans(mtsHumans);
        mtsHumans.sort(Comparator.comparing(a -> a.weigth));
        printHumans(mtsHumans);

    }


    private static void printHumans(ArrayList<Human> listHumans) {
        int i;
        for(i = 0; i< listHumans.size(); i++) {
            System.out.print("Human name: " + listHumans.get(i).name);
            System.out.print("; age: " + listHumans.get(i).age);
            System.out.print("; weight: " + listHumans.get(i).weigth);
            System.out.println("; weightIndex = " + listHumans.get(i).weightIndex);
            System.out.println("");
        }
/*        listHumans.forEach(currentHuman -> {
            System.out.print("currentHuman = " + currentHuman.name);
            System.out.print("; currentHuman.age = " + currentHuman.age);
            System.out.print("; currentHuman.weigth = " + currentHuman.weigth);
            System.out.println("; ");
        });*/
        System.out.println("------------------------------------");
    }


}