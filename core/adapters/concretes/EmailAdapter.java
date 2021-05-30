package com.example.hrms.core.adapters.concretes;

import java.util.regex.Pattern;

import com.example.hrms.core.adapters.abstracts.EmailService;

public class EmailAdapter implements EmailService{

	private String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	
	@Override
	public boolean isEmailValidation(String emailAddress) {
		if (Pattern.matches((regex), emailAddress)) {
            return true;
        } else {
            return false;
        }
    }
}
