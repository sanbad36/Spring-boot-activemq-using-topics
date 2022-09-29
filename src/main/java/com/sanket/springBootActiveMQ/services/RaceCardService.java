package com.sanket.springBootActiveMQ.services;

import com.sanket.springBootActiveMQ.entites.RaceCardEntity;
import org.springframework.http.ResponseEntity;

public interface RaceCardService {

    ResponseEntity<Object> saveNewRaceCard(RaceCardEntity raceCardEntity);
}
