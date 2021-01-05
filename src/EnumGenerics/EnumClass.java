package EnumGenerics;

public class EnumClass {
    public enum alfavit {
        AAA ("Bukva A"),
        BBB ("Bukva B"),
        CCC ("Bukva C"),
        DDD ("Bukva D");


        String s;

        private alfavit(String s) { // создаем конструктор
            System.out.println("Vacha bukva " + s);
            this.s = s;
        };
        private static void printAlfavit(){ // создаем метод
            System.out.println(DDD);
        }
    }
    //

    public static void main(String[] args) {

        for (alfavit q : alfavit.values()) {
            System.out.println("Bukvi = " + q);
        }
        alfavit symbol = alfavit.BBB; // вызываем в том числе конструктор
        switch (symbol){
            case AAA -> {
                System.out.println("symol A"); break;
            }
            case BBB -> {
                System.out.println("symol B"); break;
            }
            case CCC -> {
                System.out.println("symbol C"); break;
            }

        }
        System.out.println(alfavit.valueOf("AAA"));
        System.out.println(alfavit.values());
        alfavit.printAlfavit(); //вызываем метод

    }


}