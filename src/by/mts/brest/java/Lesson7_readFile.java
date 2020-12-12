package by.mts.brest.java;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Lesson7_readFile {
    public static void main(String[] args) throws IOException{
        BufferedReader reader =
                new BufferedReader(new FileReader("C:\\my\\file1.txt"));

        ArrayList<List<String>> myStringArray = new ArrayList<List<String>>(); // обявляем двумерный массив
        StringBuilder currentString = new StringBuilder();
        // переменная currentString получает дополнительную возможность StringBuilder
        A: for(int x=0;true;x++) {
            myStringArray.add(new ArrayList<String>()); // в массив myStringArray добавляем внешнюю коробку
            B: for(int i=0;true;i++){
                while(true) {
                    int current = reader.read(); // посимвольное считывание кода символа
                    if(current == -1) break A; // -1 это конец файла, и перескочит в конец цикла А
                    if(current == (int)';') break;
                    else currentString.append((char) current); // добавляет в переменную current следующий символ
                    //currentString.append((char) current) преобразование кода символа в символ
                    if(current == (int)'\n') { // \n перевод строки  \r возврат каретки
                        currentString.setLength(currentString.length()-2);
                        // обрезаем симолы \n перевод строки  \r возврат каретки
                        myStringArray.get(x).add(currentString.toString());
                        currentString.delete(0, currentString.length());
                        // очищаем временную переменную после конца строки;
                        break B; // окончание цикла В
                    }
                }
                myStringArray.get(x).add(currentString.toString());
                //добавили маленькую коробку и записали рекущую переменную currentString
                currentString.delete(0, currentString.length()); // очищаем временную переменную после;
            }
        }
        System.out.println("myStringArray = " + myStringArray);





        System.out.println("stroka1=" + reader.readLine());
        System.out.println("stroka2=" + reader.readLine());
        System.out.println("stroka2=" + (char)reader.read());
        System.out.println("stroka2=" + (int)reader.read());

        System.out.println("strokaN=" + reader.readLine());

        reader.close();
        String name1 = "C:\\my\\"+ LocalDate.now().toString()+"\\file2.txt";
        new File(name1).getParentFile().mkdirs();
        FileWriter writer = new FileWriter("C:\\my\\file2.txt");
        writer.write("aaaaaa"+System.getProperty("line.separator"));
        writer.write("333333"+System.getProperty("line.separator"));
        writer.close();

    }
}