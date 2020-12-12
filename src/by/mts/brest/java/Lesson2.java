package by.mts.brest.java;

public class Lesson2 {
    public static void main(String[] args) {

        /* == операция сравнения когда равно
            != сравнение значений не равно
            < левое значение меньше правого
            > левое значение больше правого
            >= левое значение больше или равно правого
            <= левое значение меньше или равно правого
            if (услоаие) выражение; else выражение 11
            if (услоаие) выражение; else if (условие 2)
            if (услоаие) {
            выражение1;
            выражение2;
            выражение3;
            }
            условие = true (истина) или false (ложь)
            выражение = какое лтбо действие
            если результат условия = true тогда выполняем выражение
            если результат условия = false тогда НЕ выполняем выражение

            Оператор
            switch(число) {
                case 0: выражение1
                case 1: выражение2
                break; прекратить выполнение
                case 2: выражение3
                }
             */
        int a=2, b=6;
        if (a==b)
        System.out.println("end of program");
        else System.out.println("херня");
        switch(a) {
            case 6: System.out.println("6");
            case 7: System.out.println("7");
                break; //прекратить выполнение
            case 1: System.out.println("1");
        }
        //  && условное И
        // || условное ИЛИ
        // ! НЕ -  инвертирует условие
        // | & ^
        // ^ 00=0 01=1 10=1 11=0 xor
        if (a==1 && b==6) System.out.println("gut");
        else System.out.println("16");
        if ((a==1) && !(b==6)) System.out.println("gut");
        else System.out.println("16");
         a=4; b=5;
         int c=4, d=4;
              if (a==b||c==d) System.out.println("Истина");
              else System.out.println("Ложь");
              System.out.println("End");

              boolean b1=true,b2=false;
        if (a==b|| !b1==b2) System.out.println("Истина");
        else System.out.println("Ложь");
        System.out.println("End");

        int z= a<b ? a : b;
        System.out.println("Тенарная операция    "+z);
        //УСЛОВИЕ ? ВЫРАЖЕНИЕ1 : ВЫРАЖЕНИЕ2
        // if(УСЛОВИЕ) ВЫРАЖЕНИЕ1;
        // else ВЫРАЖЕНИЕ2

        boolean q=a<b ? true : false;
        int w=a<b ? (3+4) : (5+6);
        System.out.println(q+""+w);

    }
}
