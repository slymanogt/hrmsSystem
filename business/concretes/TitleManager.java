package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.TitleService;
import com.example.hrms.dataAccess.abstracts.TitleDao;
import com.example.hrms.entities.concretes.Title;

@Service
public class TitleManager implements TitleService{

	private TitleDao titleDao;
	
	@Autowired
	public TitleManager(TitleDao titleDao) {
		super();
		this.titleDao = titleDao;
	}

	@Override
	public List<Title> getAll() {
		
		return this.titleDao.findAll();
	}

}
