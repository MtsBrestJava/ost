package by.mts.brest.java.classes_deeper;

public class mtsSale extends Human { // Класс mtsSale наследуется от Human со всеми полями и методами КРОМЕ конструкторов

    // Свои поля для класса mtsTech (кроме тех что он унаследовал)
    int forisAccessLevel;               // Уровень доступа в форис
    int officeId;                       // Id офиса продаж
    boolean isProseller;                // Проселлер?

    // Поэтому объявляем здесь конструктор с двумя полыми String
    mtsSale(String name, String surname) {
        super(name, surname);           // Т.к. этот конструктор должен выполнять идентичные действия как в
        // таком же конструкторе Human, вызываем здесь конструктор родительского класса
        System.out.println("Конструктор mtsSale(String, String)");
    }


    @Override
    public String toString() {
        return "mtsSale{" +
                "forisAccessLevel=" + forisAccessLevel +
                ", officeId=" + officeId +
                ", isProseller=" + isProseller +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", classId=" + classId +
                '}';
    }
}