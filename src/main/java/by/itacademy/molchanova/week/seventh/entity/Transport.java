package by.itacademy.molchanova.week.seventh.entity;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

@Data
@JsonTypeName("transport")
@JsonRootName(value = "parameters")
public class Transport extends ProductionShip {

    private Integer capacity;


}
