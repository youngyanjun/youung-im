package com.yxzapp.commons.constant;

/**
 * @author youngyanjun
 * @date 2020-04-23 18:08
 */
public class CommonConstant {

    // session过期时间
    public static final long SESSION_EXPIRE_TIME = 60 * 60;
    // redis过期时间
    public static final long REDISEXPIRE_DAY_ONE = 60 * 60 * 24;
    public static final long REDISEXPIRE_HOUR_ONE = 60 * 60 * 1;
    public static final long REDISEXPIRE_MINUTE_ONE = 60 * 1;

    // 空数组字符串
    public static final String JSON_EMPTY_ARRAY = "[]";

    // 默认时间格式
    public static final String PATTERN_DATE = "yyyy-MM-dd";
    public static final String PATTERN_DATETIME = "yyyy-MM-dd HH:mm:ss";
    public static final String PATTERN_DATETIME_FORMAT_POINT = "yyyy.MM.dd HH:mm:ss";

    // 布尔型返回
    public static final Boolean BOOLEAN_FLAG_TRUE = true;
    public static final Boolean BOOLEAN_FLAG_FALSE = false;

    // Long返回
    public static final Long LONG_FLAG_TRUE = 1L;
    public static final Long LONG_FLAG_FALSE = 0L;

    // int返回
    public static final int INT_FLAG_TRUE = 1;
    public static final int INT_FLAG_FALSE = 0;

    // byte返回
    public static final byte BYTE_FLAG_TRUE = 1;
    public static final byte BYTE_FLAG_FALSE = 0;

    // 新后台是否已推上[ 正式 ]环境？APP端会据此弹框提醒！！！未上正式环境前，一定要返回NO
    public static final String NEWBACKEND_ONLINE_YES = "online";
    public static final String NEWBACKEND_ONLINE_NO = "no";

    //永久免验证的验证码
    public static final String FOREVER_SMS_CODE = "111111";
    // PC登陆的REDIS缓存key值
    public static final String GRAPHIC_CODE_PC = "graphicCode:pcLogin:";
    public static final String ERROR_LOGIN_MOBILE = "errorLogin::";

    // 文件目录及格式
    public static final String OSS_DIR_PDF = "pdf/";
    public static final String FILE_TYPE_PDF = ".pdf";
    public static final String FILE_TYPE_DOC = ".doc";
    public static final String FILE_TYPE_DOCX = ".docx";


    // 浏览器下载文件
    public static final String RESPONSE_CONTENTTYPE_DOWNLOAD = "application/force-download";
    public static final String RESPONSE_CONTENTDISPOSITION_HEADERNAME = "Content-Disposition";
    public static final String RESPONSE_CONTENTDISPOSITION_DOWNLOAD = "attachment;filename=";
    public static final String CHARSET_UTF8 = "UTF-8";
    public static final String CHARSET_ISO_8859_1 = "ISO-8859-1";
    public static final int BUFFER_SIZE_1024 = 1024;

    // 下载学生在线简历的后缀名
    public static final String ONLINE_RESUME_SUFFIX = "的在线简历.pdf";

    /**
     * ES操作类型
     * */
    public static final byte ESDOC_OPERATE_ADD = 1;
    public static final byte ESDOC_OPERATE_DELETE = 2;

    /**
     * 站内信消息类型
     * */
    public static final int MESSAGE_TYPE_TEACHIN_PUSH = 1;
    public static final int MESSAGE_TYPE_ORDER_VIP_PASS = 2;
    public static final String MESSAGE_TYPE_ORDER_VIP_PASS_CONTENT = "您的会员购买订单已审核通过。";
    public static final int MESSAGE_TYPE_ORDER_VIP_FAIL = 3;
    public static final String MESSAGE_TYPE_ORDER_VIP_FAIL_CONTENT = "您的会员购买订单未审核通过，如有疑问请联系客服：4008-628-528。";

    public static final int MESSAGE_TYPE_ORDER_UNDER_PASS = 4;
    public static final int MESSAGE_TYPE_ORDER_UNDER_FAIL = 5;
    public static final int MESSAGE_TYPE_INTERVIEW_NOTICE = 6;
    public static final int MESSAGE_TYPE_COLLECTSCHOOL_NEWUNDER = 7;


    /**
     * 第三方登录用户密码(md5(88888888)为明文，md5(md5(88888888))为密文)
     */
    public static final String THIRDPLATFORM_LOGIN_PASSWORD ="8ddcff3a80f4189ca1c9d4d902c3c909";
    public static final String THIRDPLATFORM_LOGIN_PWD ="1f22f6ce6e58a7326c5b5dd197973105";

    /**
     * 采用的加密方式
     */
    public static final String ENCRYPTION_ALGORITHM = "MD5";

    /**
     * 密码加密次数
     */
    public static final int ENCRYPTION_NUMBER = 2;
    /**
     * 订单状态  0  未支付   1 支付完成 2 已发货  3  交易完成  4 交易关闭
     */
    public static final int ORDER_STATUS_PAY_STAT = 0;
    public static final int ORDER_STATUS_PAY_END = 1;
    public static final int ORDER_STATUS_SEND_GOODS = 2;
    public static final int ORDER_STATUS_ORDER_FINISH = 3;
    public static final int ORDER_STATUS_ORDER_CLOSE = 4;

    /**
     * 商品状态  0  正常   1 问题处理中 2 已拒绝  3  已退款  4 售后已完成
     */
    public static final int ITEM_STATUS_NORMAL = 0;
    public static final int ITEM_STATUS_PROCESSING= 1;
    public static final int ITEM_STATUS_REFUSE = 2;
    public static final int ITEM_STATUS_REFUNDED = 3;
    public static final int ITEM_STATUS_SERVICE_FINISH = 4;
    /**
     * 删除标记
     */
    public static final byte IS_DELETE = 1;
    public static final byte IS_NOT_DELETE = 0;

    /**
     * 二维码类型
     */
    public static final byte QRCODE_TYPE_COMPANY = 1;
    public static final byte QRCODE_TYPE_SIGNUP = 2;

    /**
     * 登陆设备端口标识
     */
    public static final String DEVICE_WEB = "WEB";
    public static final String DEVICE_APP = "APP";

    /**
     * 活动推荐记录
     */
    public static final byte RECOMMEND_TYPE_RIGISTER = 1;
    public static final byte RECOMMEND_TYPE_VIP = 2;

    /**
     * 微信支付APP类型常量
     */
    public static final byte WECHATPAY_PAYTYPE_COMPANYAPP = 1;
    public static final byte WECHATPAY_PAYTYPE_STUDENTAPP = 2;
    public static final byte WECHATPAY_PAYTYPE_H5 = 3;
    public static final byte WECHATPAY_PAYTYPE_JSAPI = 4;

    /**
     * 微信支付交易类型
     */
    public static final String WECHATPAY_TRADETYPE_APP = "APP";
    public static final String WECHATPAY_TRADETYPE_NATIVE = "NATIVE";
    public static final String WECHATPAY_TRADETYPE_MWEB = "MWEB";
    public static final String WECHATPAY_TRADETYPE_JSAPI = "JSAPI";
    public static final String WECHATPAY_PREPAY_PACKAGE = "Sign=WXPay";


    /**
     * 短信模板
     */
    public static final int ALIMESSAGE_CODE_LENGTHY = 6;
    public static final String ALIMESSAGE_TEMPLATE_REGISTER = "register";
    public static final String ALIMESSAGE_TEMPLATE_CHANGEMOBILE = "changeMobile";
    public static final String ALIMESSAGE_TEMPLATE_CHANGEPASS = "changePass";
    public static final String ALIMESSAGE_TEMPLATE_BINDACCOUNT = "bindAccount";
    public static final String ALIMESSAGE_TEMPLATE_COMPANY_H5_PAY = "companyH5Pay";



    /**
     * 正则表达式 验证
     */
    public static final String PHONE = "[0-9-()（）]{7,18}";
    public static final String EMAIL = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";



    /**
     * 推荐位类型(1 banner 2关于我们 3宣讲规则 4外部h5连接)
     */
    public static final byte RECOMMEND_TYPE_BANNER= 1;
    public static final byte RECOMMEND_TYPE_ABOUTUS_COM= 2;
    public static final byte RECOMMEND_TYPE_ABOUTUS_SCH= 6;
    public static final byte RECOMMEND_TYPE_TEACHINROLE= 3;
    public static final byte RECOMMEND_TYPE_EXTERNAL= 4;
    public static final byte RECOMMEND_TYPE_KNOWLEDGE= 5;
    /**
     * 是否支持企业(1是0否)
     */
    public static final byte BANNER_COMPANY_SUPPORT = 1;
    public static final byte BANNER_COMPANY_UNSUPPORT = 0;
    /**
     * Banner的上下架(1是0否)
     */
    public static final byte BANNER_SHELF_ON= 1;
    public static final byte BANNER_SHELF_OFF= 2;



    /**
     * 用户登录后台标识，是否可以登录（1是0否）
     */
    public static final byte USER_LOGIN_ALLOW= 1;
    public static final byte USER_LOGIN_DENIE= 0;

    /**
     * 用户登录类型（1微信 2qq 0或其他为手机账户登录）
     */
    public static final byte THIRDPLATFORM_TYPE_MOBILE= 0;
    public static final byte THIRDPLATFORM_TYPE_WECHAT= 1;
    public static final byte THIRDPLATFORM_TYPE_QQ= 2;

    /**
     * 职位上下架状态（1上架0下架）
     */
    public static final byte PROFESSION_SHELF_ALL= -1;
    public static final byte PROFESSION_SHELF_ON= 1;
    public static final byte PROFESSION_SHELF_OFF= 0;

    /**
     * 分隔连接符
     */
    public static final String PROFESSION_CITYNAME_SEPARATOR = " | ";
    public static final String SCHOOL_CITYNAME_SEPARATOR = " | ";

    public static final long PROFESSION_CITYID_ALLCOUNTRY_FIRST = 100000;
    public static final long PROFESSION_CITYID_ALLCOUNTRY_SECOND = 100100;
    public static final long PROFESSION_CITYID_ALLCOUNTRY_THIRD = 100101;
    public static final String PROFESSION_CITYNAME_ALLCOUNTRY = "全国";

    /**
     * 宣讲室的上下架状态（1上架0下架）
     */
    public static final Integer TEACHIN_SHELF_ON= 1;
    public static final Integer TEACHIN_SHELF_OFF= 0;


    /**
     * 宣讲室的进行状态（1即将开始2进行中3已结束）
     */
    public static final byte TEACHIN_STATUS_COMING= 1;
    public static final byte TEACHIN_STATUS_ONGOING= 2;
    public static final byte TEACHIN_STATUS_FINISHED= 3;

    /**
     * 宣讲室的聊天记录备份，备份时限默认由一个开始时间到当前时间。开始时间
     */
    public static final int TEACHIN_BACKUP_MINUTES= 100;
    public static final int TEACHIN_RESTRICT_MONTH_START= 2;
    public static final int TEACHIN_RESTRICT_MONTH_END= 8;
    public static final int TEACHIN_RESTRICT_DAY= 3;

    /**
     * 极光推送，每分钟最大数量
     */
    public static final int JIGUANG_PUSH_SIZE= 990;
    public static final int JIGUANG_IMTYPE_COMPANY= 1;
    public static final int JIGUANG_IMTYPE_SCHOOL= 2;

    /**
     * 宣讲室的宣讲回顾状态（1开放0关闭）
     */
    public static final byte TEACHIN_REVIEW_OPEN= 1;
    public static final byte TEACHIN_REVIEW_CLOSE= 0;
    public static final byte TEACHIN_CHAT_TYPE_SOCKET= 1;
    public static final byte TEACHIN_CHAT_TYPE_JIGUANG= 2;

    /**
     * 双选会,宣讲会类型(1双选会 2宣讲会)
     */
    public static final byte ACTIVITY_TYPE_UNDER= 1;
    public static final byte ACTIVITY_TYPE_TEACHIN= 2;

    /**
     * 企业审核状态(1通过 2未通过 3认证中 4已拒绝)
     */
    public static final byte COMPANY_STATUS_PASS= 1;
    public static final byte COMPANY_STATUS_FAIL= 2;
    public static final byte COMPANY_STATUS_AUDITTING= 3;
    public static final byte COMPANY_STATUS_REFUSE= 4;

    /**
     * APP端口类型
     */
    public static final byte APP_TYPE_SCHOOL= 1;
    public static final byte APP_TYPE_COMPANY= 2;

    /**
     * 用户类型
     */
    public static final byte USER_TYPE_ADMIN = 0;
    public static final byte USER_TYPE_STUDENT = 1;
    public static final byte USER_TYPE_TEACHER = 2;
    public static final byte USER_TYPE_COMPANY = 3;
    public static final byte USER_TYPE_MALL_ADMIN = 4;
    public static final byte USER_TYPE_MALL_ADMIN_COMPANY = 5;


    /**
     * 用户账户状态（1正常2审核中3禁用）
     */
    public static final byte USER_STATUS_NORMAL = 1;//正常
    public static final byte USER_STATUS_AUTHING = 2;//审核中
    public static final byte USER_STATUS_DISABLE = 3;//禁用

    /**
     * 面试室是否正在沟通
     */
    public static final Integer INTERVIEW_COMMUNICATING_NO = 0;//非正在沟通
    public static final Integer INTERVIEW_COMMUNICATING_YES = 1;//正在沟通

    /**
     * 消息是否已读
     */
    public static final byte MESSAGE_READ_YES = 1;
    public static final byte MESSAGE_READ_NO = 0;

    /**
     * 消息发送状态
     */
    public static final int MESSAGE_SENDSTATUS_STATUS_WAIT = 1;
    public static final int MESSAGE_SENDSTATUS_STATUS_ING = 2;
    public static final int MESSAGE_SENDSTATUS_STATUS_FINISHED = 3;
    public static final int MESSAGE_SENDSTATUS_STATUS_CANCEL = 4;

    /**
     * 消息发送类型
     */
    public static final int MESSAGE_SENDTYPE_ALL = 0;
    public static final int MESSAGE_SENDTYPE_SYS = 1;
    public static final int MESSAGE_SENDTYPE_PUSH = 2;

    /**
     * 消息发送对象
     */
    public static final int MESSAGE_TARGETTYPE_ALL = 0;
    public static final int MESSAGE_TARGETTYPE_STUDENT = 1;
    public static final int MESSAGE_TARGETTYPE_COMPANY = 2;

    /**
     * 面试室过程（1投递中 2邀请面试 3待面试 4已面试 5不合适 6待考虑）
     */
    public static final byte INTERVIEW_STEP_SENDRESUME = 1;
    public static final byte INTERVIEW_STEP_INVITE = 2;
    public static final byte INTERVIEW_STEP_WAIT = 3;
    public static final byte INTERVIEW_STEP_FINISHED = 4;
    public static final byte INTERVIEW_STEP_REFUSE = 5;
    public static final byte INTERVIEW_STEP_CONSIDER = 6;

    /**
     * 学生账号是否需要完善信息
     */
    public static final byte STUDENT_INFO_COMPLETE = 0;//正常
    public static final byte STUDENT_INFO_DEFECT = 1;//需要完善信息

    /**
     * 学生收藏列表的类型
     */
    public static final byte COLLECT_TYPE_COMPANY = 1;
    public static final byte COLLECT_TYPE_PROFESSION = 2;
    public static final byte COLLECT_TYPE_SCHOOL = 3;

    /**
     * 学生收藏列表的类型
     */
    public static final byte COLLECT_STATUS_YES = 1;
    public static final byte COLLECT_STATUS_NO = 0;

    /**
     * 高校宣讲类型。0线上线下皆有，1线上，2线下
     */
    public static final byte SCHOOL_TEACHINS_BOTH= 0;
    public static final byte SCHOOL_TEACHINS_TEACHIN= 1;
    public static final byte SCHOOL_TEACHINS_UNDER= 2;



    public static final String ORDERPAY_VIP_BODYNAME = "易校招(企业)-vip";
    public static final String ORDERPAY_UNDER_BODYNAME = "易校招(企业)-双选会";
    public static final String ORDERPAY_STATUS_SUCCESS = "SUCCESS";
    public static final String ORDERPAY_MSG_OK = "OK";

    /**
     * 套餐类型（1常规套餐 2面试时长加油包）
     */
    public static final int VIP_TYPE_NORMAL= 1;
    public static final int VIP_TYPE_INTERVIEWTIME= 2;

    /**
     * 订单类型（1宣讲订单 2VIP订单 3双选会订单）
     */
    public static final byte ORDER_TYPE_TEACHIN= 1;
    public static final byte ORDER_TYPE_VIP= 2;
    public static final byte ORDER_TYPE_UNDERS= 3;

    /**
     * 订单的version字段起始值
     * */
    public static final int ORDER_VERSION_START= 1;

    /**
     * 支付方式{1微信 2权益抵扣 3对公转账}
     */
    public static final byte PAYTYPE_WECHAT= 1;
    public static final byte PAYTYPE_DEDUCTION= 2;
    public static final byte PAYTYPE_PUBLIC= 3;

    /**
     * 订单审核状态
     */

    public static final byte ORDER_STATUS_WAITPAY= 1;
    public static final byte ORDER_STATUS_CLOSE= 2;
    public static final byte ORDER_STATUS_AUDITTING= 3;
    public static final byte ORDER_STATUS_SUCCESS= 4;
    public static final byte ORDER_STATUS_FAIL= 5;

    /**
     * 商品订单状态
     */
    public static final byte MALL_ORDER_STATUS_WAITPAY= 0;
    public static final byte MALL_ORDER_STATUS_SUCCESS= 1;


    /**
     * 双选会企业报名状态
     */
    public static final byte UNDERSIGN_STATUS_WAIT= 0;
    public static final byte UNDERSIGN_STATUS_SUCCESS= 1;
    public static final byte UNDERSIGN_STATUS_FAIL= 2;
    /**
     * 订单是否需要发票
     */
    public static final byte ORDER_INVOICE_NO= 0;
    public static final byte ORDER_INVOICE_YES= 1;
    /**
     * 订单是否需要发票
     */
    public static final String ORDER_VOUCHER_VIP= "vipOrderVoucher";
    public static final String ORDER_VOUCHER_UNDER= "undersOrderVoucher";
    /**
     * 订单发票状态
     */
    public static final byte INVOICE_STATUS_APPLY= 1;
    public static final byte INVOICE_STATUS_HANDLE= 2;
    public static final byte INVOICE_STATUS_SENDED= 3;

    /**
     * 面试方式（1电话 2视频通话）
     */
    public static final int INTERVIEW_TYPE_PHONE= 1;
    public static final int INTERVIEW_TYPE_VIDEO= 2;

    /**
     * 面试状态（1投递中 2邀请面试 3待面试 4已面试 5不合适 6待考虑）
     */
    public static final int INTERVIEW_STATUS_SENDED= 1;
    public static final int INTERVIEW_STATUS_INVITE= 2;
    public static final int INTERVIEW_STATUS_WAIT= 3;
    public static final int INTERVIEW_STATUS_FINISHED= 4;
    public static final int INTERVIEW_STATUS_REJECT= 5;
    public static final int INTERVIEW_STATUS_CONSIDER= 6;

    /**
     * 今日面试标签（1是0否）
     */
    public static final int INTERVIEW_TODAY_YES= 1;
    public static final int INTERVIEW_TODAY_NO= 0;

    /**
     * Offer状态（1等待确认 2已确认 3已拒绝）
     */
    public static final int OFFER_STATUS_SENDED= 1;
    public static final int OFFER_STATUS_CONFIRM= 2;
    public static final int OFFER_STATUS_REJECT= 3;
    public static final int OFFER_STATUS_GIVEUP= 4;

    /**
     * 企业宣传视频，是否允许上传
     */
    public static final int VIP_COMPANYVIDEO_CLOSE= 0;
    public static final int VIP_COMPANYVIDEO_OPEN= 1;

    /**
     * 学生附件简历数量
     */
    public static final int APPENDIX_COUNT_MAX = 5;

    /**
     * 学生附件简历来源
     */
    public static final byte APPENDIX_RESOURCE_PC= 1;
    public static final byte APPENDIX_RESOURCE_APP= 2;

    /**
     * 学生附件简历是否默认
     */
    public static final byte APPENDIX_DEFAULT_YES = 1;
    public static final byte APPENDIX_DEFAULT_NO = 0;

    /**
     * redis 签到类型
     */
    public static final String COM_SIGN_IN = "com_sign_in:";
    public static final String STU_SIGN_IN = "stu_sign_in:";


    
    /**
     * sys-file的biz_type业务类型
     */
    public static final String USER_AVATAR= "userAvatar";//用户头像
    public static final String SCHOOL_LOGO= "schoolLogo";//学校logo
    public static final String COMPANY_LOGO= "companyLogo";//企业logo
    public static final String TEACHIN_LOGO= "teachinLogo";//宣讲室logo
    public static final String TEACHIN_IMAGES= "teachinImages";//宣讲室宣讲详情图片
    public static final String TEACHIN_TEMPLATE_LOGO= "teachinTemplateLogo";//宣讲模板logo
    public static final String TEACHIN_TEMPLATE_IMAGES= "teachinTemplateImages";//宣讲模板宣讲详情图片
    public static final String UNDERS_LOGO= "undersLogo";//双选会logo
    public static final String UNDERSBOOTH_IMAGES= "undersBoothImages";//双选会展位图片
    public static final String COMPANY_CODE= "companyCode";//企业二维码
    public static final String COMPANY_SIGNUP_CODE= "companySignUpCode";//企业二维码
    public static final String APPENDIX_RESUME= "appendixResume";//学生附件简历
    public static final String LICENSE_COM= "licenseCom";//企业营业执照
    public static final String IMAGES_COM= "companyImages";//企业宣传图片
    public static final String KNOWLEDGE_LOGO= "knowledgeLogo";//职前课堂logo
    public static final String APP_CONFIG= "appConfig";//app apk文件
    public static final String COMPANY_VIDEO= "companyVideo";//企业视频
    public static final String RES_KNOWLEDGE= "knowledgeVideoBg";//职前课堂
    public static final String BANNER_IMAGE = "bannerImage";//banner
    public static final String GRADUATRS_SOURCE = "graduatesSource";//毕业生源





    /**
     * studentRecommend 的type类型
     */
    public static final String STUDENTRECOMMEND_TYPE_TEACHIN = "teachin";
    public static final String STUDENTRECOMMEND_TYPE_KNOWLEDGE = "knowledge";

    /**
     * 签到类型
     */
    public static final int UNDERS_PREACH_TYPE = 1;
    public static final int TEACHIN_TYPE = 2;

    /**
     * 双选会类型
     */
    public static final int UNDERS_TYPE_ONLINE = 1;
    public static final int UNDERS_TYPE_OFFLINE = 2;

    /**
     * 签到状态
     */
    public static final Integer SIGN_IN_YES = 1;
    public static final Integer SIGN_IN_NO = 0;

    /**
     * 用户隐私协议设备类型
     */
    public static final String APPAGREEMENT_TYPE_ANDROID = "android";
    public static final String APPAGREEMENT_TYPE_IOS = "ios";
    public static final String APPAGREEMENT_TYPE_WEB = "web";

    /**
     * 热门
     */
    public static final Integer HOT = 1;
    public static final Integer NOT_HOT = 0;

    /**
     * 城市1级
     */
    public static final Integer CITY_LEVEL_ONE = 1;

    /**
     * 评价体系
     */
    public static final Double INITIAL_SCORE = 500.0;
    public static final Integer  EVALUATE_YES = 1;
    public static final Integer  EVALUATE_NO = 0;
    public static final String COMPANY = "company";
    public static final String STUDENT = "student";


    /**
     * 父级类型
     */
    public static final Long PARENT = 0L;
    /**
     * 树形目录最高级
     */
    public static final int TREE_LEVEL = 3;

    /**
     * 发送群体 1为学校 2为学院
     */
    public static final Integer[] SEND_GROUP = {1,2};

    /**
     * 发送类型
     */
    public static final Integer SEND_TYPE = 0;

    /**
     * 常用消息模版企业
     */
    public static final String[] COMPANY_COMMON_WORKS = {"同学稍等，我看下你的简历。",
                                                         "恭喜同学，从你简历看很适合我司岗位。请问什么时间可参加线上面试呢？",
                                                         "抱歉同学，从你简历看你与我司岗位匹配度较低，祝你早日找到心仪工作。",
                                                         "抱歉，同学你未能通过我司面试，祝你早日找到心仪工作。",
                                                         "恭喜同学，你通过我司面试，我将尽快给你发放offer，请在规定时间内确认。"};

    /**
     * 常用消息模版学生
     */
    public static final String[] STUDENT_COMMON_WORKS = {"HR您好，我觉得自身条件符合职位要求，请问可以参加面试吗？",
                                                         "HR您好，请问这个职位主要承担哪些工作内容呢？",
                                                         "HR您好，我想了解贵公司福利是怎样的？能简单介绍一下吗？",
                                                         "HR您好，实习期间，公司会提供相应的培训吗？",
                                                         "HR您好，贵司在实习期间会有业绩或者绩效考核要求吗？"};



}
