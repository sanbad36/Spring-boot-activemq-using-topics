package com.sanket.springBootActiveMQ.Listener;

import com.sanket.springBootActiveMQ.Models.RaceCardModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.ObjectMessage;

@Component
@Slf4j
public class RaceCardListener {

    @JmsListener(destination = "${active-mq.topic1}" )
    public void newraceCardMessageReceiver(Message message) {

        try {
           ObjectMessage objectMessage = (ObjectMessage)message;
           RaceCardModel receivedRaceCardModel =(RaceCardModel)objectMessage.getObject();
            log.info("Received Message from Topic: ${active-mq.topic1}"+ receivedRaceCardModel.toString());

        } catch (Exception e) {
            log.error("Received Exception while processing message: ${active-mq.topic1}"+ e);
        }
    }

    @JmsListener(destination = "${active-mq.topic2}" )
    public void updateraceCardMessageReceiver(Message message) {

        try {
            ObjectMessage objectMessage = (ObjectMessage)message;
            RaceCardModel receivedRaceCardModel =(RaceCardModel)objectMessage.getObject();
            log.info("Received Message from Topic: ${active-mq.topic2}"+ receivedRaceCardModel.toString());

        } catch (Exception e) {
            log.error("Received Exception while processing message: "+ e);
        }
    }
}
