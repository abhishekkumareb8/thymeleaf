package com.ty.thymeleaf.contraller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.thymeleaf.dto.User;
import com.ty.thymeleaf.service.UserService;


@Controller
public class UserController {

	@Autowired
	private UserService service;
	
//	@PostMapping
//	public User saveUser(@RequestBody User user) {
//		return service.saveUser(user);
//	}
	
	@GetMapping("/user")
	public String getUser(Model model) {
		model.addAttribute("user", service.getUser());
		return "user";
	}
	
	@GetMapping("/user/new")
	public String createStudent(Model model) {
		User user= new User();
		model.addAttribute("user", user);
		return "create_user";
	}
	
	@PostMapping("/user")
	public String saveuser(@ModelAttribute("user") User user) {
		service.saveUser(user);
		return "redirect:/user";
	}
}
