package com.zzd.util.CheckParamUtil;

import org.hibernate.annotations.Check;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParamConstraintValidated implements ConstraintValidator<Check, Object> {
    @Override
    public void initialize(Check constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {

        return false;
    }
}
