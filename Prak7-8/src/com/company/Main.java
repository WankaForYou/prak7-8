package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Plate plate = new Plate(1,10);
        Pan pan = new Pan(20,100);
        Wineglass wineglass = new Wineglass(10, 10);

        ArrayList<Dish> allDishes = new ArrayList<>();
        allDishes.add(plate);
        allDishes.add(pan);
        allDishes.add(wineglass);
        for (Dish type : allDishes)
        {
            System.out.println(type);
        }

    }
}
