package com.company.menu;

import com.company.mealparts.Burger;
import com.company.mealparts.SideDish;
import com.company.mealparts.Soda;

public interface Meal {

    Burger getBurger();

    Soda getDrinkSize();

    SideDish getSideDish();

}
