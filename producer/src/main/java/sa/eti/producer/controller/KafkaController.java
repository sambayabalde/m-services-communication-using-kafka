package sa.eti.producer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.eti.producer.model.Item;
import sa.eti.producer.service.KafkaSender;

@RestController
@RequestMapping("api/kafka/producer")
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaSender kafkaSender;

    @PostMapping
    public String postJsonMessage(@RequestBody Item item){
        kafkaSender.sendMessage(new Item(1,"Lenovo","Laptop"));
        return "Message published successfully";
    }
}
