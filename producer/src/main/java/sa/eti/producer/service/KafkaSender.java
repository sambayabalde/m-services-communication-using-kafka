package sa.eti.producer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import sa.eti.producer.model.Item;

@Service
@RequiredArgsConstructor
public class KafkaSender {
    private final static String TOPIC = "eti.topic";
    private final KafkaTemplate<String, Item> kafkaTemplate;

    public void sendMessage(Item item){
        kafkaTemplate.send(TOPIC, item);
    }
}
