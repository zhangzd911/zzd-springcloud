package com.zzd.enums;

import com.zzd.util.CheckParamUtil.ParamCheckProcessor;
import com.zzd.util.CheckParamUtil.ParamCheckStringProcessor;

import java.lang.reflect.Method;

public enum ParamTypeEnum {


    TYPE_STRING(new ParamCheckStringProcessor());

    //private String type;
    public ParamCheckProcessor paramCheckProcessor;

    private ParamTypeEnum(ParamCheckProcessor paramCheckProcessor){
        this.paramCheckProcessor = paramCheckProcessor;
    }

    public ParamCheckProcessor getParamCheckProcessor() {
        return paramCheckProcessor;
    }

    public void setParamCheckProcessor(ParamCheckProcessor paramCheckProcessor) {
        this.paramCheckProcessor = paramCheckProcessor;
    }
}
