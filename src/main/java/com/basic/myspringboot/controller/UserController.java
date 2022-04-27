package com.basic.myspringboot.controller;

import com.basic.myspringboot.controller.form.UserForm;
import com.basic.myspringboot.entity.User;
import com.basic.myspringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/thymeleaf")
    public String leaf(Model model) {
        model.addAttribute("name", "Spring Boot");
        return "leaf";
    }

    @GetMapping("/index")
    public String userList(Model model) {
        List<User> userList = userService.selectAllUser();
        model.addAttribute("users", userList);
        return "index";
    }

    @GetMapping("/signup")
    public String showSignUpForm(UserForm userForm) {
        return "add_user";
    }

    @PostMapping("/adduser")
    public String addUser(@Valid UserForm userForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add_user";
        }

        User user = new User();

        BeanUtils.copyProperties(userForm, user);
        userService.insertUser(user);
        model.addAttribute("users", userService.selectAllUser());

        return "index";
    }

}
