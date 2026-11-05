package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PatientAlert {

    private final NotificationService notificationService;
    private final NotificationService emergencyNotification;

    @Value("${hospital.name:General City Hospital}")
    private String hospitalName;

    @Value("${HOSPITAL_API_SECRET:demo-secret}")
    private String hospitalApiSecret;

    @Autowired
    public PatientAlert(
            NotificationService notificationService,
            @Qualifier("emergencyService") NotificationService emergencyService) {

        this.notificationService = notificationService;
        this.emergencyNotification = emergencyService;
    }

    public void sendRoutineAlert(int patientId, String message) {
        System.out.println("Hospital: " + hospitalName);
        notificationService.sendNotification(patientId, message);
    }

    public void sendEmergencyAlert(int patientId, String message) {
        System.out.println("Hospital: " + hospitalName);
        emergencyNotification.sendNotification(patientId, message);
    }
}