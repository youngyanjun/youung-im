package com.yxzapp.commons.constant;

/**
 * @author ben
 * @date 2020-06-15 18:18
 */
public class JiGuangConstant {


    //推送最大保留时长
    public static final String JPUSH_MAX_TIMELIVE = "864000";


    //推送是否需要刷新
    public static final int JPUSH_NEED_REFRESH = 1;
    public static final int JPUSH_NOTNEED_REFRESH = 0;


    //极光推送平台
    public static final String JPUSH_PLATFORM_ALL = "all";
    public static final String JPUSH_PLATFORM_ANDROID = "android";
    public static final String JPUSH_PLATFORM_IOS = "ios";

    //极光推送消息文本类型
    public static final String JPUSH_CONTENTTYPE_TEXT = "text";







    //推送文字
    public static final String JPUSH_TEACHIN_THREEDAYS =
            "您的企业宣讲室将在三天后开始，请尽快登录易校招企业版PC端上传、关联宣讲资料（如已操作请忽略）。http://www.yxzjob.com/";
    public static final String JPUSH_INTERVIEW_TODAY_COMPANY = "您今天有面试计划，请注意时间，准时进入面试室。";
    public static final String JPUSH_INTERVIEW_TODAY_STUDENT = "你今天有面试邀请，请注意时间，准时进入面试室。";






    public static final int JPUSH_NOTICETYPE_CUSTOM = 0;      //自定义消息推送


    //宣讲类型的提示
    public static final int JPUSH_NOTICETYPE_TEACHIN_THREEDAYS = 101;      //三天后有宣讲
    public static final int JPUSH_NOTICETYPE_TEACHIN_THREEHOURS = 102;     //三小时后有宣讲

    //面试类型的提示
    public static final int JPUSH_NOTICETYPE_INTERVIEW_TODAY = 201;         //今天有面试

    //VIP订单类型的提示
    public static final int JPUSH_NOTICETYPE_VIPORDER_PASS = 301;           //VIP订单审核通过
    public static final int JPUSH_NOTICETYPE_VIPORDER_NOTPASS = 302;        //VIP订单审核未通过

    //线下双选会订单类型的提示
    public static final int JPUSH_NOTICETYPE_UNDERORDER_PASS = 401;         //线下双选会订单审核通过
    public static final int JPUSH_NOTICETYPE_UNDERORDER_NOTPASS = 402;      //线下双选会订单审核未通过

    //Offer类型的提示
    public static final int JPUSH_NOTICETYPE_OFFER_ACTIVE_SEND = 501;      //企业向学生发送的offer
    public static final int JPUSH_NOTICETYPE_OFFER_ACTIVE_ACCEPT = 504;    //学生接受企业发送的offer
    public static final int JPUSH_NOTICETYPE_OFFER_ACTIVE_REFUSE = 505;    //学生拒绝企业发送的offer
    public static final int JPUSH_NOTICETYPE_OFFER_PASSIVE_ACCEPT = 502;   //企业收到学生接受offer的提示
    public static final int JPUSH_NOTICETYPE_OFFER_PASSIVE_REFUSE = 503;   //企业收到学生拒绝offer的提示
    public static final int JPUSH_NOTICETYPE_OFFER_PASSIVE_SEND = 506;     //学生收到企业发送的offer的提示

    //Resume类型的提示
    public static final int JPUSH_NOTICETYPE_RESUME_ACTIVE_SEND = 601;      //学生向企业发送resume的提示
    public static final int JPUSH_NOTICETYPE_RESUME_ACTIVE_ACCEPT = 602;    //企业接受学生发送的resume
    public static final int JPUSH_NOTICETYPE_RESUME_ACTIVE_REFUSE = 603;    //企业拒绝学生发送的resume
    public static final int JPUSH_NOTICETYPE_RESUME_PASSIVE_SEND = 604;     //学生收到企业回应resume的提示
    public static final int JPUSH_NOTICETYPE_RESUME_PASSIVE_ACCEPT = 605;   //学生收到企业接受resume的提示
    public static final int JPUSH_NOTICETYPE_RESUME_PASSIVE_REFUSE = 606;   //学生收到企业拒绝resume的提示


    public static final int JPUSH_NOTICETYPE_SCHOOL_NEWUNDERS = 701;      //企业关注的高校新开双选会




}
