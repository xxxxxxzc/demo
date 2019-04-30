package cn.lj.demo.util;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ResultMessage {
    String Result_SUCESS = "操作成功";
    String Result_FAIL = "操作失败";
    String Result_LOGING = "请登陆";

}
