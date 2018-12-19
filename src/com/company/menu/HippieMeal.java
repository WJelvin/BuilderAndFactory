package com.company.menu;

public class HippieMeal implements Meal {
    @Override
    public void getBurger() {
        return;
    }

    @Override
    public void getDrinkSize() {
        System.out.println("A medium applejuice");
    }

    @Override
    public void getSideDish() {
        System.out.println("A veggie cookie that looks like a dream catcher");
    }
}
