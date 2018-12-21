package com.company;

import com.company.custommeal.CustomMealBuilder;
import com.company.mealparts.*;
import com.company.menu.Meal;
import com.company.menu.MealFactory;

public class Main {

    public static void main(String[] args) {

        MealFactory mealFactory = new MealFactory();
        CustomMealBuilder customMealBuilder = new CustomMealBuilder();

        //Factory för att servera färdiga Meals
        Meal whupperMeal = mealFactory.getMeal("WHUPPER");
        Meal kindaHappyMeal = mealFactory.getMeal("KINDAHAPPY");

        //Builder för att bygga specialbeställa Meals
        Meal customMeal = customMealBuilder.setBurger(new LeafBurger())
                .setSideDish(new LargeFries())
                .setSoda(new SmallSoda()).packMeal();

        Meal customMeal2 = customMealBuilder.setBurger(new TinyBurger())
                .setSideDish(new VeggieCookie())
                .setSoda(new SmallSoda()).packMeal();

        System.out.println("En beställning av en Whupper-meal innehåller:");
        System.out.println(whupperMeal.getBurger());
        System.out.println(whupperMeal.getDrinkSize());
        System.out.println(whupperMeal.getSideDish());

        System.out.println();

        System.out.println("En beställning av en KindaHappy-meal innehåller:");
        System.out.println(kindaHappyMeal.getBurger());
        System.out.println(kindaHappyMeal.getDrinkSize());
        System.out.println(kindaHappyMeal.getSideDish());

        System.out.println();

        System.out.println("En specialbeställd meny som innehåller:");
        System.out.println(customMeal.getBurger());
        System.out.println(customMeal.getDrinkSize());
        System.out.println(customMeal.getSideDish());

        System.out.println();

        System.out.println("En specialbeställd meny som innehåller:");
        System.out.println(customMeal2.getBurger());
        System.out.println(customMeal2.getDrinkSize());
        System.out.println(customMeal2.getSideDish());

    }
}
