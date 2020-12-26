package Lesson10_DZ;

public class Human2 implements SelectData{
    String name = "Kostja";
    String gender = "MEN";
    int i = 5;
    @Override
    public void NameGender() {
        System.out.println("NAMEGENDER = " + name + " " + gender + "  Lerend in scool " + i);
    }

    @Override
    public void OllData() {
        System.out.println("Overrider metod OllData hend, navernoe, ya naturlih");
    }
}
