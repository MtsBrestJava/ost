package Lesson10_DZ;

public abstract class  Child {
    private int weigt;

    public void dataChild (int weigt) {
       this.weigt = weigt;
        System.out.println("weigt = " + weigt);
    };
    abstract public void date_of_birth (String yourDate);
}
