package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.TitleService;
import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.core.utilities.result.Result;
import com.example.hrms.core.utilities.result.SuccessDataResult;
import com.example.hrms.core.utilities.result.SuccessResult;
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
	public DataResult<List<Title>> getAll() {
		return new SuccessDataResult<List<Title>>(this.titleDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(Title title) {
		this.titleDao.save(title);
		return new SuccessResult("Başlık eklendi");
	}

}
