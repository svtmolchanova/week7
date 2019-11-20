package by.itacademy.molchanova.week.seventh.entity;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

@Data
@JsonTypeName("deathStar")
@JsonRootName(value = "parameters")
public class DeathStar extends BattleShip {

    private Integer maxDestroyerCapacity;

}
