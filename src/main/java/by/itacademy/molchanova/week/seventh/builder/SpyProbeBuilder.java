package by.itacademy.molchanova.week.seventh.builder;

import by.itacademy.molchanova.week.seventh.entity.ScanSensorType;
import by.itacademy.molchanova.week.seventh.entity.SpyProbe;

public class SpyProbeBuilder extends Builder {

    private SpyProbe spyProbe;

    public SpyProbeBuilder() {
        this.spyProbe = new SpyProbe();
    }

    public SpyProbeBuilder withColor(String color) {
        this.spyProbe.setColor(color);
        return this;
    }

    public SpyProbeBuilder withSensorType(ScanSensorType sensorType) {
        this.spyProbe.setSensorType(sensorType);
        return this;
    }

    public SpyProbe build() {
        return this.spyProbe;
    }
}
