package com.mycompany.coffee;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class DripCoffeeModule {
    @Provides @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }

    @Provides Pump providePump(Thermosiphon pump) {
        return pump;
    }
}
