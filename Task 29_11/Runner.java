package com.xworkz.examples;

public class Runner {
    public static void main(String[] args) {
        Basket basket=new Basket("mango", 2, 200);
        System.out.println(basket);
        Basket basket1=new Basket("apple", 3, 100);
        System.out.println(basket1);

        System.out.println("============================");

        Bowl bowl=new Bowl("plastic","red",10);
        System.out.println(bowl);
        Bowl bowl1=new Bowl("fiber","blue",20);
        System.out.println(bowl1);

        System.out.println("=============================");

        Bucket bucket=new Bucket(10,7,"plastic");
        System.out.println(bucket);
        Bucket bucket1=new Bucket(20,8,"steel");
        System.out.println(bucket1);

        System.out.println("========================");

        Chain chain=new Chain("silver",25,false);
        System.out.println(chain);
        Chain chain1=new Chain("gold",20,true);
        System.out.println(chain1);

        System.out.println("===============================");

        Cotton cotton=new Cotton("white",6.7,true);
        System.out.println(cotton);
        Cotton cotton1=new Cotton("black",5.2,false);
        System.out.println(cotton1);

        System.out.println("===================================");

        Geyser geyser=new Geyser("lg",8.5,true);
        System.out.println(geyser);

        Geyser geyser1=new Geyser("samsung",9,true);
        System.out.println(geyser1);
        System.out.println("======================================");


        Heart heart=new Heart(72,"10",true);
        System.out.println(heart);
        Heart heart1=new Heart(76,"20",false);
        System.out.println(heart1);
        System.out.println("=================================");


        Lens lens=new Lens("fiber",20,15);
        System.out.println(lens);
        Lens lens1=new Lens("plastic",10,25);
        System.out.println(lens1);
        System.out.println("==================================");


        Locker lock=new Locker(2,"A21",true);
        System.out.println(lock);
        Locker lock1=new Locker(4,"B21",false);
        System.out.println(lock1);
        System.out.println("========================");

        Mic mic=new Mic("samsung","samsung21s",100.5);
        System.out.println(mic);
        Mic mic1=new Mic("lg","lg1",10.5);
        System.out.println(mic1);
        System.out.println("================================");



        Money money=new Money("10",80.7,"credit");
        System.out.println(money);
        Money money1=new Money("20",70.7,"debit");
        System.out.println(money1);
        System.out.println("=========================");

        Rice rice=new Rice("bullet",25,60.5);
        System.out.println(rice);
        Rice rice1=new Rice("jeera",24,50.5);
        System.out.println(rice1);
        System.out.println("=============================");

        Seed seed=new Seed("kiwi","fruit",1);
        System.out.println(seed);
        Seed seed1=new Seed("papaya","fruit",2);
        System.out.println(seed1);
        System.out.println("=======================");



        Spoon spoon=new Spoon("steel",5,"grey");
        System.out.println(spoon);
        Spoon spoon1=new Spoon("plastic",5,"white");
        System.out.println(spoon1);
        System.out.println("============================");


        Bandli bandli=new Bandli(10,"steel","grey");
        System.out.println(bandli);
        Bandli bandli1=new Bandli(20,"nonstick","red");
        System.out.println(bandli1);




    }
}

