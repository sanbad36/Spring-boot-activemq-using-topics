package com.sanket.springBootActiveMQ.entites;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@Setter
@ToString
@Entity
public class RaceCardEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String meetingId;
    private String eventId;
    private String eventName;
    private String jockeyName;
}
