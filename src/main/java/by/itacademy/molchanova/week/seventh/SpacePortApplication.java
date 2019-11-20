package by.itacademy.molchanova.week.seventh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpacePortApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpacePortApplication.class, args);
    }
}
