package com.duying.controller;

import com.duying.entity.Guest;
import com.duying.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    @RequestMapping("/index")
    public String showIndex(Model model){
        List<Guest> guestList=guestService.findAll();
        model.addAttribute("guestList",guestList);
        return "index";
    }
}
