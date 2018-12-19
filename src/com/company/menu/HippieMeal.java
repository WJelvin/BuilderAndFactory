package com.company.menu;

import com.company.mealparts.*;

public class HippieMeal implements Meal {

    Burger burger = new LeafBurger();
    Soda soda = new MediumSoda();
    SideDish sideDish = new VeggieCookie();

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
