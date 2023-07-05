package com.example.demo.dummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DummyController {
	
	@Autowired
	DummyService dummyService;

	@GetMapping("/")
	public String mainController() {
		return "main";
	}
	
	@PostMapping("/create")
	public String createController(@ModelAttribute DummyDto dummyDto) {
		
		dummyService.createDummy(dummyDto);
		
		return "result";
	}
}
