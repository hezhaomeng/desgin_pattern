package com.factory;

/**
 * Created by Administrator on 2018/5/6.
 */
public class BenChiCar extends  AbstractCar{

    public  BenChiCar(){}

    public  BenChiCar(String name,String color){
        super.setName(name);
        super.setColor(color);
    }

    @Override
    public String getName() {
        return "奔驰";
    }
}
