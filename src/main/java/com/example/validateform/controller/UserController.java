package com.example.validateform.controller;


import com.example.validateform.entity.User;
import com.example.validateform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public String showForm(Model model){
        model.addAttribute("user",new User());
        return "list";
    }


    @PostMapping("/sign")
    public String checkValidation(@Validated @ModelAttribute User user, BindingResult bindingResult){
       if(bindingResult.hasErrors()){
           return "list";
       }else {
           userService.save(user);
           return "index";
       }

    }

}
