package com.company;

import com.company.menu.Meal;
import com.company.menu.MealFactory;

public class Main {

    public static void main(String[] args) {

        MealFactory mealFactory = new MealFactory();

        Meal meal = mealFactory.getMeal("WHUPPER");
        Meal meal2 = mealFactory.getMeal("HIPPIE");

        System.out.println(meal.getBurger());
        System.out.println(meal.getDrinkSize());
        System.out.println(meal.getSideDish());

        System.out.println();

        System.out.println(meal2.getBurger());
        System.out.println(meal2.getDrinkSize());
        System.out.println(meal2.getSideDish());

    }
}
