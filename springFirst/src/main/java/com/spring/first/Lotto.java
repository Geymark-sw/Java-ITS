package com.spring.first;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/lotto")
public class Lotto {
	
	@GetMapping(path="/ritorna")
	public int[] ritornaNumeri() {
		
		Random r = new Random();
		
		int[] numeri = new int[5]; 
		for(int i=0; i<5; i++) {
			numeri[i] = r.nextInt(1, 90);
		}
		
		return numeri;
	}
}
