package by.itacademy.molchanova.week.seventh.builder;

import by.itacademy.molchanova.week.seventh.entity.Destroyer;

public class DestroyerBuilder extends Builder {

    private Destroyer destroyer;

    public DestroyerBuilder() {
        this.destroyer = new Destroyer();
    }

    public DestroyerBuilder withFirePower(Integer firePower) {
        this.destroyer.setFirePower(firePower);
        return this;
    }

    public DestroyerBuilder withSpeed(Integer speed) {
        this.destroyer.setSpeed(speed);
        return this;
    }

    public Destroyer build() {
        return this.destroyer;
    }
}
