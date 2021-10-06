package com.zzd.util;

import lombok.Data;

@Data
public class ResultMsg<T> {

    String code;
    String msg;
    T data;


}
