package com.gcu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.buisness.OrdersBusinessServiceInterface;
import com.gcu.buisness.SecurityBusinessService;
import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private OrdersBusinessServiceInterface service;
    @Autowired
    private SecurityBusinessService security;

    @GetMapping("/")
    public String display(Model model) {
        model.addAttribute("title", "Login Form");
        model.addAttribute("loginModel", new LoginModel());
        return "login";
    }

    @PostMapping("/doLogin")
    public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {

        if(bindingResult.hasErrors()){
            model.addAttribute("title", "Login");
            return "login";
        }
        
        security.authenticate(null, null);

        List<OrderModel> orders = service.getOrders();
        
        model.addAttribute("title", "My Orders");
        model.addAttribute("orders", orders);

        service.test();
        
        return "orders";
    }
    
}
