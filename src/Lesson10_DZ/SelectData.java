package Lesson10_DZ;

public interface SelectData {
    public default void OllData (){ //метод только для внутреннего пользования
        System.out.println("You information  ");
    }

    public void NameGender();
}
