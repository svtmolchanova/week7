package by.itacademy.molchanova.week.seventh.service;

import by.itacademy.molchanova.week.seventh.dto.ShipDto;
import by.itacademy.molchanova.week.seventh.entity.Ship;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SpacePortService {

    public Ship shipBuild(ShipDto dto) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = dto.getParameters().toString();
        Ship ship = objectMapper.readValue(json, Ship.class);
        return ship;
    }
}
