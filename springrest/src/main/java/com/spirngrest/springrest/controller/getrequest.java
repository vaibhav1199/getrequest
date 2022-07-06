package com.spirngrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spirngrest.springrest.entities.info;


@RestController
public class getrequest {
	
	@Autowired
	private info in;
	
	@GetMapping("/home/search")
	public List<info> home(@RequestParam String words) {
		
		return this.in.home(words);
	}
}
