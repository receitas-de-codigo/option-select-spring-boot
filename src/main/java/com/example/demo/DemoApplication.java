package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Controller
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String index(Model model) {
		List<Pais> ls = Arrays.asList(new Pais(1L, "EUA"), new Pais(2L, "Brasil"), new Pais(3L, "Italia"));

		model.addAttribute("ls", ls);
		model.addAttribute( "selecionado", new Pais(2L, "Brasil") );

		return "index";
	}
}
