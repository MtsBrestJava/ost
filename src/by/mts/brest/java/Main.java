package by.mts.brest.java;

public class Main {

    public static void main(String[] args) {
	//начало программы
        int x=10; // 2 147483647
        int xxx; // 2 147483647
        int xx=20; // 2 147483647
        float y=2.53f; // дробное грубое 32 байта
        double z=4.747477474774; // дробное точное
        char somechar='d';
        int chislo;
        chislo=123;
        String name="serega";
        System.out.println("fffff"+x+chislo+z+name+(x*2));
        xxx=x+xx;
        x+=1; //x=x+1
        ++x;

        boolean one;
        System.out.println("fffff"+x+chislo+z+name+xxx);
        x=1;
        x+=2; //x=x+2
        System.out.println("fffff"+x+chislo+z+name+xxx);
        x=1;
        x=+2; //x=x+2
        System.out.println("fffff"+x+chislo+z+name+(x++));
        System.out.println(x);


    }
}
