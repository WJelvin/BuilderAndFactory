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

        Meal whupperMeal = mealFactory.getMeal("WHUPPER");
        Meal kindaHappyMeal = mealFactory.getMeal("KINDAHAPPY");
        Meal customMeal = customMealBuilder.setBurger(new LeafBurger())
                .setSideDish(new LargeFries())
                .setSoda(new SmallSoda()).packMeal();


        System.out.println(whupperMeal.getBurger());
        System.out.println(whupperMeal.getDrinkSize());
        System.out.println(whupperMeal.getSideDish());

        System.out.println();

        System.out.println(kindaHappyMeal.getBurger());
        System.out.println(kindaHappyMeal.getDrinkSize());
        System.out.println(kindaHappyMeal.getSideDish());

        System.out.println();

        System.out.println(customMeal.getBurger());
        System.out.println(customMeal.getDrinkSize());
        System.out.println(customMeal.getSideDish());

    }
}
