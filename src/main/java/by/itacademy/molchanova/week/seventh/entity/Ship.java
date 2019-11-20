package by.itacademy.molchanova.week.seventh.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Cruiser.class, name = "cruiser"),
        @JsonSubTypes.Type(value = DeathStar.class, name = "deathStar"),
        @JsonSubTypes.Type(value = Destroyer.class, name = "destroyer"),
        @JsonSubTypes.Type(value = SpyProbe.class, name = "spyProbe"),
        @JsonSubTypes.Type(value = Transport.class, name = "transport")
})
public class Ship {

    protected Integer fuel;
    protected FuelType fuelType;
    protected String name;
    protected Integer armor;

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }
}
