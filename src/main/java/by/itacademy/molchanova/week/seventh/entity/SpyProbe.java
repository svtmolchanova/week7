package by.itacademy.molchanova.week.seventh.entity;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

@Data
@JsonTypeName("spyProbe")
@JsonRootName(value = "parameters")
public class SpyProbe extends  ProductionShip{

    private ScanSensorType sensorType;

}
