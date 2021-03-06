package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.JobPosting;


public interface JobPostingDao extends JpaRepository<JobPosting, Integer>{
	List<JobPosting> findByIsActiveTrue();
    List<JobPosting> findByIsActiveTrueAndEmployer_Id(int employerId);
}
