package com.grid.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grid.main.repository.UserRepository;

@Controller
public class GridController {
    
    @Autowired
    UserRepository userRepository;
    
    @RequestMapping("/grid")
    private ModelAndView grid() throws Exception {
    	userRepository.findAll();
   
    	ModelAndView mv = new ModelAndView("user/userList");
        mv.addObject("grid", userRepository.findAll());
        return mv;
    }
 
}