package com.firramo.firramoapi.model.evergreen;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class SubscribeUser{
    private Long userId;
    private Long subscriptionId;
    private int length;
}