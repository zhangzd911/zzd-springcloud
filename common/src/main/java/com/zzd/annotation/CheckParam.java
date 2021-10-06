package com.zzd.annotation;

import com.zzd.enums.ParamTypeEnum;
import com.zzd.util.CheckParamUtil.ParamConstraintValidated;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ParamConstraintValidated.class)
public @interface CheckParam {


    ParamTypeEnum type() default ParamTypeEnum.TYPE_STRING;

    String errorMsg() default "";

}
