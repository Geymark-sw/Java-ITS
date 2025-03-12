package com.spring.apprubrica;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.apprubrica.dto.RubricaDTO;
import com.spring.apprubrica.service.ContattoService;
import com.spring.apprubrica.service.RubricaService;

@RestController
@RequestMapping(path="/rubriche")
public class RubricaController {
	
	@Autowired
	private RubricaService rubricaService;
	@Autowired
	private ContattoService contattoService;
	
	@PostMapping(path="", consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean insertRubrica(@RequestBody RubricaDTO dto) {
		return this.rubricaService.insertRubrica(dto);
	}
}
