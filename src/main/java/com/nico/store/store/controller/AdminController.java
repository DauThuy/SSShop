package com.nico.store.store.controller;

import com.nico.store.store.domain.Article;
import com.nico.store.store.domain.User;
import com.nico.store.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class AdminController {
    @Autowired
    private UserService userService;

}