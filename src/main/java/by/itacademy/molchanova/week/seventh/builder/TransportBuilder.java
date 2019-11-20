package by.itacademy.molchanova.week.seventh.builder;

import by.itacademy.molchanova.week.seventh.entity.Transport;

public class TransportBuilder extends Builder {

    private Transport transport;

    public TransportBuilder() {
        this.transport = new Transport();
    }

    public TransportBuilder withColor(String color) {
        this.transport.setColor(color);
        return this;
    }

    public TransportBuilder withCapacity(Integer capacity) {
        this.transport.setCapacity(capacity);
        return this;
    }

    public Transport build() {
        return this.transport;
    }
}
