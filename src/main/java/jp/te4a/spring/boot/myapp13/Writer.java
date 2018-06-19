package jp.te4a.spring.boot.myapp13;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = TestValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Writer {
	String param();
	String message() default "input {param}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default{};
}
