package com.example.hrms.core.adapters.abstracts;

public interface MernisService {
    boolean validate(String identificationNumber, String firstName, String lastName, String birthDay);
}
