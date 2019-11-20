package by.itacademy.molchanova.week.seventh.dto;

import lombok.Data;

import java.util.HashMap;

@Data
public class ShipDto {

    String type;
    HashMap<String, Object> parameters;

    @Override
    public String toString() {
        return "ShipDto{" +
                "type='" + type + '\'' +
                ", parameters=" + parameters +
                '}';
    }

}
