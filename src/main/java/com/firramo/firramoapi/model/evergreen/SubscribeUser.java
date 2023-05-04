package com.firramo.firramoapi.model.evergreen;

import lombok.Data;

@Data
public class SubscribeUser{
    private Long userId;
    private Long subscriptionId;
    private int length;
}