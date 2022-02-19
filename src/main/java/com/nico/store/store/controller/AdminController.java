package com.nico.store.store.controller;

import com.nico.store.store.domain.Article;
import com.nico.store.store.domain.User;
import com.nico.store.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;


    @GetMapping("/showDetailInfoUser")
    public String showDetailInfoUser(@RequestParam("id") long theId, Model model) {

        // get the employee from the service
        User user = userService.findById(theId);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("user", user);

        // send over to our form
        return "userDetaill";
    }
}
