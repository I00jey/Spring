package codingon.codingonspringboot.controller._00_practice;

import codingon.codingonspringboot.vo.UserVoPrac;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AxiosFormSubmitPrac {

    @GetMapping("/axios/prac/form")
    public String getReq() {return"_00_practice/AxiosPrac1";};
    @GetMapping("/axios/prac/vo/get")
    @ResponseBody
    public String pracVoGet(@RequestParam String name, @RequestParam String gender, @RequestParam int year, @RequestParam int month, @RequestParam int date, @RequestParam String hobby) {
        return name + "님 회원가입 성공";
    }

    @PostMapping("/axios/prac/vo/post")
    @ResponseBody
    public String pracVoPost(@RequestBody UserVoPrac userVoPrac) {
        return userVoPrac.getName() + "님 회원가입 성공";
    }

}
