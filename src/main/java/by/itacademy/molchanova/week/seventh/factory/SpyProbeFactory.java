package by.itacademy.molchanova.week.seventh.factory;

import by.itacademy.molchanova.week.seventh.builder.SpyProbeBuilder;
import by.itacademy.molchanova.week.seventh.entity.Ship;

public class SpyProbeFactory implements ShipFactory {

    public Ship createShip() {
        return new SpyProbeBuilder().build();
    }
}
