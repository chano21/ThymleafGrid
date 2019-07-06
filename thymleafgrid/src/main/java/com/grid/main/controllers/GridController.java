package com.grid.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grid.main.entity.User;
import com.grid.main.repository.UserRepository;
import com.grid.main.util.ReflectioinUtils;

@Controller
public class GridController {
    
    @Autowired
    UserRepository userRepository;
    
    @RequestMapping("/grid")
    private ModelAndView grid() throws Exception {
    	System.out.println("test");
    	
    	User user=new User();
		user.setAge("16");
		user.setName("testname1");
		userRepository.save(user);

    	User user2=new User();
		user2.setAge("15");
		user2.setName("testname2");
		userRepository.save(user);

		
		userRepository.flush();
   
    	ModelAndView mv = new ModelAndView("grid");
        mv.addObject("gridlist", userRepository.findAll());
        mv.addObject("NameList", ReflectioinUtils.ClassProperties(User.class));
        
        return mv;
    }
 
}