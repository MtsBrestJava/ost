package by.mts.brest.java;
public class Human {

    // Переменные (поля) класса
    private String name;
    private int age;
    private float weigth;
    private float weightIndex;
    private MtsSaler saler;

    // Инициализатор (код, который выполняется до любого конструктора
    {
        this.weigth = 1;
        saler= new MtsSaler();
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

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigth=" + weigth +
                ", weightIndex=" + weightIndex +
                ", saler=" + saler +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public float getWeightIndex() {
        return weightIndex;
    }

    public void setWeightIndex(float weightIndex) {
        this.weightIndex = weightIndex;
    }

    public MtsSaler getSaler() {
        return saler;
    }

    public void setSaler(MtsSaler saler) {
        this.saler = saler;
    }
}