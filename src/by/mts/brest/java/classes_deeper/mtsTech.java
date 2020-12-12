package by.mts.brest.java.classes_deeper;

public class mtsTech extends Human { // Класс mtsTech наследуется от Human со всеми полями и методами КРОМЕ конструкторов

    // Свои поля для класса mtsTech (кроме тех что он унаследовал)
    String jobSpecialization;        // Специализация работы, должность
    int driveLevel;                  // Уровень пользования служебным транспортом
    Car workCar;
    MtsTechSecond mtsTSecond;


    // Поэтому объявляем здесь конструктор с двумя полыми String
    mtsTech(String name, String surname) {
        super(name, surname);           // Т.к. этот конструктор должен выполнять идентичные действия как в
        // таком же конструкторе Human, вызываем здесь конструктор родительского класса
        System.out.println("Конструктор mtsTech(String, String)");
        mtsTSecond = new MtsTechSecond();
    }

    class Car {
        String manufacturer;
        String model;
        String regNum;
        float engineVolume;
        int horsePower;
        float fuelConsumption;

        @Override
        public String toString() {
            return "Car{" +
                    "manufacturer='" + manufacturer + '\'' +
                    ", model='" + model + '\'' +
                    ", regNum='" + regNum + '\'' +
                    ", engineVolume=" + engineVolume +
                    ", horsePower=" + horsePower +
                    ", fuelConsumption=" + fuelConsumption +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "mtsTech{" +
                "jobSpecialization='" + jobSpecialization + '\'' +
                ", driveLevel=" + driveLevel +
                ", workCar=" + workCar +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", classId=" + classId +
                '}';
    }
}


// Другой класс
class MtsTechSecond {
    public int publicInt;
    private int privateInt;
    int defaultInt;

    public MtsTechSecond() {
        System.out.println("Конструктор MtsTechSecond");
    }
}
