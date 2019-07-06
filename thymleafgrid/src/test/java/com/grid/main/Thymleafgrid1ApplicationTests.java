package com.grid.main;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.grid.main.entity.User;
import com.grid.main.repository.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
//@SpringBootTest
public class Thymleafgrid1ApplicationTests {
	@Autowired
	UserRepository UserRepository;
	
	@Test
	public void contextLoads() {
		User user=new User();
		user.setAge("15");
user.setName("ㅇ오우민");
		
//UserRepository.saveAndFlush(user);
	
//	List<User> userlist=UserRepository.findAll();
UserRepository.save(user);

List<User> test = UserRepository.findAll();
	
	
	System.out.println("안나오 : "  +test.get(0).getAge());
	}

}
