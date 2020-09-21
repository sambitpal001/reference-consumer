package com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class PactContractConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PactContractConsumerApplication.class, args);
    }

}
