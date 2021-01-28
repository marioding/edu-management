package xyz.marioding.edu.core.resp;

@SuppressWarnings("AlibabaEnumConstantsMustHaveComment")
public enum RetCode {

    SUCCESS("000000","交易成功"),
    FAIL("000001" , "交易异常");

    private String code;

    private String message;

    RetCode(String code , String message){
        this.code = code;
        this.message = message;
    }

    public String getCode(){
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }

}
