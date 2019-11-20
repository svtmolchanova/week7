package by.itacademy.molchanova.week.seventh.factory;

import by.itacademy.molchanova.week.seventh.builder.CruiserBuilder;
import by.itacademy.molchanova.week.seventh.entity.Ship;

public class CruiserFactory implements ShipFactory {

    public Ship createShip() {
        return new CruiserBuilder().build();
    }
}
