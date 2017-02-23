package main.java.demo.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import main.java.base.Page;

/**
 * Created by Administrator on 2016/12/5.
 * 首页
 */
public class FirstPage  extends Page {
    public FirstPage(AndroidDriver driver){super(driver);}


    /**页面元素*/

    //消息中心入口按钮
    public final String MESSAGE_CENTER_ID="com.creditwealth.client:id/home_message";

    public String getMESSAGE_CENTER_ID(){
        return MESSAGE_CENTER_ID;
    }


    //注册入口按钮
    public final String REGISTRATION_ID="com.creditwealth.client:id/home_share";
    public String getREGISTRATION_ID(){
        return REGISTRATION_ID;
    }


    //活动中心入口
    public final String ACTIVITY_CENTER_ID="com.creditwealth.client:id/bt_home_move";
    public String getACTIVITY_CENTER_ID(){
        return ACTIVITY_CENTER_ID;
    }

    //推荐奖励入口
    public final String RECOMMEND_REWARD_ID="com.creditwealth.client:id/bt_home_friends";
    public String getRECOMMEND_REWARD_ID(){
        return RECOMMEND_REWARD_ID;
    }
    //安全保障入口
    public final String SECURITY_ID="com.creditwealth.client:id/bt_home_safe";
    public String getSECURITY_ID(){
        return SECURITY_ID;
    }


    //理财产品入口
    public final String P2P_ID="com.creditwealth.client:id/rl_home_p2p";
    public String getP2P_ID(){
        return P2P_ID;
    }
    //保险产品入口
    public final String INSURANCE_PRODUCTION_ID="com.creditwealth.client:id/rl_home_fund";
    public String getINSURANCE_PRODUCTION_ID(){
        return INSURANCE_PRODUCTION_ID;
    }
    //基金产品入口
    public final String FUND_PRODUCTION_ID="com.creditwealth.client:id/rl_home_fund";
    public String getFUND_PRODUCTION_ID(){
        return FUND_PRODUCTION_ID;
    }


    //导航区
    //首页按钮
    public final String FIRST_PAGE_BUTTON_ID="com.creditwealth.client:id/tab_rb_1";
    public String getFIRST_PAGE_BUTTON_ID(){
        return FIRST_PAGE_BUTTON_ID;
    }
    //产品列表
    public final String PRODUCTION_LIST_ID="com.creditwealth.client:id/tab_rb_2";
    public String getPRODUCTION_LIST_ID(){
        return PRODUCTION_LIST_ID;
    }
    //我的财富
    public final String MY_TREASURE_ID="com.creditwealth.client:id/tab_rb_3";
    public AndroidElement getMY_TREASURE_ID(){
        return findById(MY_TREASURE_ID);
    }
    //理财圈
    public final String FINANCE_MANAGEMENT_ID="com.creditwealth.client:id/tab_rb_4";
    public String getFINANCE_MANAGEMENT_ID(){
        return FINANCE_MANAGEMENT_ID;
    }
    //更多
    public final String MORE_PAGE_ID="com.creditwealth.client:id/tab_rb_5";
    public String getMORE_PAGE_ID(){
        return MORE_PAGE_ID;
    }




    /**是否在首页*/
    public boolean isFirstPage(){
        return waitForLoadingActivity("MainFragmentActivity");

//        return isTextExist("今日推荐");
    }
    /**是否在产品列表页*/
    public boolean isProductionListPage(){
        return isTextExist("今日推荐");
    }
    /**是否在我的财富页*/
    /**是否在理财圈页*/
    /**是否在更多页*/
    /**是否在活动中心页*/
    public boolean isActivityCenter(){
        return isTextExist("活动中心");
    }
    /**是否在保险产品页*/
    public boolean isInsuranceListPage(){
        return isTextExist("七日年化收益");
    }
    /**是否在基金产品页*/
    public boolean isFundListPage(){
        return isTextExist("七日年化收益");
    }

    /**活动中心按钮是否存在*/
    public boolean isExistActivityCenter(){
        return isIdElementExist(this.getACTIVITY_CENTER_ID(),5);
    }
    /**活动中心按钮是否存在*/
    public boolean isExistRecommendReward(){
        return isIdElementExist(this.getRECOMMEND_REWARD_ID(),5);
    }
    /**活动中心按钮是否存在*/
    public boolean isExistSecurity(){
        return isIdElementExist(this.getSECURITY_ID(),5);
    }



    /**理财产品入口按钮是否存在*/
    public boolean isExsitP2P(){
        return isIdElementExist(this.getP2P_ID(),5);
    }
    /**基金入口按钮是否存在*/
    public boolean isExistFundProduction(){
        return isIdElementExist(this.getFUND_PRODUCTION_ID(),5);
    }
    /**保险入口按钮是否存在*/
    public boolean isExistInsuranceProduction(){
        return isIdElementExist(this.getINSURANCE_PRODUCTION_ID(),5);
    }









    // com.creditwealth.client:id/tv_home_product_name
    public final String TODAYRECOMMEND="tv_home_product_name";

    //




    /**页面元素*/

    public AndroidElement getTODAYRECOMMEND(){
        return findById(TODAYRECOMMEND);
    }



}
