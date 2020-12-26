package Lesson10_DZ;

public class Human extends Child implements SelectData {
    private static String gender; // обратите внимание
    private String name;    // Сравните с предыдущей переменной
    Col col = new Col();

    public void setGender(String gender) { // определяем пол М/Ж
        this.gender = gender;
        System.out.println("gender = " + gender);
        }

    public void setName(String name) { //определяем имя
        this.name = name;
        System.out.println("name = " + name);
         }

    @Override
    public void date_of_birth(String yourDate) {
        System.out.println("yourDate = " + yourDate);

    }

   /* @Override   //Здесь не переопределяем
    public void OllData() {

    }*/
    //@Override
    public void NameGender() {
        System.out.println("name + gender = " + name + " " +gender);
    }

    class Col { //создаем вложенный класс
        String eve_color;

        public void setEve_color(String eve_color) {
            this.eve_color = eve_color;
            System.out.println("eve_color = " + eve_color);
        }
    }

}

