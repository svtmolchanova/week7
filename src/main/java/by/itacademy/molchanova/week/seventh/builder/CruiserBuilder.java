package by.itacademy.molchanova.week.seventh.builder;

import by.itacademy.molchanova.week.seventh.entity.Cruiser;

public class CruiserBuilder extends Builder {

    private Cruiser cruiser;

    public CruiserBuilder() {
        this.cruiser = new Cruiser();
    }

    public CruiserBuilder withAmountGuns(Integer amountGuns) {
        this.cruiser.setAmountGuns(amountGuns);
        return this;
    }

    public CruiserBuilder withFirePower(Integer firePower) {
        this.cruiser.setFirePower(firePower);
        return this;
    }

    public Cruiser build() {
        return this.cruiser;
    }

}
