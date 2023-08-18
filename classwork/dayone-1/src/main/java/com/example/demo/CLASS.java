package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CLASS {
	@GetMapping("/ddisp")
	 public String display() {
		 return "hello";
	 }
}
