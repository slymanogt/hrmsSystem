package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.core.utilities.result.Result;
import com.example.hrms.entities.concretes.JobPosting;

public interface JobPostingService {
	DataResult<List<JobPosting>> getAll();
    Result add(JobPosting jobPosting);
    Result update(JobPosting jobPosting);
    Result delete(JobPosting jobPosting);
}
