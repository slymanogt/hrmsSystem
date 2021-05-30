package com.example.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobPostingService;
import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.core.utilities.result.Result;
import com.example.hrms.entities.concretes.JobPosting;

@RestController
@RequestMapping("/api/job_postings")
public class JobPostingController {
    private JobPostingService jobPostingService;

    @Autowired
    public JobPostingController(JobPostingService jobPostingService) {
        this.jobPostingService = jobPostingService;
    }

    @GetMapping("/getall")
    public DataResult<List<JobPosting>> getAll() {
        return this.jobPostingService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobPosting jobPosting) {
        return this.jobPostingService.add(jobPosting);
    }

    @PostMapping("/update")
    public Result update(@RequestBody JobPosting jobPosting){
        return this.jobPostingService.update(jobPosting);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody JobPosting jobPosting){
        return this.jobPostingService.delete(jobPosting);
    }
}