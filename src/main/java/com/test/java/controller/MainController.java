package com.test.java.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.java.entity.Team;
import com.test.java.repository.TeamRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
	
	private final TeamRepository repo;
	
	@GetMapping(value = "/")
	public String index(Model model) {

		return "index";
	}
	
	@GetMapping(value = "/list")
	public String list(Model model) {
		
		List<Team> list = repo.findAll();
		model.addAttribute("list", list);

		return "list";
	}
	
}







