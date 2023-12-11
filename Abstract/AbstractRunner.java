package com.xworkz.Abstract;

public class AbstractRunner {
	public static void main(String[] args) {
       System.out.println("Starting main in Abstract Runner");
       Car car=new AbstractCar();
       car.purchaseCar();
       car.run();
       
       BulletTrain bt=new AbstractBulletTrain();
       bt.constructing();
       bt.passenger();
       
       PurchaseLand pl=new AbstractLand();
       pl.buying();
       pl.finding();
       
       Seaway sea=new AbstractSeaWay();
       sea.constructing();
       sea.implement();
       
       Travelling travel=new AbstactTravelling();
       travel.implement();
       travel.planning();
       
       System.out.println("ending main in Abstract Runner");
       
       
       

}
}