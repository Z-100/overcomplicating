package com.lezurex.overcomplicated.annotations;

import java.lang.annotation.*;

@Documented
@Target({ ElementType.TYPE,
		ElementType.FIELD,
		ElementType.METHOD,
		ElementType.PARAMETER,
		ElementType.CONSTRUCTOR,
		ElementType.LOCAL_VARIABLE,
		ElementType.PACKAGE })
@Retention(RetentionPolicy.SOURCE)
public @interface VeryUseful {

	String theBecause() default "I am very useful";
}
