package com.company.menu;

public class MealFactory {

    public Meal getMeal(String meal){
        if(meal == null){
            return null;
        }
        if(meal.equalsIgnoreCase("HIPPIE")){
            return new HippieMeal();

        } else if(meal.equalsIgnoreCase("KINDAHAPPY")){
            return new KindaHappyMeal();

        } else if(meal.equalsIgnoreCase("WHUPPER")){
            return new WhupperMeal();
        }
        return null;
    }

}
