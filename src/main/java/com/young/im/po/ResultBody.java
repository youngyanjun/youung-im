package com.young.im.po;

import com.alibaba.fastjson.JSONObject;
import com.young.im.commons.CommonEnumExperience;
import com.young.im.commons.MessageEnums;


/**
 * @author youngyanjun
 * @date 2020-03-23 19:14
 */
public class ResultBody {
    /**
     * 响应代码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应结果
     */
    private Object result;

    public ResultBody() {
    }

    public ResultBody(com.yxzapp.po.BaseErrorInfoInterface errorInfo) {
        this.code = errorInfo.getResultCode();
        this.message = errorInfo.getResultMsg();
    }

    public ResultBody(String resultCode, String code, String message) {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    /**
     * 成功
     *
     * @return
     */
    public static ResultBody success() {
        return success(null);
    }

    /**
     * 成功
     *
     * @param data
     * @return
     */
    public static ResultBody success(Object data) {
        ResultBody rb = new ResultBody();
        rb.setCode(CommonEnumExperience.SUCCESS.getResultCode());
        rb.setMessage(CommonEnumExperience.SUCCESS.getResultMsg());
        rb.setResult(data);
        return rb;
    }

    /**
     * 失败
     */
    public static ResultBody error(com.yxzapp.po.BaseErrorInfoInterface errorInfo) {
        ResultBody rb = new ResultBody();
        rb.setCode(errorInfo.getResultCode());
        rb.setMessage(errorInfo.getResultMsg());
        rb.setResult(null);
        return rb;
    }

    /**
     * 失败
     */
    public static ResultBody error(MessageEnums messageInfo) {
        ResultBody rb = new ResultBody();
        rb.setCode(messageInfo.getCode());
        rb.setMessage(messageInfo.getMessage());
        rb.setResult("");
        return rb;
    }

    /**
     * 失败
     */
    public static ResultBody error(MessageEnums messageInfo,Object result) {
        ResultBody rb = new ResultBody();
        rb.setCode(messageInfo.getCode());
        rb.setMessage(messageInfo.getMessage());
        rb.setResult(result);
        return rb;
    }

    /**
     * 失败
     */
    public static ResultBody error(String code, String message) {
        ResultBody rb = new ResultBody();
        rb.setCode(code);
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }

    /**
     * 失败
     */
    public static ResultBody error(String message) {
        ResultBody rb = new ResultBody();
        rb.setCode("505");
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
