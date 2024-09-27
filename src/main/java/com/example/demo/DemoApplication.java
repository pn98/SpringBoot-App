package com.example.demo;

import com.example.demo.student.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/Member")
	public List<Member> runner() {
		return List.of(
				new Member(
						"Peter Nicholl",
						22,
						1,
						"Male",
						"123 Gym St, Fitness City",
						"123-456-7890",
						"12345",
						true,
						LocalDate.of(2023, 9, 20)
				)
		);
	}
}
