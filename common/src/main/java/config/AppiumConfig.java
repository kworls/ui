package main.java.config;

/**
 * Created by Administrator on 2016/11/22.
 */
public class AppiumConfig{

    public String CURRENT_BANK;
    public String DEVICE_NAME;
    public String APPIUM_PORT;
    public String PLANTFORM_VERSION;


    public static AppiumConfig custom(){

        return new AppiumConfig();
    }

    private AppiumConfig(){}


    public void setCURRENT_BANK(String CURRENT_BANK ){
        this.CURRENT_BANK=CURRENT_BANK;
    }
    public String getCURRENT_BANK(){
        return this.CURRENT_BANK;
    }

    public void setDEVICE_NAME(String DEVICE_NAME ){
        this.DEVICE_NAME=DEVICE_NAME;
    }
    public String getDEVICE_NAME(){
        return this.DEVICE_NAME;
    }

    public void setAPPIUM_PORT(String APPIUM_PORT ){
        this.APPIUM_PORT=APPIUM_PORT;
    }
    public String getAPPIUM_PORT(){
        return this.APPIUM_PORT;
    }

    public void setPLANTFORM_VERSION(String PLANTFORM_VERSION ){
        this.PLANTFORM_VERSION=PLANTFORM_VERSION;
    }
    public String getPLANTFORM_VERSION(){
        return this.PLANTFORM_VERSION;
    }



}
