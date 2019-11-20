package by.itacademy.molchanova.week.seventh.factory;

import by.itacademy.molchanova.week.seventh.builder.DestroyerBuilder;
import by.itacademy.molchanova.week.seventh.entity.Ship;

public class DestroyerFactory implements ShipFactory {

    public Ship createShip() {
        return new DestroyerBuilder().build();
    }
}
