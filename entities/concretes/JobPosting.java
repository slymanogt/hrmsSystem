package com.example.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_postings")
@AllArgsConstructor
@NoArgsConstructor
public class JobPosting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "job_description")
    private String jobDescription;

    @Column(name = "min_salary")
    private double minSalary;

    @Column(name = "max_salary")
    private double maxSalary;

    @Column(name = "number_of_open_positions")
    private int numberOfOpenPositions;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "application_deadline")
    private Date applicationDeadline;

    @Column(name = "is_active")
    private boolean isActive;

    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private Title title;

    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private City city;

    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private Employer employer;


}