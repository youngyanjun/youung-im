package com.young.im.commons;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;

/**
 * @author youngyanjun
 * @date 2020-04-26 12:14
 */
public enum MessageEnums {
    NO_LOGIN_STATE("SYS", "-1", "该用户还没有登录"),

    FAIL_SYS_4000("SYS", "SYS4000", "操作失败"),

    FAIL_SYS_2001("SYS", "SYS2001", "手机号已经存在"),
    FAIL_SYS_2002("SYS", "SYS2002", "该用户还没有登录"),
    FAIL_SYS_2003("SYS", "SYS2003", "用户名或密码不正确"),
    FAIL_SYS_2004("SYS", "SYS2004", "手机号格式不正确"),
    FAIL_SYS_2005("SYS", "SYS2005", "系统中不存在该用户对应的手机号"),
    FAIL_SYS_2006("SYS", "SYS2006", "找回密码的短信60S内只能发送一次"),
    FAIL_SYS_2007("SYS", "SYS2007", "发送短信失败"),
    FAIL_SYS_2008("SYS", "SYS2008", "验证码错误"),
    FAIL_SYS_2009("SYS", "SYS2009", "手机号或邮箱格式错误"),
    FAIL_SYS_2010("SYS", "SYS2010", "企业名称或纳税人识别号已存在"),
    FAIL_SYS_2011("SYS", "SYS2011", "时间格式错误"),
    FAIL_SYS_2012("SYS", "SYS2012", "邮箱已被占用"),
    FAIL_SYS_2013("SYS", "SYS2013", "您不具有此权限"),
    FAIL_SYS_2014("SYS", "SYS2014", "已存在的项目编码"),
    FAIL_SYS_2015("SYS", "SYS2014", "项目名称或编码为空"),
    FAIL_SYS_2016("SYS", "SYS2016", "原密码错误"),
    FAIL_SYS_2017("SYS", "SYS2017", "无法再次提交"),
    FAIL_SYS_2018("SYS", "SYS2018", "您有必填项未填写项,请完成后再次提交"),
    FAIL_SYS_2019("SYS", "SYS2019", "您暂时未管理任何项目"),
    FAIL_SYS_2020("SYS", "SYS2020", "参数不能为空"),
    FAIL_SYS_2021("SYS", "SYS2021", "该学校下学生存在，不能删除"),
    FAIL_SYS_2022("SYS", "SYS2022", "该院系下有学生存在，不能删除"),
    FAIL_SYS_2023("SYS", "SYS2023", "短信业务类型不存在"),
    FAIL_SYS_2024("SYS", "SYS2024", "短信发送过于频繁"),
    FAIL_SYS_2025("SYS", "SYS2025", "您还不是VIP用户"),
    FAIL_SYS_2026("SYS", "SYS2026", "您的宣讲次数不足，请充值VIP权益"),
    FAIL_SYS_2027("SYS", "SYS2027", "审核企业选择职位异常"),
    FAIL_SYS_2028("SYS", "SYS2028", "批量审核企业异常"),
    FAIL_SYS_2029("SYS", "SYS2029", "宣讲不存在"),
    FAIL_SYS_2030("SYS", "SYS2030", "您的账号注册在企业版"),
    FAIL_SYS_2031("SYS", "SYS2031", "您的账号注册在校园版[学生端]"),
    FAIL_SYS_2032("SYS", "SYS2032", "您的账号注册在校园版[教师端]"),
    FAIL_SYS_2033("SYS", "SYS2033", "您的微信还未绑定易校招账号"),
    FAIL_SYS_2034("SYS", "SYS2034", "您的QQ还未绑定易校招账号"),
    FAIL_SYS_2035("SYS", "SYS2035", "您的账号已被禁止登陆"),
    FAIL_SYS_2036("SYS", "SYS2036", "请先完善学生信息"),
    FAIL_SYS_2037("SYS", "SYS2037", "未获取到第三方用户信息"),
    FAIL_SYS_2038("SYS", "SYS2038", "绑定类型缺失"),
    FAIL_SYS_2039("SYS", "SYS2039", "该账号已绑定其他微信"),
    FAIL_SYS_2040("SYS", "SYS2040", "该账号已绑定其他QQ"),
    FAIL_SYS_2041("SYS", "SYS2041", "用户不存在"),
    FAIL_SYS_2042("SYS", "SYS2042", "职位已不存在"),
    FAIL_SYS_2043("SYS", "SYS2043", "HR不存在"),
    FAIL_SYS_2044("SYS", "SYS2044", "面试不存在"),
    FAIL_SYS_2045("SYS", "SYS2045", "您最多上传5个附件简历"),
    FAIL_SYS_2046("SYS", "SYS2046", "没有查询到到用户信息"),
    FAIL_SYS_2047("SYS", "SYS2047", "HR对应的企业不存在"),
    FAIL_SYS_2048("SYS", "SYS2048", "您需要完善在线简历的求职意向"),
    FAIL_SYS_2049("SYS", "SYS2049", "删除失败！您至少保留一份求职意向"),
    FAIL_SYS_2050("SYS", "SYS2050", "该用户已存在"),
    FAIL_SYS_2051("SYS", "SYS2051", "企业不存在"),
    FAIL_SYS_2052("SYS", "SYS2052", "双选会不存在"),
    FAIL_SYS_2053("SYS", "SYS2053", "不在双选会的报名时间"),
    FAIL_SYS_2054("SYS", "SYS2054", "请使用管理员账号登录"),
    FAIL_SYS_2055("SYS", "SYS2055", "您已报名过本场双选会"),
    FAIL_SYS_2056("SYS", "SYS2056", "宣讲时间已被占用，不能预约！"),
    FAIL_SYS_2057("SYS", "SYS2057", "支付方式有误"),
    FAIL_SYS_2058("SYS", "SYS2058", "用户走丢了~"),
    FAIL_SYS_2059("SYS", "SYS2059", "微信支付失败"),
    FAIL_SYS_2060("SYS", "SYS2060", "请选择展位！"),
    FAIL_SYS_2061("SYS", "SYS2061", "只能预约3天后的宣讲！"),
    FAIL_SYS_2062("SYS", "SYS2062", "最多上传8张照片！"),
    FAIL_SYS_2063("SYS", "SYS2063", "企业认证通过后才能上架职位！"),
    FAIL_SYS_2064("SYS", "SYS2064", "您最多发布1000条职位！"),
    FAIL_SYS_2065("SYS", "SYS2065", "您已认证通过，不能修改营业执照！"),
    FAIL_SYS_2066("SYS", "SYS2066", "仅支持pdf、doc、docx格式的简历！"),
    FAIL_SYS_2067("SYS", "SYS2067", "您的企业资质还未被审核通过！"),
    FAIL_SYS_2068("SYS", "SYS2068", "您必须有已上架的职位！"),
    FAIL_SYS_2069("SYS", "SYS2069", "面试方式不存在！"),
    FAIL_SYS_2070("SYS", "SYS2070", "面试时间必须大于现在！"),
    FAIL_SYS_2071("SYS", "SYS2071", "不支持的面试状态！"),
    FAIL_SYS_2072("SYS", "SYS2072", "订单不存在！"),
    FAIL_SYS_2073("SYS", "SYS2073", "您已投递过该职位！"),
    FAIL_SYS_2074("SYS", "SYS2074", "请输入图形验证码！"),
    FAIL_SYS_2075("SYS", "SYS2075", "订单尚未支付！"),
    FAIL_SYS_2076("SYS", "SYS2076", "您已关注成功！"),
    FAIL_SYS_2077("SYS", "SYS2077", "一天只能刷新一次职位！"),
    FAIL_SYS_2078("SYS", "SYS2078", "您只能确认一份Offer！"),
    FAIL_SYS_2079("SYS", "SYS2079", "您只能发送一份Offer！"),
    FAIL_SYS_2080("SYS", "SYS2080", "此订单不可关闭！"),
    FAIL_SYS_2081("SYS", "SYS2081", "展位不存在！"),
    FAIL_SYS_2082("SYS", "SYS2082", "您已申请过发票"),
    FAIL_SYS_2083("SYS", "SYS2083", "您的权限不足！"),
    FAIL_SYS_2084("SYS", "SYS2084", "您的账号还在审核中，请耐心等待"),
    FAIL_SYS_2085("SYS", "SYS2085", "评价失败"),
    FAIL_SYS_2086("SYS", "SYS2086", "只能刷新上架职位！"),
    FAIL_SYS_2087("SYS", "SYS2087", "您最多拥有5个宣讲模板！"),
    FAIL_SYS_2088("SYS", "SYS2088", "图形验证码错误"),
    FAIL_SYS_2089("SYS", "SYS2089", "职位已下架或已删除"),
    FAIL_SYS_2090("SYS", "SYS2090", "推荐位已下架或已删除"),
    FAIL_SYS_2091("SYS", "SYS2091", "宣讲已下架或已删除"),
    FAIL_SYS_2092("SYS", "SYS2092", "暂无抵扣次数，请立即购买会员"),
    FAIL_SYS_2093("SYS", "SYS2093", "模板已被使用，不能删除"),
    FAIL_SYS_2094("SYS", "SYS2094", "抱歉，同一学校同一周期只可预约一次线上宣讲（两个周期为：1.31-8.31和9.1-1.30）"),
    FAIL_SYS_2095("SYS", "SYS2095", "不存在的订单"),
    FAIL_SYS_2096("SYS", "SYS2096", "推送消息不存在"),
    FAIL_SYS_2097("SYS", "SYS2097", "只有待发送状态的推送消息才可以撤销"),
    FAIL_SYS_2098("SYS", "SYS2098", "消息已被发送或者正在发送，不可删除记录"),
    FAIL_SYS_2099("SYS", "SYS2074", "用户名或密码不正确"),


    FAIL_MALL_3000("MALL", "MALL3000", "订单支付失败！"),
    FAIL_MALL_3001("MALL", "MALL3001", "您已发货！"),
    FAIL_MALL_3002("MALL", "MALL3002", "收货地址已达上限！"),
    FAIL_MALL_3003("MALL", "MALL3003", "商品套餐不存在！"),
    FAIL_MALL_3004("MALL", "MALL3004", "订单地址为空错误！"),
    FAIL_MALL_3005("MALL", "MALL3005", "商品已下架或删除！"),
    FAIL_MALL_3006("MALL", "MALL3006", "商品价格错误！"),
    FAIL_MALL_3007("MALL", "MALL3007", "偏远地区不能选择相同的地址！"),
    FAIL_MALL_3008("MALL", "MALL3007", "商家补货中！"),
    FAIL_MALL_3009("MALL", "MALL3009", "库存不足呢！"),
    FAIL_MALL_4000("MALL", "MALL4000", "暂时无法购买！"),
    FAIL_MALL_4001("MALL", "MALL4001", "供应商电话已存在！"),
    FAIL_MALL_4002("MALL", "MALL4002", "可提现金额不足！"),


    FAIL_MALL_5001("WX", "WX5001", "微信推送失败！"),


    ;


    private String code;
    private String errorType;
    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getErrorType() {
        return errorType;
    }

    MessageEnums(String aerrorType, String acode, String amessage) {
        this.errorType = aerrorType;
        this.code = acode;
        this.message = amessage;
    }

    public static MessageEnums getByCode(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }
        for (MessageEnums con : MessageEnums.values()) {
            if (con.getCode().equals(code)) {
                return con;
            }
        }
        return null;
    }

    public static MessageEnums getByErrorType(String errorType) {
        if (StringUtils.isBlank(errorType)) {
            return null;
        }
        for (MessageEnums con : MessageEnums.values()) {
            if (con.getErrorType().equals(errorType)) {
                return con;
            }
        }
        return null;
    }

}
