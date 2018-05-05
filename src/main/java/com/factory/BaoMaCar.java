package com.factory;

/**
 * Created by Administrator on 2018/5/6.
 */
public class BaoMaCar extends  AbstractCar {

    public  BaoMaCar(){}

    public  BaoMaCar(String name,String color){
        super.setColor(color);
        super.setName(name);
    }

    @Override
    public String getName() {
        return "宝马";
    }
}
