package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.CityService;
import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.core.utilities.result.Result;
import com.example.hrms.core.utilities.result.SuccessDataResult;
import com.example.hrms.core.utilities.result.SuccessResult;
import com.example.hrms.dataAccess.abstracts.CityDao;
import com.example.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService{
	
	private CityDao cityDao;

	@Autowired
    public CityManager(CityDao cityDao){
        this.cityDao=cityDao;
    }
	@Override
	public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(this.cityDao.findAll(), "Cities was listed");
	}
	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult("Şehir eklendi");
	}

}
