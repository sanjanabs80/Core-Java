package com.xworkz.examples;

public class Lens {
    String material;
    double focalLength;
    double aperture;

    Lens(String material,double focalLength,double aperture){
        this.material=material;
        this.focalLength=focalLength;
        this.aperture=aperture;
        System.out.println("running lens");
    }
    @Override
    public String toString()
    {
        return "material:-"+material+","+ "focallength:-"+ focalLength+","+"aperture:-"+aperture;
    }
     
}
