package codingon.codingonspringboot.controller._00_practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestAPIGetPrac {
    @GetMapping("/introduce/{name}")
    public String introduceName(@PathVariable(value = "name")String name, Model model){
        // http://localhost:8080/introduce/이름
        model.addAttribute("name", name);
        return "_00_practice/RestAPIGet1";
    }
    @GetMapping("/introduce2")
    public String introduceNameAndAge(@RequestParam(value = "name")String name,@RequestParam(value = "age")int age, Model model){
        // http://localhost:8080/introduce2?name=이름&age=100
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "_00_practice/RestAPIGet2";
    }
}
