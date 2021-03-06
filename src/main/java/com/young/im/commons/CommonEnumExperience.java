package com.young.im.commons;

import com.yxzapp.po.BaseErrorInfoInterface;

/**
 * @author youngyanjun
 * @date 2020-03-23 19:10
 */
public enum CommonEnumExperience implements BaseErrorInfoInterface {
    // 数据操作错误定义
    SUCCESS("200", "成功!"),
    FAILED("-1", "失败!"),
    BODY_NOT_MATCH("400", "请求的数据格式不符!"),

    INTERNAL_SERVER_ERROR("500", "服务器内部错误!"),


    JSON_PARSE_ERROR("500", "JSON转换异常，请使用符合格式规范的JSON格式！"),

    DATE_ERROR("505","数据异常,请联系管理员"),
    SOCKET_ERROR("505","服务异常,请联系管理员"),;


    /**
     * 错误码
     */
    private String resultCode;

    /**
     * 错误描述
     */
    private String resultMsg;

    CommonEnumExperience(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    @Override
    public String getResultCode() {
        return resultCode;
    }

    @Override
    public String getResultMsg() {
        return resultMsg;
    }

}
