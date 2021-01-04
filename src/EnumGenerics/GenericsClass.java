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
        System.out.println(BS2.getId() + " konfiguration " + + BS2.getNum());
    }
}


