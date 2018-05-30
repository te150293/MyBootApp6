package jp.te4a.spring.boot.myapp11;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class TestValidator implements ConstraintValidator<TestValid,String>{
	@Override
	public boolean isValid(String in,ConstraintValidatorContext cxt){
		try {
			int i = Integer.parseInt(in);
		}
		catch(Exception e){
			return false;
		}
		return true;
	}
}
