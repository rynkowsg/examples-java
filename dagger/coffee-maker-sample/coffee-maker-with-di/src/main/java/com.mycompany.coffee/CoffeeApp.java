package com.mycompany.coffee;

import dagger.Component;

import javax.inject.Singleton;

public class CoffeeApp {
    @Singleton
    @Component(modules = { DripCoffeeModule.class })
    public interface CoffeeShop {
        CoffeeMaker maker();
    }

    public static void main(String[] args) {
        CoffeeShop coffeeShop = DaggerCoffeeApp_CoffeeShop.builder()
                .dripCoffeeModule(new DripCoffeeModule())
                .build();
        coffeeShop.maker().on();
        coffeeShop.maker().brew();
        coffeeShop.maker().brew();
        coffeeShop.maker().off();
        coffeeShop.maker().brew();
        coffeeShop.maker().off();
    }
}
