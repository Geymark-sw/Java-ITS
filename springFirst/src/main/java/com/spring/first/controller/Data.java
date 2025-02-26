package com.spring.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
@RequestMapping(path="/data")
public class Data {
	
	@GetMapping(path="ritorna")
	public Date ritornaIstante() {
		Date d = new Date();
		
		return d;
	}

}
