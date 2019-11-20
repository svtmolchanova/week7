package by.itacademy.molchanova.week.seventh.builder;

import by.itacademy.molchanova.week.seventh.entity.DeathStar;

public class DeathStarBuilder extends Builder {

    private DeathStar deathStar;

    public DeathStarBuilder() {
        this.deathStar = new DeathStar();
    }

    public DeathStarBuilder withFirePower(Integer firePower) {
        this.deathStar.setFirePower(firePower);
        return this;
    }

    public DeathStarBuilder withMaxDestroyerCapacity(Integer maxDestroyerCapacity) {
        this.deathStar.setMaxDestroyerCapacity(maxDestroyerCapacity);
        return this;
    }

    public DeathStar build() {
        return this.deathStar;
    }
}
