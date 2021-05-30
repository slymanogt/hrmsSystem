package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Title;

public interface TitleDao extends JpaRepository<Title, Integer>{
    List<Title> findByTitleName(String jobPositionName);
}
