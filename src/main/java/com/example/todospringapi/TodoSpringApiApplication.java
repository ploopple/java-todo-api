package com.example.todospringapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping(value = "/api")
public class TodoSpringApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoSpringApiApplication.class, args);
	}

	@GetMapping("/todo")
	public String getTodo(){
		return "GET";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/todo")
	public String postTodo(){
		return "POST";
	}

}
