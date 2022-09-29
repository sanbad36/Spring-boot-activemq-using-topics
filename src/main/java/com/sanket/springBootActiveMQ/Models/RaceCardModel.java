package com.sanket.springBootActiveMQ.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by jt on 1/10/17.
 */
@Getter
@Setter
@ToString
public class RaceCardModel implements Serializable {

    private String meetingId;
    private String eventId;
    private String eventName;
    private String jockeyName;
}
