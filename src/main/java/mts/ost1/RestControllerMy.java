package mts.ost1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping ("/new") // Передаем
    public void inputMetod (@RequestBody String a) {
        System.out.println("a = " + a);
    }
}
