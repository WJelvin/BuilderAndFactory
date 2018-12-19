package com.company.menu;

import com.company.mealparts.Burger;
import com.company.mealparts.SideDish;
import com.company.mealparts.Soda;

public class KindaHappyMeal implements Meal {
    @Override
    public Burger getBurger() {
        System.out.println("A tiny burger");
    }

    @Override
    public Soda getDrinkSize() {
        System.out.println("A small soda");
    }

    @Override
    public SideDish getSideDish() {
        System.out.println("A small fries");
    }
}