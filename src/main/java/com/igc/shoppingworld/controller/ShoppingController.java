package com.igc.shoppingworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ControllerClassOfMall")
public class ShoppingController {

    @GetMapping("/home")
    public String showHome() {
        return "-----  Welcome in Paras Shopping Center  -----";
    }


}
