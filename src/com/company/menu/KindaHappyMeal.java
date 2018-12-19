package com.company.menu;

import com.company.mealparts.*;

public class KindaHappyMeal implements Meal {
    Burger burger = new TinyBurger();
    Soda soda = new SmallSoda();
    SideDish sideDish = new SmallFries();

    @Override
    public Burger getBurger() {
        return burger;
    }

    @Override
    public Soda getDrinkSize() {
        return soda;
    }

    @Override
    public SideDish getSideDish() {
        return sideDish;
    }
}