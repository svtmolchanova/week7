package by.itacademy.molchanova.week.seventh.entity;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

@Data
@JsonTypeName("destroyer")
@JsonRootName(value = "parameters")
public class Destroyer extends BattleShip{

    private Integer speed;

}
