package com.sanket.springBootActiveMQ.services.impls;

import com.sanket.springBootActiveMQ.entites.RaceCardEntity;
import com.sanket.springBootActiveMQ.repositories.RaceCardRepository;
import com.sanket.springBootActiveMQ.services.RaceCardService;

import com.sanket.springBootActiveMQ.dtos.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RaceCardServiceImpl implements RaceCardService {

    private static final Logger log = LoggerFactory.getLogger(RaceCardServiceImpl.class);
//    private ModelMapper mapper;
    private RaceCardRepository raceCardRepository;

    @Autowired
    public RaceCardServiceImpl(RaceCardRepository raceCardRepository) {
        this.raceCardRepository = raceCardRepository;
    }

    @Override
    public ResponseEntity<Object> saveNewRaceCard(RaceCardEntity raceCardEntity) {
        raceCardRepository.save(raceCardEntity);
        return new ResponseEntity<>(ApiResponse.builder().errorCode("00").message("Race Card Saved Successfully").build(), HttpStatus.CREATED);
    }

}
