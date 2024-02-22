package codingon.codingonspringboot.controller._00_practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestAPIPostPrac {
    @GetMapping("/post/prac/req")
    public String getReq() {
        return "_00_practice/RestAPIPost1";
    }
    @PostMapping("/post/prac/res")
    public String postPrac(@RequestParam String name, @RequestParam String gender, @RequestParam int year, @RequestParam int month, @RequestParam int date, @RequestParam String hobby, Model model){
        UserInfo userInfo = new UserInfo(name, gender, year, month, date, hobby);
        model.addAttribute("userInfo",userInfo);
        return "_00_practice/RestAPIPost1Res";
    }
}
class UserInfo{
    public String name;
    public  String gender;
    public  int year;
    public  int month;
    public  int date;
    public  String hobby;

    public UserInfo(String name, String gender, int year, int month, int date, String hobby) {
        this.name = name;
        this.gender = gender;
        this.year = year;
        this.month = month;
        this.date = date;
        this.hobby = hobby;
    }
}
