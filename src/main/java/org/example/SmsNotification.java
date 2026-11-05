package org.example;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsNotification implements NotificationService {

    @Override
    public void sendNotification(int patientId, String message) {

        System.out.println("Sending SMS to patient: " + patientId);
        System.out.println("Message: " + message);
    }
}