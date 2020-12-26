package Lesson10_DZ;

import java.io.OutputStream;

public class Personality {
    public static void main(String[] args) {

        Human pers1 = new Human(); // Создаем объек класса
        Human pers2 = new Human() { //Создаем объект класса и пытаемся переопределить метод во вложенном классе, пока облом
           //Col col = new Col();

             class Col {
                String eve_color;
                public void setEve_color (String eve_color){
                this.eve_color = eve_color;
                System.out.println("EVE_COLOR = " + eve_color);
            }
            }
        };
        Human pers3 = new Human() { //Создаем объект и переопределяем один изего методов все ОК
            @Override
            public void setName(String name) {
                System.out.println("NAME = " + name);

            }
        };
        pers1.date_of_birth("12.12.12");
        pers1.setGender("MEN");
        pers1.setName("VOVA");
        pers1.dataChild(15);
        pers1.col.setEve_color("Green");

        System.out.println();

        //pers2.name = "Masha";
        pers2.col.setEve_color("Black");
        pers2.setGender("Vumen");
        pers2.dataChild(22);
        pers2.setName("Masha");

        System.out.println();

        pers3.setName("Gecha");
        pers3.col.setEve_color("Red");

        System.out.println();

        //пример Интерфейса

        SelectData selectData1 = new Human();
        SelectData selectData2 = new Human2();

        selectData1.OllData(); //вызываем метод OllData() интерфейса объекта Human
        selectData1.NameGender(); //вызываем метод NameGender() интерфейса объекта Human

        System.out.println();

        outData(selectData2);



        }
        public static void outData(SelectData selectDataTemp) {
        selectDataTemp.NameGender();
        selectDataTemp.OllData();
        }

}

