package codingon.codingonspringboot.controller._01_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {
    @GetMapping("/hi")
    public String getHi(Model model){
        // Model model : Controller 클래스 안의 메소드가 파라미터로 받을 수 있는 객체
        // - 정보를 담아서 view 에게 넘겨줄 때 사용
        // - 개발자가 직접 model 을 생성할 필요 없이, 파라미터로 선언만 해주면 Spring 이 알아서 만들어 줌
        model.addAttribute("msg"," Hi~");

        // Thymeleaf 표현식과 문법
        model.addAttribute("uText","<strong>Hello</strong>");
        model.addAttribute("value", "이름을 입력하세요");
        model.addAttribute("widthValue", "hello");
        model.addAttribute("link","hi" );
        model.addAttribute("imgsrc","개미캐릭터.jpg" );
        model.addAttribute("userRole","admin" );
        model.addAttribute("isAdmin","false" );

        List<String> names = Arrays.asList("우리","재현","시진","지훈");
        model.addAttribute("names", names);

        Hello hello = new Hello(10);
        model.addAttribute("classHello",hello);

         return "_01_thymeleaf/hi";
        // 위 html 에 model 을 넘겨주겠다.
    }
}


class Hello{
    private int age;
    public Hello(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}