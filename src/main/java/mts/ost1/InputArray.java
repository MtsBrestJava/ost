package by.mts.brest.java;

import java.util.ArrayList;
import java.util.List;

public class InputArray {
    static List<Human> getHumanses = new ArrayList<>();

    //возвращаем массив
    public static List<Human> getGetHumanses() {
        return getHumanses;
    }

    //добавляем в массив объекты
    public InputArray(Human inputHum) {
            getHumanses.add(inputHum);
        }

}
