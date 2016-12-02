package main.java.demo.operation;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import main.java.demo.base.OperateAppium;
import main.java.demo.pages.Gesture;

/**
 * Created by Administrator on 2016/11/29.
 */
public class GestureOperation extends OperateAppium {

    private Gesture gesture;
    AndroidDriver driver;
    public GestureOperation(AndroidDriver driver){
        super(driver);
        gesture = new Gesture(driver);
        this.driver = driver;

    }

    /** 页面验证 */
    public boolean isTisPage(){
        return gesture.isThisPage();
    }



    /** * 手势解锁 * */
    // 四个点
    public void gestureUnlock(int fir,int sec,int thir, int forth){
        Point p=new Point(driver);
        TouchAction gesture = new TouchAction(driver).press(p.getPoint(fir).getX(), p.getPoint(fir).gety()).waitAction(100)
                .moveTo(p.getPoint(sec).getX()-p.getPoint(fir).getX(), p.getPoint(sec).gety()-p.getPoint(fir).gety()).waitAction(100)
                .moveTo(p.getPoint(thir).getX()-p.getPoint(sec).getX(), p.getPoint(thir).gety()-p.getPoint(sec).gety()).waitAction(100)
                .moveTo(p.getPoint(forth).getX()-p.getPoint(thir).getX(), p.getPoint(forth).gety()-p.getPoint(thir).gety()).waitAction(100).release();
        gesture.perform();

    }
    //五个点
    public void gestureUnlock(int fir,int sec,int thir, int forth,int fif){
        Point p=new Point(driver);
        TouchAction gesture = new TouchAction(driver).press(p.getPoint(fir).getX(), p.getPoint(fir).gety()).waitAction(100)
                .moveTo(p.getPoint(sec).getX()-p.getPoint(fir).getX(), p.getPoint(sec).gety()-p.getPoint(fir).gety()).waitAction(100)
                .moveTo(p.getPoint(thir).getX()-p.getPoint(sec).getX(), p.getPoint(thir).gety()-p.getPoint(sec).gety()).waitAction(100)
                .moveTo(p.getPoint(forth).getX()-p.getPoint(thir).getX(), p.getPoint(forth).gety()-p.getPoint(thir).gety()).waitAction(100)
                .moveTo(p.getPoint(fif).getX()-p.getPoint(forth).getX(), p.getPoint(fif).gety()-p.getPoint(forth).gety()).waitAction(200)
                .release();
        gesture.perform();

    }
    public void gestureUnlock(int fir,int sec,int thir, int forth,int fif,int six){
        Point p=new Point(driver);
        TouchAction gesture = new TouchAction(driver).press(p.getPoint(fir).getX(), p.getPoint(fir).gety()).waitAction(100)
                .moveTo(p.getPoint(sec).getX()-p.getPoint(fir).getX(), p.getPoint(sec).gety()-p.getPoint(fir).gety()).waitAction(100)
                .moveTo(p.getPoint(thir).getX()-p.getPoint(sec).getX(), p.getPoint(thir).gety()-p.getPoint(sec).gety()).waitAction(100)
                .moveTo(p.getPoint(forth).getX()-p.getPoint(thir).getX(), p.getPoint(forth).gety()-p.getPoint(thir).gety()).waitAction(100)
                .moveTo(p.getPoint(fif).getX()-p.getPoint(forth).getX(), p.getPoint(fif).gety()-p.getPoint(forth).gety()).waitAction(100)
                .moveTo(p.getPoint(six).getX()-p.getPoint(fif).getX(), p.getPoint(six).gety()-p.getPoint(fif).gety()).waitAction(100)
                .release();
        gesture.perform();

    }





}

/** 手势验证 点 类 */
class Point extends OperateAppium{

    AndroidDriver driver;

    public Point(AndroidDriver driver){
        super(driver);
        this.driver = driver;

    }

    public int x=0;
    public int y=0;


    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public int getX(){
        return  this.x;
    }
    public int gety(){
        return this.y;
    }


    /**
     * 根据点的位置获取坐标
     *    9个点的位置
     *    1   2   3
     *    4   5   6
     *    7   8   9
     * */
    public   Point getPoint(int pointNo) {

        int w=0;
        int h=0;
        OperateAppium oa=new OperateAppium(driver);
        Point point =new Point(driver);
        w = oa.getScreenWidth();
        h = oa.getScreenHeight();
        int x = 0;
        int y = 0;


        if (w > h) {
            x =h/2;
            y=w/2;
        }
        // 横屏
        else {
            x=w/2;
            y=h/2;
        }

        if(pointNo==1){
            point.setX((int) (0.5*x));
            point.setY((int)(y-0.5*x+x*1/9));
        }else if(2==pointNo){
            point.setX(x);
            point.setY((int)(y-0.5*x+x*1/9));
        }else if(3==pointNo){
            point.setX((int) (1.5*x));
            point.setY((int)(y-0.5*x+x*1/9));
        }else if(4==pointNo){
            point.setX((int) (0.5*x));
            point.setY((int)(y+x*1/9));
        }else if(5==pointNo){
            point.setX(x);
            point.setY((int)(y+x*1/9));
        }else if(6==pointNo){
            point.setX((int) (1.5*x));
            point.setY((int)(y+x*1/9));
        }else if(7==pointNo){
            point.setX((int) (0.5*x));
            point.setY((int)(y+0.5*x+x*1/9));
        }else if(8==pointNo){
            point.setX(x);
            point.setY((int)(y+0.5*x+x*1/9));
        }else if(9==pointNo){
            point.setX((int) (1.5*x));
            point.setY((int)(y+0.5*x+x*1/9));
        }

        return point;
    }

}
