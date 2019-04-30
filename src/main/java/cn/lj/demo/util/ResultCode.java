package cn.lj.demo.util;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ResultCode {
    int Result_SUCESS = 200;
    int Result_FAIL = 400;
    int Result_LOGING = 401;

}
