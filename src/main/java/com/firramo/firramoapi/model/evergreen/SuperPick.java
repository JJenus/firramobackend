package com.firramo.firramoapi.model.evergreen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "super_picks")
public class SuperPick {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String away_team;
    private String competition;
    private String country;
    private String date;
    private long fixture_id;
    private String fixture_status;
    private String home_team;
    private String market_id;
    private String market_name;
    private String odd;
    private String prediction;
    private String probability;
    private String results;
    private String sport_id;
    private String sport_name;
}
