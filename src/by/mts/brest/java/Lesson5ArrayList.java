package by.mts.brest.java;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Lesson5ArrayList {
    public static void main(String[] args) {
        // Список<типДанных> ИмяСписка = new Список<типДанных>()
        ArrayList<Integer> someInts = new ArrayList<Integer>(); //1мерн
        ArrayList<ArrayList<Integer>> someInts2 = new ArrayList<ArrayList<Integer>>(); //2мерн
        ArrayList<Integer> someInts3 = new ArrayList<Integer>(); //1мерн
        someInts3.add(999);
        someInts3.add(888);
        someInts3.add(777);
        someInts.add(55);
        someInts.add(12);
        someInts.add(99);
        someInts.add(null);
        someInts.add(0);
        System.out.println("someInts = " + someInts);
        someInts.add(1, 222);
        System.out.println("someInts = " + someInts);
        someInts.set(1, 909);
        System.out.println("someInts = " + someInts);
        someInts.remove(1);
        System.out.println("someInts = " + someInts);
        System.out.println("someIntsINDEXED[3] = " + someInts.get(2)); // получает 2-й элемент из списка
        System.out.println("someInts = " + someInts.indexOf(99)); // ищет первое совпадение числа в списке (возвращает индекс в массиве)
        System.out.println("someInts = " + someInts.indexOf(999)); // не находит число, возвращает -1
        System.out.println("someInts = " + someInts.size()); // возвращает размер списка
        someInts.set(3,22);     // заполнили 3-й элемент числом (иначе при null - ошибка)
        System.out.println("someInts unsorted = " + someInts); //
        Collections.sort(someInts);
        System.out.println("someInts sorted = " + someInts); // сортировака в порядке возрастания
        Collections.sort(someInts, Collections.reverseOrder());
        System.out.println("someInts sorted = " + someInts); // сортировака в порядке убывания
        System.out.println("someInts sorted = " + Collections.max(someInts)); // возвращаем максимальное значение





    }
}