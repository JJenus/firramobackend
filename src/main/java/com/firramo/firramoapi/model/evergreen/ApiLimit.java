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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "api_limit")
public class ApiLimit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String apiName;
    private int currentRate;

    public ApiLimit(String apiName, int currentRate, int rateLimit, String status) {
        this.apiName = apiName;
        this.currentRate = currentRate;
        this.rateLimit = rateLimit;
        this.status = status;
    }

    private int rateLimit;
    private String status;
}
