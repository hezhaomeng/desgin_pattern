package com.factory;

/**
 * Created by Administrator on 2018/5/6.
 */
public abstract class AbstractCar {

    private  String name;
    private  String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
