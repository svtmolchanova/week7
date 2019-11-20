package by.itacademy.molchanova.week.seventh.builder;

import by.itacademy.molchanova.week.seventh.entity.FuelType;
import by.itacademy.molchanova.week.seventh.entity.Ship;

public abstract class Builder {

    private Ship ship;

    public Builder() {
        this.ship = new Ship();
    }

    public Builder withFuel(Integer fuel) {
        this.ship.setFuel(fuel);
        return this;
    }

    public Builder withFuelType(FuelType fuelType) {
        this.ship.setFuelType(fuelType);
        return this;
    }

    public Builder withName(String name) {
        this.ship.setName(name);
        return this;
    }

    public Builder withArmor(Integer armor) {
        this.ship.setArmor(armor);
        return this;
    }

    public Ship build() {
        return this.ship;
    }
}
