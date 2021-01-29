package xyz.marioding.edu.core.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true,fluent = true)
public class Response implements Serializable {

    private String retCode;

    private String retMsg;

    private Object data;

    public static Response ok(){
        return new Response().retCode(RetCode.SUCCESS.getCode())
                            .retMsg(RetCode.SUCCESS.getMessage());
    }

    public static Response fail(){
        return new Response().retCode(RetCode.FAIL.getCode())
                .retMsg(RetCode.FAIL.getMessage());
    }


    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
