package com.sanket.springBootActiveMQ.sendService;

import com.sanket.springBootActiveMQ.Models.RaceCardModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class sendService {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${active-mq.topic1}")
    private  String topic1;

    @Value("${active-mq.topic2}")
    private  String topic2;

    public void sendRaceCard(RaceCardModel raceCardModel) {

        try {
            jmsTemplate.convertAndSend(topic1, raceCardModel);
//            return new ResponseEntity<>("Sent.", HttpStatus.OK);

        } catch (Exception e) {
//            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
             log.error("Internal Server Error : ", e);
        }
    }


    public void updateRaceCard(RaceCardModel raceCardModel){
        try {
            jmsTemplate.convertAndSend(topic2, raceCardModel);
//            return new ResponseEntity<>("Sent.", HttpStatus.OK);

        } catch (Exception e) {
//            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            log.error("Internal Server Error : ", e);
        }
    }
}
