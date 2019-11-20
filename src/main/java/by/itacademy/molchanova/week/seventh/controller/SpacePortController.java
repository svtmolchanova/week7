package by.itacademy.molchanova.week.seventh.controller;

import by.itacademy.molchanova.week.seventh.dto.ShipDto;
import by.itacademy.molchanova.week.seventh.entity.Ship;
import by.itacademy.molchanova.week.seventh.service.SpacePortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("api/v1/ship")
public class SpacePortController {

    private SpacePortService spacePortService;

    @Autowired
    public SpacePortController(SpacePortService spacePortService) {
        this.spacePortService = spacePortService;
    }

    @PostMapping(value = "/building", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Ship buildShip(@RequestBody ShipDto dto) throws IOException {
        return spacePortService.shipBuild(dto);
    }
}
