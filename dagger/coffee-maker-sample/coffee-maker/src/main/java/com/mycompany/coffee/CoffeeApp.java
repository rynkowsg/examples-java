package com.mycompany.coffee;


public class CoffeeApp {
    public interface CoffeeShop {
        CoffeeMaker maker();
    }

    static class CoffeeShopInstance implements CoffeeShop {
        private static Heater heater = new ElectricHeater();
        private static Pump pump = new Thermosiphon(heater);
        private static CoffeeMaker maker = new CoffeeMaker(heater, pump);

        @Override
        public CoffeeMaker maker() {
            return maker;
        }
    }

    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShopInstance();
        coffeeShop.maker().on();
        coffeeShop.maker().brew();
        coffeeShop.maker().brew();
        coffeeShop.maker().off();
        coffeeShop.maker().brew();
        coffeeShop.maker().off();
    }
}
