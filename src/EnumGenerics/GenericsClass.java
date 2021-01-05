package EnumGenerics;
class Base<HZ>{

    private HZ id;
    private int num;

    Base(HZ id, int num){
        this.id = id;
        this.num = num;
    }

    public HZ getId() {
        return id; }
    public int getNum() {
        return num; }
    public void setNum(int num) {
        this.num = num; }
}
public class GenericsClass {
    public static void main(String[] args) {
        Base<String> BS1 = new  Base ("Repiter R-1234" , 111);
        System.out.println(BS1.getId()  + " konfiguration " + BS1.getNum());

        Base<Integer> BS2 = new Base (6014, 4444);
        System.out.println(BS2.getId() + " konfiguration " + BS2.getNum());

        Oll<String> BSS1 = new Oll<>("Repiter R-001" , 10, "Brestsskaya");
        System.out.println(BSS1.getId()+ " konfiguration " + BSS1.getNum()+ "  " + BSS1.oblast);
    }
}
class Oll<HZ> extends Base<HZ>{ // создаем класс с областью и наследуем класс BASE
    String oblast;

    Oll(HZ id, int num, String oblast) {
        super(id, num);
        this.oblast = oblast;


    }
}


