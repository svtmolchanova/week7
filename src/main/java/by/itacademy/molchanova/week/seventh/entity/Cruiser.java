package by.itacademy.molchanova.week.seventh.entity;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

@Data
@JsonTypeName("cruiser")
@JsonRootName(value = "parameters")
public class Cruiser extends BattleShip {

    private Integer amountGuns;

}
