package by.mts.brest.java.classes_deeper;

import java.util.ArrayList;

public class Main {

    // Наша программа для создания ОБЪЕКТОВ классов и тестов с ними
    public static void main(String[] args) {

        // Создадим два объекта класса Human используя разные конструкторы
        Human abonentIgor = new Human();
        Human podryadchikPetya = new Human("Petr", "Ivanov");
        // Выведем их на экран:
        System.out.println("abonentIgor = " + abonentIgor);
        System.out.println("podryadchikPetya = " + podryadchikPetya);
        System.out.println("----------------------------------------------");

        // Создадим и заполним список объектов класса mtsTechList (наследника Human) используя конструктор с двумя String'ами
        ArrayList<mtsTech> mtsTechList = new ArrayList<>();
        mtsTechList.add(new mtsTech("Aleksandr", "Levchenko"));
        mtsTechList.add(new mtsTech("Ruslan", "Ostrovskij"));
        mtsTechList.add(new mtsTech("Sergey", "Ivaniukovich"));

        // Создадим и заполним список объектов класса mtsSaleList (наследника Human) используя конструктор с двумя String'ами
        ArrayList<mtsSale> mtsSaleList = new ArrayList<>();
        mtsSaleList.add(new mtsSale("Alexey", "Ragozinskij"));
        mtsSaleList.add(new mtsSale("Vasya", "Pupkin"));
        System.out.println("----------------------------------------------");

        // Выведем оба списка на экран:
        System.out.println("mtsTechList = ");
        mtsTechList.forEach(System.out::println);
        System.out.println("mtsSaleList = ");
        mtsSaleList.forEach(System.out::println);
        System.out.println("----------------------------------------------");

        // Выведем humansCount (количество созданных экземпляров класса Human)
        System.out.println("Human.humansCount = " + Human.humansCount);
        System.out.println(mtsSaleList.get(0).getClass());

        mtsTech tehnar = new mtsTech("Какой-то", "Инженер");
        mtsTech.Car someCar = tehnar.new Car();
    }

}