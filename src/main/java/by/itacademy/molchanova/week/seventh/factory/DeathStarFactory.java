package by.itacademy.molchanova.week.seventh.factory;

import by.itacademy.molchanova.week.seventh.builder.DeathStarBuilder;
import by.itacademy.molchanova.week.seventh.entity.Ship;

public class DeathStarFactory implements ShipFactory {

    public Ship createShip() {
        return new DeathStarBuilder().build();
    }

}
