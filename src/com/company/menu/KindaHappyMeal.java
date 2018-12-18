package com.company.menu;

public class KindaHappyMeal implements Meal {
    @Override
    public void getBurger() {
        System.out.println("A tiny burger");
    }

    @Override
    public void getDrinkSize() {
        System.out.println("A small soda");
    }

    @Override
    public void getSideDish() {
        System.out.println("A small fries");
    }
}