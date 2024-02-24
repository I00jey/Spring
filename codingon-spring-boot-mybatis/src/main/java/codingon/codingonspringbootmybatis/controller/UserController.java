package codingon.codingonspringbootmybatis.controller;

import codingon.codingonspringbootmybatis.domain.User;
import codingon.codingonspringbootmybatis.dto.UserDTO;
import codingon.codingonspringbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

// 작업 순서 : sql 이용해 table 생성 (workbench) -> 도메인 생성 -> dto -> mapper -> service -> controller
@Controller
public class UserController {
    // Create, Read

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String getUsers(Model model){
        List<UserDTO> users = userService.getUserList();
        // mybatis 를 통해 전달된 정보를 받아와 users 에 넣고
        model.addAttribute("list",users);
        // 템플릿으로 값을 전달하는 model 에 담아 전달
        return "user";
    }

    // postman 사용해서 값 insert 할 것
    @PostMapping("/user")
    public String userInsert(@RequestParam String name, @RequestParam String nickname){
        User user = new User();
        user.setName(name);
        user.setNickname(nickname);

        userService.insertUser(user);
        // return "user";
        return "redirect:/";
    }
}
