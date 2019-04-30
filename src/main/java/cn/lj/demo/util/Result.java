package cn.lj.demo.util;

public class Result {
    public int code;
    public Object data;
    public String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Result() {
        this.code=ResultCode.Result_SUCESS;
        this.msg=ResultMessage.Result_SUCESS;
    }

    public Result(int code,String msg) {
        this.code=code;
        this.msg=msg;
    }
}
