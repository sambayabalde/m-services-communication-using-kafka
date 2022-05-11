package sa.eti.cunsomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sa.eti.cunsomer.service.KafkaConsumer;

@SpringBootApplication
public class CunsomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CunsomerApplication.class, args);
    }
}
