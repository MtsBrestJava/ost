package mts.ost1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//@Controller
public class RestControllerMy {
    // http://localhost   127.0.0.1   http://192.168.3.15:8080
    @GetMapping ("/hello")  // Получить
    public String homepage() {
        String someName = "Hello Serega  ";
        return someName + 5;
    }
    @GetMapping ("/start")
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
    @GetMapping ("/humans/get") //вызываем массив
    public String getList()
    {
        return InputArray.getGetHumanses().toString();
    }

    @PostMapping ("/new") // Передаем
    public void inputMethod (@RequestBody String a) {
        System.out.println("a = " + a);
    }

    @PostMapping ("/humans") // Передаем в массив объекты и выводим в консоль
    public void inputMethod (@RequestBody Human myNewHuman) {
        System.out.println("myNewHuman" + myNewHuman.toString());
        new InputArray(myNewHuman);
    }
        @PostMapping ("/humans/post") // Передаем в массив объекты без вывода в консоль
    public void postMethod (@RequestBody Human myNewHuman) {
            new InputArray(myNewHuman);
        }

//    @GetMapping ("/")
//    public String home(Model model) {
//        model.addAttribute("title", "Главная страница нашего сайта");
//        return "home";
//    }
//    @GetMapping ("/about")
//    public String about(Model model) {
//        model.addAttribute("title","Страница про то как мы учим Джаву");
//        return "about";
//    }
}
