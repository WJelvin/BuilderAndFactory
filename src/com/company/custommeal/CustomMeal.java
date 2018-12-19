package com.company.custommeal;

import com.company.mealparts.*;
import com.company.menu.Meal;

public class CustomMeal implements Meal {

    Burger burger;
    Soda soda;
    SideDish sideDish;

    public CustomMeal(Burger burger, Soda soda, SideDish sideDish) {
        this.burger = burger;
        this.soda = soda;
        this.sideDish = sideDish;
    }

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
