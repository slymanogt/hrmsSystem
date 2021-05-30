package com.example.hrms.core.adapters.concretes;

import com.example.hrms.core.adapters.abstracts.MernisService;

public class MernisAdapter implements MernisService{

	@Override
	public boolean validate(String identificationNumber, String firstName, String lastName, String birthDay) {
		if (identificationNumber.length() != 11) {
            System.out.println("The identification number must consist of 11 digits.");
            return false;
        }
        if (firstName.length() < 2) {
            System.out.println("Please enter a valid name");
            return false;
        }
        if (lastName.length() < 2) {
            System.out.println("Please enter a valid surname");
            return false;
        }
        if (birthDay.length() <= 4 && (Integer.parseInt(birthDay)) < 1900 && (Integer.parseInt(birthDay) > 2021)) {
            System.out.println("Please enter a valid year of birth");
            return false;
        }

        System.out.println("Your Identification informations have been succesfully verified");
        return true;
	}

}
