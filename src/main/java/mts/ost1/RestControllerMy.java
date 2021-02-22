package mts.ost1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestControllerMy {
    // http://localhost   127.0.0.1   http://192.168.3.15:8080
    @GetMapping ("/hello")  // Получить
    public String homepage() {
        String someName = "Hello Serega  ";
        return someName + 5;
    }
    @GetMapping ("/")
    public int homePageDigit (){
        System.out.println("START");
        return 99999999;
    }
    @GetMapping ("/human")
    public Human getHuman(){
        Human serg = new Human("Serega",55,66);
        return serg;
    }
    @GetMapping ("/humans")
    public List<Human> getHumans()
    {   List<Human> humans = new ArrayList<>();
        humans.add(new Human("Sasha",23,45));
        humans.add(new Human("Vova",55,98));
        humans.add(new Human("Gena",787,38));
        return humans;
    }

    @PostMapping ("/new") // Передаем
    public void inputMetod (@RequestBody String a) {
        System.out.println("a = " + a);
    }
    @PostMapping ("/humans") // Передаем
    public void inputMetod (@RequestBody Human myNewHuman) {
        System.out.println("myNewHuman" + myNewHuman.toString());
        InputArray (myNewHuman);


    }

}
