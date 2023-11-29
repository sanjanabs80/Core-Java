package com.xworkz.examples;

public class Bucket {

    int capacity;
    int currentVolume;
    String material;

    Bucket(int capacity, int currentVolume, String material) {
        this.capacity = capacity;
        this.currentVolume = currentVolume;
        this.material = material;
        System.out.println("running bucket");

    }
@Override
    public String toString() {
        return "capacity:-" + capacity + "," + "currentVolume:-" + currentVolume + "," + "material:-" + material;
    }

}
