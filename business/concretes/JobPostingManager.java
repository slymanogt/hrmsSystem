package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobPostingService;
import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.core.utilities.result.Result;
import com.example.hrms.core.utilities.result.SuccessDataResult;
import com.example.hrms.core.utilities.result.SuccessResult;
import com.example.hrms.dataAccess.abstracts.JobPostingDao;
import com.example.hrms.entities.concretes.JobPosting;

@Service
public class JobPostingManager implements JobPostingService{

	 private JobPostingDao jobPostingDao;

    @Autowired
    public JobPostingManager(JobPostingDao jobPostingDao){
        this.jobPostingDao=jobPostingDao;
    }

    @Override
    public DataResult<List<JobPosting>> getAll() {
        return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findAll(),"Job posting was listed");
    }

    @Override
    public Result add(JobPosting jobPosting) {
        this.jobPostingDao.save(jobPosting);
        return new SuccessResult("Job posting was added");
    }

    @Override
    public Result update(JobPosting jobPosting) {
        this.jobPostingDao.save(jobPosting);
        return new SuccessResult("Job posting was updated");
    }

    @Override
    public Result delete(JobPosting jobPosting) {
        this.jobPostingDao.delete(jobPosting);
        return new SuccessResult("Job posting was deleted");
    }
}
