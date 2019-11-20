package by.itacademy.molchanova.week.seventh.factory;

import by.itacademy.molchanova.week.seventh.entity.Ship;
import org.springframework.stereotype.Component;

@Component
public interface ShipFactory {

    Ship createShip();

}
