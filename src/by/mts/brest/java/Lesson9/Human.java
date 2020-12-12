package by.mts.brest.java.Lesson9;


public class Human {

    // Переменные (поля) класса
    String name;
    int age;
    float weigth;
    float weightIndex;

    // Инициализатор (код, который выполняется до любого конструктора
    {
        this.weigth = 1;
    }

    // Конструкторы. Имя конструктора должно совпадать с именем класса.
    // Конструктор без входных параметров (создается по умолчанию для любого класса даже если его не указывать)
    public Human() {
    }

    // Конструктор с входным параметром name
    public Human(String name) {
        this.name = name;
        this.age = 1;
    }

    // Конструктор
    public Human(String name, int age, float weigth) {
        this.name = name;
        this.age = age;
        this.weigth = weigth;
        this.weightIndex = weigth/age;
    }

    // Методы класса
    void run() {
        System.out.println("I'am running");
    }

    void riseAge() {
        age++;
    }
}