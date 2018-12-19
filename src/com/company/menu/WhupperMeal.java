package com.company.menu;

import com.company.mealparts.*;

public class WhupperMeal implements Meal {

    Burger burger = new WhupperBurger();
    Soda soda = new LargeSoda();
    SideDish sideDish = new LargeFries();

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
