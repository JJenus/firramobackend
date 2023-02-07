package com.firramo.firramoapi.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.messaging.SessionSubscribeEvent;

@RestController
@CrossOrigin(origins = "*")
public class OnWebSocketConnected implements ApplicationListener<SessionSubscribeEvent> {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @Override
    public void onApplicationEvent(SessionSubscribeEvent event) {
        SimpMessageHeaderAccessor headers = SimpMessageHeaderAccessor.wrap(event.getMessage());

        if (headers.containsNativeHeader("trackingData") && !headers.getNativeHeader("trackingData").isEmpty()){
            System.out.println("\n\n>>> YES");
            simpMessagingTemplate.convertAndSend("/ws/gps/gps-data", "{\"connected\": \"true\"}");
        }
    }
}
