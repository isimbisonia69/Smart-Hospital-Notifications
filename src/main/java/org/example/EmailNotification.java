package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotification implements NotificationService {

    @Override
    public void sendNotification(int patientId, String message) {

        System.out.println("Sending EMAIL to patient: " + patientId);
        System.out.println("Message: " + message);
    }
}