package com.example.hrms.business.abstracts;

import java.util.List;
import java.util.Optional;

import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.core.utilities.result.Result;
import com.example.hrms.entities.concretes.User;

public interface UserService {

	DataResult<List<User>> getAll();
	Result add(User user);
    DataResult<Optional<User>> getById(int userId);
}
