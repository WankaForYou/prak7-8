package com.company;

public class Wineglass extends  Dish{
    int radius;
    int deep;
    double volume;

    public Wineglass(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
        calcVolume();
    }

    @Override
    void calcVolume() {
        volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Wineglass{" +
                "radius=" + radius +
                ", deep=" + deep +
                ", volume=" + volume +
                '}';
    }
}
