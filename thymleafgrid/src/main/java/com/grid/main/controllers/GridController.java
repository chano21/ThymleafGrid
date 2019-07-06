package com.grid.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grid.main.entity.User;
import com.grid.main.repository.UserRepository;

@Controller
public class GridController {
    
    @Autowired
    UserRepository userRepository;
    
    @RequestMapping("/grid")
    private ModelAndView grid() throws Exception {
    	System.out.println("test");
    	
    	User user=new User();
		user.setAge("15");
		user.setName("ㅇ오우민");
		userRepository.save(user);

    	User user2=new User();
		user2.setAge("16");
		user2.setName("ㅇ그네그네");
		userRepository.save(user);

		
		userRepository.flush();
   
    	ModelAndView mv = new ModelAndView("grid");
        mv.addObject("gridlist", userRepository.findAll());
        mv.addObject("gridlist", userRepository.findAll());
        
        return mv;
    }
 
}