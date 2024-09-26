package com.example.demo;

import com.example.demo.student.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@SpringBootApplication
@RestController //used to create RESTful web services
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/Member") //used for mapping HTTP GET requests onto specific handler methods
	public List<Member> runner(){
		return List.of(
				new Member(
						"Peter",
						22,
						1
				)
		);
	}
}
