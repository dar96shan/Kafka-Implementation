package com.endUser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import static com.endUser.config.AppConstants.GROUP_ID;
import static com.endUser.config.AppConstants.LOCATION_UPDATE_TOPIC;

@Configuration
public class KafkaConsumerConfig {


    @KafkaListener(topics = LOCATION_UPDATE_TOPIC, groupId = GROUP_ID)
    public void updatedLocation(String value){
        System.out.println(value);
    }

}
