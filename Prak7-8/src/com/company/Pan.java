package com.company;

public class Pan  extends  Dish{
    int radius;
    int deep;
    double volume;

    public Pan(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
        calcVolume();
        makeBorsh();
    }

    @Override
    public void calcVolume() {
        volume =  radius* deep* 10;
    }

    public void makeBorsh(){
        System.out.println("Borsh svaren");
    }

    @Override
    public String toString() {
        return "Pan{" +
                "radius=" + radius +
                ", deep=" + deep +
                ", volume=" + volume +
                '}';
    }
}