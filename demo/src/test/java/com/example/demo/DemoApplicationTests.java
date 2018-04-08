package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	    
	    System.out.println("Hello world!");
	}
	
	@Test
	public void input_1_guess_1_success() {
	    GuessNumberGame x = new GuessNumberGame("1");
	    
	    assert(x.guess("1").equals("0A0B"));
	}

}
