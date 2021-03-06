package com.mycompany.coffee;

class CoffeeMaker {
    private final Heater heater;
    private final Pump pump;

    CoffeeMaker(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void on() {
        if (!heater.isHot())
            heater.on();
    }

    public void brew() {
        if (pump.pump())
            System.out.println(" [_]P coffee! [_]P ");
    }

    public void off() {
        if (heater.isHot())
            heater.off();
    }
}
