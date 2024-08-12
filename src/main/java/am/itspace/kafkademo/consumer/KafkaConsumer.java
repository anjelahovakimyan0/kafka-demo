package am.itspace.kafkademo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "alibouTopic", groupId = "myGroup") // Which topic we want to consume and this consumer is part of myGroup
    public void consumeMsg(String msg) {
        log.info(String.format("Consuming the message from alibou Topic:: %s", msg));
    }
}
