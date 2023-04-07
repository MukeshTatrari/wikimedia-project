package com.wikimedia;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.wikimedia.producers.WikimediaChangesProducer;

@Slf4j
@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerApplication.class);
    }

    @Autowired
    private WikimediaChangesProducer producer;

    @Override
    public void run(String... args) throws Exception {
        log.info("loading wikimedia data :: ");
        producer.sendMessage();
    }
}