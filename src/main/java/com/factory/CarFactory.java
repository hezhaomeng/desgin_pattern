package com.factory;

/**
 * Created by Administrator on 2018/5/6.
 */
public class CarFactory {


    public  AbstractCar getBaoMa(){
        return  new BaoMaCar();
    }

    public  AbstractCar getBaoMar(String name,String color){
        return new BaoMaCar(name,color);
    }

    public  AbstractCar getBenChi(){
        return  new BenChiCar();
    }



    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        AbstractCar baoMa = carFactory.getBaoMa();
        AbstractCar benChi = carFactory.getBenChi();
        System.out.println(baoMa.getName());
        System.out.println(benChi.getName());
    }

}
