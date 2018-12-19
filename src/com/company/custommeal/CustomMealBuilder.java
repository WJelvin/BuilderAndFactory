package com.company.custommeal;

import com.company.mealparts.Burger;
import com.company.mealparts.SideDish;
import com.company.mealparts.Soda;
import com.company.menu.Meal;

public class CustomMealBuilder {

    private Burger burger;
    private Soda soda;
    private SideDish sideDish;

    public CustomMealBuilder() {

    }

    public CustomMealBuilder setBurger(Burger burger) {
        this.burger = burger;
        return this;
    }

    public CustomMealBuilder setSoda(Soda soda) {
        this.soda = soda;
        return this;
    }

    public CustomMealBuilder setSideDish(SideDish sideDish) {
        this.sideDish = sideDish;
        return this;
    }

    public Meal packMeal() {
        return new CustomMeal(burger, soda, sideDish);
    }
}
