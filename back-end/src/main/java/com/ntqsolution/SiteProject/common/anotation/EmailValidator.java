package com.ntqsolution.SiteProject.common.anotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<EmailValid, String> {

	@Override
	public void initialize(EmailValid arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		return false;
	}

}
