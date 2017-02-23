package main.java.demo.operation;

import io.appium.java_client.android.AndroidDriver;
import main.java.base.Operation;
import main.java.demo.pages.FirstPage;

/**
 * Created by Administrator on 2016/12/5.
 */
public class FirstPageOperation extends Operation {
     AndroidDriver driver;
    private FirstPage firstpage;

    public FirstPageOperation(AndroidDriver driver){
        super(driver);
        firstpage = new FirstPage(driver);
        this.driver=driver;
    }

    public String getTODAYRECOMMENDText(){
        return firstpage.getTODAYRECOMMEND().getText();
    }
    /**
     * 验证首页
     **/
    public boolean verifyFirstPage(){

        return firstpage.isFirstPage();
    }

    /**
     * 验证活动中心按钮文案
     * */
    public  boolean verifyTextActivityCenter(){
        if(firstpage.isActivityCenter()){
            if(firstpage.findById(firstpage.getACTIVITY_CENTER_ID()).getText().equals("活动中心")){
                return  true;
            }
        }else {
            System.out.println("ActivityCenter is not exist!");
        }
        return false;
    }
    /**
     * 验证活动中心按钮文案
     * */
    public  boolean verifyTextRecommendReward(){
        if(firstpage.isExistRecommendReward()){
            if(firstpage.findById(firstpage.getRECOMMEND_REWARD_ID()).getText().equals("推荐送奖金")){
                return  true;
            }
        }else {
            System.out.println("RecommendReward is not exist!");
        }
        return false;
    }
    /**
     * 验证活动中心按钮文案
     * */
    public  boolean verifyTextInsurance(){
        if(firstpage.isExistSecurity()){
            if(firstpage.findById(firstpage.getSECURITY_ID()).getText().equals("安全保障")){
                return  true;
            }
        }else {
            System.out.println("Security is not exist!");
        }
        return false;
    }


}
