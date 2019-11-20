package by.itacademy.molchanova.week.seventh.factory;

import by.itacademy.molchanova.week.seventh.builder.TransportBuilder;
import by.itacademy.molchanova.week.seventh.entity.Ship;

public class TransportFactory implements ShipFactory {

    public Ship createShip() {
        return new TransportBuilder().build();
    }
}
