package com.example.demo;

import com.example.demo.student.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@Controller
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/members")
	public String getMembers(Model model) {
		List<Member> members = List.of(
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
				),
				new Member(
						"John Doe",
						30,
						2,
						"Male",
						"456 Fit Ave, Muscle Town",
						"987-654-3210",
						"54321",
						false,
						null
				)
		);

		model.addAttribute("members", members);
		return "members";  // Returns the members.html template
	}
}
