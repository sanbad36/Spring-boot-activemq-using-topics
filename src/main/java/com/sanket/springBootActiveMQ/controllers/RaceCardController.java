package com.sanket.springBootActiveMQ.controllers;

import com.sanket.springBootActiveMQ.Models.RaceCardModel;
import com.sanket.springBootActiveMQ.sendService.sendService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/api/v1")
public class RaceCardController {

    @Value("${active-mq.topic}")
    private static String topic;
    @Autowired
    private sendService sendService;

    private static final Logger log = LogManager.getLogger();
//    @Autowired
//    private RaceCardService raceCardService;

    @PostMapping( "/racecard")
    public ResponseEntity<String> saveNewRaceCard(@RequestBody RaceCardModel raceCardModel){
        System.out.println("*** IN controller");
//        RaceCardEntity savedEntity = raceCardService.saveNewRaceCard(raceCardEntity);
//          String message = "Test message";
        sendService.sendRaceCard(raceCardModel);
        return new ResponseEntity<>("Sent.", HttpStatus.CREATED);
    }

    @PutMapping( "/updateracecard")
    public ResponseEntity<String> updateRaceCard(@RequestBody RaceCardModel raceCardModel){
        System.out.println("*** IN controller");
//        RaceCardEntity savedEntity = raceCardService.saveNewRaceCard(raceCardEntity);
//          String message = "Test message";
        sendService.updateRaceCard(raceCardModel);
        return new ResponseEntity<>("Updated..", HttpStatus.OK);
    }
}
