package com.example.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.TitleService;
import com.example.hrms.entities.concretes.Title;

@RestController
@RequestMapping("/api/job_titles")
public class TitleController {

	private TitleService titleService;

	@Autowired
	public TitleController(TitleService titleService) {
		super();
		this.titleService = titleService;
	}
	
	@GetMapping("/getall")
	public List<Title> getAll(){
		
		return this.titleService.getAll();
	}
}
