package com.xworkz.examples;

public class Runner {
    public static void main(String[] args) {
        Basket basket=new Basket("mango", 2, 200);
        System.out.println(basket);

        System.out.println("============================");

        Bowl bowl=new Bowl("plastic","red",10);
        System.out.println(bowl);

        System.out.println("=============================");

        Bucket bucket=new Bucket(10,7,"plastic");
        System.out.println(bucket);

        System.out.println("========================");

        Chain chain=new Chain("silver",25,false);
        System.out.println(chain);

        System.out.println("===============================");

        Cotton cotton=new Cotton("white",6.7,true);
        System.out.println(cotton);

        System.out.println("===================================");

        Geyser geyser=new Geyser("lg",8.5,true);
        System.out.println(geyser);
        System.out.println("======================================");


        Heart heart=new Heart(72,"10",true);
        System.out.println(heart);
        System.out.println("=================================");


        Lens lens=new Lens("fiber",20,15);
        System.out.println(lens);
        System.out.println("==================================");


        Locker lock=new Locker(2,"A21",true);
        System.out.println(lock);
        System.out.println("========================");

        Mic mic=new Mic("samsung","samsung21s",100.5);
        System.out.println(mic);
        System.out.println("================================");



        Money money=new Money("10",80.7,"credit");
        System.out.println(money);
        System.out.println("=========================");

        Rice rice=new Rice("bullet",25,60.5);
        System.out.println(rice);
        System.out.println("=============================");

        Seed seed=new Seed("kiwi","fruit",1);
        System.out.println(seed);
        System.out.println("=======================");



        Spoon spoon=new Spoon("steel",5,"grey");
        System.out.println(spoon);
        System.out.println("============================");


        Bandli bandli=new Bandli(10,"steel","grey");
        System.out.println(bandli);




    }
}

