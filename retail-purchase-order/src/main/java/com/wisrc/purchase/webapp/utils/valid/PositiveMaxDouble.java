package com.wisrc.purchase.webapp.utils.valid;


import com.wisrc.purchase.webapp.utils.valid.validation.PositiveMaxDoubleConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PositiveMaxDoubleConstraintValidator.class)
public @interface PositiveMaxDouble {
    //自定义注解必须实现这三个属性
    String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}