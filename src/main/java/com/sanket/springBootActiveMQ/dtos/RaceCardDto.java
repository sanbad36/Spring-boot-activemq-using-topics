package com.sanket.springBootActiveMQ.dtos;

import lombok.Data;


@Data
public class RaceCardDto {

    private Long id;
    private String meetingId;
    private String eventId;
    private String eventName;
    private String jockeyName;
}
