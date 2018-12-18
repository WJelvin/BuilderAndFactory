package com.company.menu;

public class WhupperMeal implements Meal {
    @Override
    public void getBurger() {
        System.out.println("A Whupper burger");
    }

    @Override
    public void getDrinkSize() {
        System.out.println("A large soda");
    }

    @Override
    public void getSideDish() {
        System.out.println("A large fries");
    }
}
