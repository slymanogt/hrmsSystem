package com.example.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.TitleService;
import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.core.utilities.result.Result;
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
	public DataResult<List<Title>> getAll(){
		return this.titleService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Title title) {
		return this.titleService.add(title);
	}
}
