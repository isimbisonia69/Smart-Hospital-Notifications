package org.example;

import org.springframework.stereotype.Component;

@Component("emergencyService")
public class EmergencyNotification implements NotificationService {

    @Override
    public void sendNotification(int patientId, String message) {

        System.out.println("!!! CRITICAL ICU ALERT !!!");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Emergency Message: " + message);
        System.out.println("URGENT: Immediate medical attention required!");

    }
}