package com.yxzapp.commons.constant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 快递公司枚举
 *
 * @author orange
 */
public enum ExpressTypeEnum {
    SF("SF", "顺丰速运"),
    HTKY("HTKY", "百世快递"),
    ZTO("ZTO", "中通快递"),
    STO("STO", "申通快递"),
    YTO("YTO", "圆通速递"),
    YD("YD", "韵达速递"),
    YZPY("YZPY", "邮政快递包裹"),
    EMS("EMS", "EMS"),
    HHTT("HHTT", "天天快递"),
    JD("JD", "京东快递"),
    UC("UC", "优速快递"),
    DBL("DBL", "德邦快递"),
    ZJS("ZJS", "宅急送"),
    TNT("TNT", "TNT快递"),
    UPS("UPS", "UPS"),
    DHL("DHL", "DHL"),
    FEDEX("FEDEX", "FEDEX联邦(国内件）"),
    FEDEX_GJ("FEDEX_GJ", "FEDEX联邦(国际件)"),
    AJ("AJ", "安捷快递"),
    ALKJWL("ALKJWL", "阿里跨境电商物流"),
    AX("AX", "安迅物流"),
    AYUS("AYUS", "安邮美国"),
    AMAZON("AMAZON", "亚马逊物流"),
    AOMENYZ("AOMENYZ", "澳门邮政"),
    ANE("ANE", "安能物流"),
    ADD("ADD", "澳多多"),
    AYCA("AYCA", "澳邮专线"),
    AXD("AXD", "安鲜达"),
    ANEKY("ANEKY", "安能快运"),
    BDT("BDT", "八达通  "),
    BETWL("BETWL", "百腾物流"),
    BJXKY("BJXKY", "北极星快运"),
    BNTWL("BNTWL", "奔腾物流"),
    BFDF("BFDF", "百福东方"),
    BHGJ("BHGJ", "贝海国际 "),
    BFAY("BFAY", "八方安运"),
    BTWL("BTWL", "百世快运"),
    CFWL("CFWL", "春风物流"),
    CHTWL("CHTWL", "诚通物流"),
    CXHY("CXHY", "传喜物流"),
    CITY100("CITY100", "城市100"),
    CJKD("CJKD", "城际快递"),
    CNPEX("CNPEX", "CNPEX中邮快递"),
    COE("COE", "COE东方快递"),
    CSCY("CSCY", "长沙创一"),
    CDSTKY("CDSTKY", "成都善途速运"),
    CTG("CTG", "联合运通"),
    CRAZY("CRAZY", "疯狂快递"),
    CBO("CBO", "CBO钏博物流"),
    CND("CND", "承诺达"),
    DSWL("DSWL", "D速物流"),
    DLG("DLG ", "到了港"),
    DTWL("DTWL", "大田物流"),
    DJKJWL("DJKJWL", "东骏快捷物流"),
    DEKUN("DEKUN", "德坤"),
    DBLKY("DBLKY", "德邦快运"),
    DML("DML", "大马鹿"),
    ETK("ETK", "E特快"),
    EWE("EWE", "EWE"),
    KFW("KFW", "快服务"),
    FKD("FKD", "飞康达"),
    FTD("FTD", "富腾达  "),
    FYKD("FYKD", "凡宇货的"),
    FASTGO("FASTGO", "速派快递"),
    FT("FT", "丰通快运"),
    GD("GD", "冠达   "),
    GDEMS("GDEMS", "广东邮政"),
    GSD("GSD", "共速达"),
    GTONG("GTONG", "广通"),
    GAI("GAI", "迦递快递"),
    GKSD("GKSD", "港快速递"),
    GTSD("GTSD", "高铁速递"),
    HFWL("HFWL", "汇丰物流"),
    HGLL("HGLL", "黑狗冷链"),
    HLWL("HLWL", "恒路物流"),
    HOAU("HOAU", "天地华宇"),
    HOTSCM("HOTSCM", "鸿桥供应链"),
    HPTEX("HPTEX", "海派通物流公司"),
    hq568("hq568", "华强物流"),
    HQSY("HQSY", "环球速运  "),
    HXLWL("HXLWL", "华夏龙物流"),
    HXWL("HXWL", "豪翔物流 "),
    HFHW("HFHW", "合肥汇文"),
    HLONGWL("HLONGWL", "辉隆物流"),
    HQKD("HQKD", "华企快递"),
    HRWL("HRWL", "韩润物流"),
    HTKD("HTKD", "青岛恒通快递"),
    HYH("HYH", "货运皇物流"),
    HYLSD("HYLSD", "好来运快递"),
    HJWL("HJWL", "皇家物流"),
    JAD("JAD", "捷安达  "),
    JGSD("JGSD", "京广速递"),
    JIUYE("JIUYE", "九曳供应链"),
    JXD("JXD", "急先达"),
    JYKD("JYKD", "晋越快递"),
    JYM("JYM", "加运美"),
    JGWL("JGWL", "景光物流"),
    JYWL("JYWL", "佳怡物流"),
    JDKY("JDKY", "京东快运"),
    CNEX("CNEX", "佳吉快运"),
    KYSY("KYSY", "跨越速运"),
    KSDWL("KSDWL", "快速递物流"),
    KBSY("KBSY", "快8速运"),
    LB("LB", "龙邦快递"),
    LJSKD("LJSKD", "立即送"),
    LHT("LHT", "联昊通速递"),
    MB("MB", "民邦快递"),
    MHKD("MHKD", "民航快递"),
    MK("MK", "美快    "),
    MDM("MDM", "门对门快递"),
    MRDY("MRDY", "迈隆递运"),
    MLWL("MLWL", "明亮物流"),
    NFCM("NFCM", "南方传媒物流"),
    NEDA("NEDA", "能达速递"),
    PADTF("PADTF", "平安达腾飞快递"),
    PANEX("PANEX", "泛捷快递"),
    PJ("PJ", "品骏快递"),
    PCA("PCA", "PCA Express"),
    QCKD("QCKD", "全晨快递"),
    QRT("QRT", "全日通快递"),
    QUICK("QUICK", "快客快递"),
    QXT("QXT", "全信通"),
    RQ("RQ", "荣庆物流"),
    QYZY("QYZY", "七曜中邮"),
    RFD("RFD", "如风达"),
    RRS("RRS", "日日顺物流"),
    RFEX("RFEX", "瑞丰速递"),
    SAD("SAD", "赛澳递"),
    SNWL("SNWL", "苏宁物流"),
    SAWL("SAWL", "圣安物流"),
    SBWL("SBWL", "晟邦物流"),
    SDWL("SDWL", "上大物流"),
    SFWL("SFWL", "盛丰物流"),
    ST("ST", "速通物流"),
    STWL("STWL", "速腾快递"),
    SUBIDA("SUBIDA", "速必达物流"),
    SDEZ("SDEZ", "速递e站"),
    SCZPDS("SCZPDS", "速呈宅配"),
    SURE("SURE", "速尔快递"),
    SS("SS", "闪送"),
    STKD("STKD", "盛通快递"),
    SX("SX", "顺心捷达"),
    TAIWANYZ("TAIWANYZ", "台湾邮政"),
    TSSTO("TSSTO", "唐山申通"),
    TJS("TJS", "特急送"),
    TYWL("TYWL", "通用物流"),
    TLWL("TLWL", "腾林物流"),
    UAPEX("UAPEX", "全一快递"),
    ULUCKEX("ULUCKEX", "优联吉运"),
    UEQ("UEQ", "UEQ Express"),
    WJK("WJK", "万家康  "),
    WJWL("WJWL", "万家物流"),
    WHTZX("WHTZX", "武汉同舟行"),
    WPE("WPE", "维普恩"),
    WXWL("WXWL", "万象物流"),
    WTP("WTP", "微特派"),
    WTWL("WTWL", "温通物流"),
    XCWL("XCWL", "迅驰物流  "),
    XFEX("XFEX", "信丰物流"),
    XYT("XYT", "希优特"),
    XJ("XJ", "新杰物流"),
    YADEX("YADEX", "源安达快递"),
    YCWL("YCWL", "远成物流"),
    YCSY("YCSY", "远成快运"),
    YDH("YDH", "义达国际物流"),
    YDT("YDT", "易达通  "),
    YFHEX("YFHEX", "原飞航物流"),
    YFSD("YFSD", "亚风快递"),
    YTKD("YTKD", "运通快递"),
    YXKD("YXKD", "亿翔快递"),
    YUNDX("YUNDX", "运东西网"),
    YMDD("YMDD", "壹米滴答"),
    YZBK("YZBK", "邮政国内标快"),
    YZTSY("YZTSY", "一站通速运"),
    YFSUYUN("YFSUYUN", "驭丰速运"),
    YSDF("YSDF", "余氏东风"),
    YF("YF", "耀飞快递"),
    YDKY("YDKY", "韵达快运"),
    YL("YL", "云路"),
    YZT("YZT", "一智通"),
    ZENY("ZENY", "增益快递"),
    ZHQKD("ZHQKD", "汇强快递"),
    ZTE("ZTE", "众通快递"),
    SJ("SJ", "郑州速捷"),
    ZTOKY("ZTOKY", "中通快运"),
    ZYKD("ZYKD", "中邮快递"),
    WM("WM", "中粮我买网"),
    ZMKM("ZMKM", "芝麻开门"),
    ZHWL("ZHWL", "中骅物流"),
    ZTWL("ZTWL", "中铁物流"),
    AAE("AAE", "AAE全球专递"),
    ACS("ACS", "ACS雅仕快递"),
    ADP("ADP", "ADP Express Tracking"),
    ANGUILAYOU("ANGUILAYOU", "安圭拉邮政"),
    APAC("APAC", "APAC"),
    ARAMEX("ARAMEX", "Aramex"),
    AT("AT", "奥地利邮政"),
    AUSTRALIA("AUSTRALIA", "Australia Post Tracking"),
    BEL("BEL", "比利时邮政"),
    BHT("BHT", "BHT快递"),
    BILUYOUZHE("BILUYOUZHE", "秘鲁邮政"),
    BR("BR", "巴西邮政"),
    BUDANYOUZH("BUDANYOUZH", "不丹邮政"),
    CDEK("CDEK", "CDEK"),
    CG("CG", "程光物流"),
    CA("CA", "加拿大邮政"),
    DBYWL("DBYWL", "递必易国际物流"),
    DDWL("DDWL", "大道物流"),
    DGYKD("DGYKD", "德国云快递"),
    DLGJ("DLGJ", "到乐国际"),
    DHL_DE("DHL_DE", "DHL德国"),
    DHL_EN("DHL_EN", "DHL(英文版)"),

    DHL_GLB("DHL_GLB", "DHL全球"),

    DHLGM("DHLGM", "DHL Global Mail"),

    DK("DK", "丹麦邮政"),

    DPD("DPD", "DPD"),

    DPEX("DPEX", "DPEX"),

    D4PX("D4PX", "递四方速递"),

    EMSGJ("EMSGJ", "EMS国际"),

    EKM("EKM", "易客满"),

    EPS("EPS", "EPS (联众国际快运)"),

    ESHIPPER("ESHIPPER", "EShipper"),

    FCWL("FCWL", "丰程物流"),

    FX("FX", "法翔速运"),

    FQ("FQ", "FQ"),

    FLYZ("FLYZ", "芬兰邮政"),

    FZGJ("FZGJ", "方舟国际速递"),

    GJEYB("GJEYB", "国际e邮宝"),

    GJYZ("GJYZ", "国际邮政包裹"),

    GE2D("GE2D", "GE2D"),

    GT("GT", "冠泰"),

    GLS("GLS", "GLS"),

    IOZYZ("IOZYZ", "欧洲专线(邮政)"),

    IADLYYZ("IADLYYZ", "澳大利亚邮政"),

    IAEBNYYZ("IAEBNYYZ", "阿尔巴尼亚邮政"),

    IAEJLYYZ("IAEJLYYZ", "阿尔及利亚邮政"),

    IAFHYZ("IAFHYZ", "阿富汗邮政"),

    IAGLYZ("IAGLYZ", "安哥拉邮政"),

    IAJYZ("IAJYZ", "埃及邮政"),

    IALBYZ("IALBYZ", "阿鲁巴邮政"),

    IALYYZ("IALYYZ", "阿联酋邮政"),

    IASBJYZ("IASBJYZ", "阿塞拜疆邮政"),

    IBCWNYZ("IBCWNYZ", "博茨瓦纳邮政"),

    IBDLGYZ("IBDLGYZ", "波多黎各邮政"),

    IBDYZ("IBDYZ", "冰岛邮政"),

    IBELSYZ("IBELSYZ", "白俄罗斯邮政"),

    IBHYZ("IBHYZ", "波黑邮政"),

    IBJLYYZ("IBJLYYZ", "保加利亚邮政"),

    IBJSTYZ("IBJSTYZ", "巴基斯坦邮政"),

    IBLNYZ("IBLNYZ", "黎巴嫩邮政"),

    IBOLYZ("IBOLYZ", "波兰邮政"),

    IBTD("IBTD", "宝通达"),

    IBYB("IBYB", "贝邮宝"),

    ICKY("ICKY", "出口易"),

    IDGYZ("IDGYZ", "德国邮政"),

    IWDMLYZ("IWDMLYZ", "危地马拉邮政"),

    IWGDYZ("IWGDYZ", "乌干达邮政"),

    IWKLEMS("IWKLEMS", "乌克兰EMS"),

    IWKLYZ("IWKLYZ", "乌克兰邮政"),

    IWLGYZ("IWLGYZ", "乌拉圭邮政"),

    ILKKD("ILKKD", "林克快递"),

    IWLYZ("IWLYZ", "文莱邮政"),

    IXGLDNYYZ("IXGLDNYYZ", "新喀里多尼亚邮政"),

    IE("IE", "爱尔兰邮政"),

    IXPWL("IXPWL", "夏浦物流"),

    IYDYZ("IYDYZ", "印度邮政"),

    IXPSJ("IXPSJ", "夏浦世纪"),

    IEGDEYZ("IEGDEYZ", "厄瓜多尔邮政"),

    IELSYZ("IELSYZ", "俄罗斯邮政"),

    IFTWL("IFTWL", "飞特物流"),

    IGDLPDYZ("IGDLPDYZ", "瓜德罗普岛邮政"),

    IGSDLJYZ("IGSDLJYZ", "哥斯达黎加邮政"),

    IHGYZ("IHGYZ", "韩国邮政"),

    IHHWL("IHHWL", "华翰物流"),

    IHLY("IHLY", "互联易"),

    IHSKSTYZ("IHSKSTYZ", "哈萨克斯坦邮政"),

    IHSYZ("IHSYZ", "黑山邮政"),

    IJBBWYZ("IJBBWYZ", "津巴布韦邮政"),

    IJEJSSTYZ("IJEJSSTYZ", "吉尔吉斯斯坦邮政"),

    IJKYZ("IJKYZ", "捷克邮政"),

    IJNYZ("IJNYZ", "加纳邮政"),

    IJPZYZ("IJPZYZ", "柬埔寨邮政"),

    IKNDYYZ("IKNDYYZ", "克罗地亚邮政"),

    IKNYYZ("IKNYYZ", "肯尼亚邮政"),

    IKTDWEMS("IKTDWEMS", "科特迪瓦EMS"),

    ILMNYYZ("ILMNYYZ", "罗马尼亚邮政"),

    IMEDWYZ("IMEDWYZ", "摩尔多瓦邮政"),

    IMETYZ("IMETYZ", "马耳他邮政"),

    INRLYYZ("INRLYYZ", "尼日利亚邮政"),

    ISEWYYZ("ISEWYYZ", "塞尔维亚邮政"),

    ISPLSYZ("ISPLSYZ", "塞浦路斯邮政"),

    IWZBKSTYZ("IWZBKSTYZ", "乌兹别克斯坦邮政"),

    IXBYYZ("IXBYYZ", "西班牙邮政"),

    IXJPEMS("IXJPEMS", "新加坡EMS"),

    IXLYZ("IXLYZ", "希腊邮政"),

    IXXLYZ("IXXLYZ", "新西兰邮政"),

    IYDLYZ("IYDLYZ", "意大利邮政"),

    IYGYZ("IYGYZ", "英国邮政"),

    IYMNYYZ("IYMNYYZ", "亚美尼亚邮政"),

    IYMYZ("IYMYZ", "也门邮政"),

    IZLYZ("IZLYZ", "智利邮政"),

    JP("JP", "日本邮政"),

    JFGJ("JFGJ", "今枫国际"),

    JGZY("JGZY", "极光转运"),

    JXYKD("JXYKD", "吉祥邮转运"),

    JLDT("JLDT", "嘉里国际"),

    JPKD("JPKD", "绝配国际速递"),

    SYJHE("SYJHE", "佳惠尔"),

    LYT("LYT", "联运通"),

    LHKDS("LHKDS", "联合快递"),

    SHLDHY("SHLDHY", "林道国际"),

    NL("NL", "荷兰邮政"),

    NSF("NSF", "新顺丰"),

    ONTRAC("ONTRAC", "ONTRAC"),

    OCS("OCS", "OCS"),

    QQYZ("QQYZ", "全球邮政"),

    POSTEIBE("POSTEIBE", "POSTEIBE"),

    PAPA("PAPA", "啪啪供应链"),

    QYHY("QYHY", "秦远海运"),

    VENUCIA("VENUCIA", "启辰国际"),

    RDSE("RDSE", "瑞典邮政"),

    SKYPOST("SKYPOST", "SKYPOST"),

    SWCH("SWCH", "瑞士邮政"),

    SDSY("SDSY", "首达速运"),

    SK("SK", "穗空物流"),

    STONG("STONG", "首通快运"),

    STO_INTL("STO_INTL", "申通快递国际单"),

    JYSD("JYSD", "上海久易国际"),

    TAILAND138("TAILAND138", "泰国138"),

    USPS("USPS", "USPS美国邮政"),

    UPU("UPU", "万国邮政"),

    VCTRANS("VCTRANS", "中越国际物流"),

    XKGJ("XKGJ", "星空国际"),

    XD("XD", "迅达国际"),

    XGYZ("XGYZ", "香港邮政"),

    XLKD("XLKD", "喜来快递"),

    XSRD("XSRD", "鑫世锐达"),

    XYGJ("XYGJ", "新元国际"),

    XYGJSD("XYGJSD", "ADLER雄鹰国际速递"),

    XYJ("XYJ", "西邮寄"),

    YAMA("YAMA", "日本大和运输(Yamato)"),

    YODEL("YODEL", "YODEL"),

    YHXGJSD("YHXGJSD", "一号线"),

    YUEDANYOUZ("YUEDANYOUZ", "约旦邮政"),

    YMSY("YMSY", "玥玛速运"),

    YYSD("YYSD", "鹰运"),

    YJD("YJD", "易境达"),

    YBG("YBG", "洋包裹"),

    YJ("YJ", "友家速递"),

    AOL("AOL", "AOL（澳通）"),

    BCWELT("BCWELT", "BCWELT   "),

    BN("BN", "笨鸟国际"),

    UBONEX("UBONEX", "优邦国际速运"),

    UEX("UEX", "UEX   "),

    YDGJ("YDGJ", "韵达国际"),

    ZY_AG("ZY_AG", "爱购转运"),

    ZY_AOZ("ZY_AOZ", "爱欧洲"),

    ZY_AUSE("ZY_AUSE", "澳世速递"),

    ZY_AXO("ZY_AXO", "AXO"),

    ZY_BH("ZY_BH", "贝海速递"),

    ZY_BEE("ZY_BEE", "蜜蜂速递"),

    ZY_BL("ZY_BL", "百利快递"),

    ZY_BM("ZY_BM", "斑马物流"),

    ZY_BT("ZY_BT", "百通物流"),

    ZY_CM("ZY_CM", "策马转运"),

    ZY_EFS("ZY_EFS", "EFS POST"),

    ZY_ESONG("ZY_ESONG", "宜送转运"),

    ZY_FD("ZY_FD", "飞碟快递"),

    ZY_FG("ZY_FG", "飞鸽快递"),

    ZY_FX("ZY_FX", "风行快递"),

    ZY_FXSD("ZY_FXSD", "风行速递"),

    ZY_FY("ZY_FY", "飞洋快递"),

    ZY_HC("ZY_HC", "皓晨快递"),

    ZY_HYSD("ZY_HYSD", "海悦速递"),

    ZY_JA("ZY_JA", "君安快递"),

    ZY_JD("ZY_JD", "时代转运"),

    ZY_JDKD("ZY_JDKD", "骏达快递"),

    ZY_JDZY("ZY_JDZY", "骏达转运"),

    ZY_JH("ZY_JH", "久禾快递"),

    ZY_JHT("ZY_JHT", "金海淘"),

    ZY_LBZY("ZY_LBZY", "联邦转运FedRoad"),

    ZY_LX("ZY_LX", "龙象快递"),

    ZY_MGZY("ZY_MGZY", "美国转运"),

    ZY_MST("ZY_MST", "美速通"),

    ZY_MXZY("ZY_MXZY", "美西转运"),

    ZY_QQEX("ZY_QQEX", "QQ-EX"),

    ZY_RT("ZY_RT", "瑞天快递"),

    ZY_RTSD("ZY_RTSD", "瑞天速递"),

    ZY_SDKD("ZY_SDKD", "速达快递"),

    ZY_SFZY("ZY_SFZY", "四方转运"),

    ZY_ST("ZY_ST", "上腾快递"),

    ZY_TJ("ZY_TJ", "天际快递"),

    ZY_TM("ZY_TM", "天马转运"),

    ZY_TN("ZY_TN", "滕牛快递"),

    ZY_TPY("ZY_TPY", "太平洋快递"),

    ZY_TSZ("ZY_TSZ", "唐三藏转运"),

    ZY_TWC("ZY_TWC", "TWC转运世界"),

    ZY_RDGJ("ZY_RDGJ", "润东国际快线"),

    ZY_TX("ZY_TX", "同心快递"),

    ZY_TY("ZY_TY", "天翼快递"),

    ZY_DGHT("ZY_DGHT", "德国海淘之家"),

    ZY_DYW("ZY_DYW", "德运网"),

    ZY_WDCS("ZY_WDCS", "文达国际DCS"),

    ZY_TZH("ZY_TZH", "同舟快递"),

    ZY_UCS("ZY_UCS", "UCS合众快递"),

    ZY_XC("ZY_XC", "星辰快递"),

    ZY_XF("ZY_XF", "先锋快递"),

    ZY_YQ("ZY_YQ", "云骑快递"),

    ZY_YSSD("ZY_YSSD", "优晟速递"),

    ZY_YTUSA("ZY_YTUSA", "运淘美国"),

    ZY_ZCSD("ZY_ZCSD", "至诚速递"),

    ZYZOOM("ZYZOOM", "增速海淘"),

    ZH("ZH", "中驰物流"),

    ZO("ZO", "中欧快运"),

    ZSKY("ZSKY", "准实快运"),

    ZWSY("ZWSY", "中外速运"),

    ZZJH("ZZJH", "郑州建华");

    private String type;
    private String name;

    private ExpressTypeEnum(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取枚举集合
     */
    public static List<Map<String, Object>> getListExpress() {
        List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
        for (ExpressTypeEnum type : ExpressTypeEnum.values()) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("type", type.getType());
            map.put("name", type.getName());
            mapList.add(map);
        }
        return mapList;
    }

}