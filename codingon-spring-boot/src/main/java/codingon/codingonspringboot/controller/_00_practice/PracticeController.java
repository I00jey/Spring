package codingon.codingonspringboot.controller._00_practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PracticeController {
    @GetMapping("practice/thymeleaf1")
    public String getThymeleaf1(Model model) {
        model.addAttribute("age", 18);
        return "_00_practice/thymeleaf1";
    }

    @GetMapping("practice/thymeleaf2")
    public String getThymeleaf2(Model model) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("짱구", 8));
        persons.add(new Person("맹구", 4));
        persons.add(new Person("유리", 2));
        persons.add(new Person("철수", 3));
        model.addAttribute("persons", persons);
        return "_00_practice/thymeleaf2";
    }
}

@Getter
@Setter
@AllArgsConstructor // 모든 필드 값을 매개변수로 받는 생성자
class Person {
    private String name;
    private int age;
}
