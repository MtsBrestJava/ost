package Lesson9;

public class Lesson9_class {
    public static void main(String[] args) {
        // Тип-Human  любоеИмя = СОЗДАНИЕ ОБЪЕКТА С ИМЕНЕМ "любоеИмя" от класса Human

        Human vasya = new Human("Vasilii2");
        //vasya.name = "Vasilii";
        vasya.riseAge();
        vasya.age = 24;
        vasya.weigth = 72.5f;

        Human petya = new Human("Petr");
        petya.age = 35;

/*        vasya.riseAge();
        vasya.run();*/

        System.out.println("vasya.name = " + vasya.name);
        System.out.println("vasya.age = " + vasya.age + " goda");
        System.out.println("vasya.weigth = " + vasya.weigth + " kg");

    }
}