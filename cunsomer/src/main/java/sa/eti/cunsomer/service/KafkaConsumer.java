package sa.eti.cunsomer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "eti.topic", groupId = "eti.group")
    public void consume(String item) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", item));
    }
}
