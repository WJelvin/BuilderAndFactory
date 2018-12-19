package com.company;

import com.company.custommeal.CustomMealBuilder;
import com.company.mealparts.LargeFries;
import com.company.mealparts.LeafBurger;
import com.company.mealparts.SmallSoda;
import com.company.menu.Meal;
import com.company.menu.MealFactory;

public class Main {

    public static void main(String[] args) {

        MealFactory mealFactory = new MealFactory();
        CustomMealBuilder customMealBuilder = new CustomMealBuilder();

        Meal meal = mealFactory.getMeal("WHUPPER");
        Meal meal2 = customMealBuilder.setBurger(new LeafBurger())
                .setSideDish(new LargeFries())
                .setSoda(new SmallSoda()).packMeal();

        System.out.println(meal.getBurger());
        System.out.println(meal.getDrinkSize());
        System.out.println(meal.getSideDish());

        System.out.println();

        System.out.println(meal2.getBurger());
        System.out.println(meal2.getDrinkSize());
        System.out.println(meal2.getSideDish());

    }
}
