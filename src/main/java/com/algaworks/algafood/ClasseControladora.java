package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClasseControladora {
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Oi Tudo bem João!";		
	}
	
}