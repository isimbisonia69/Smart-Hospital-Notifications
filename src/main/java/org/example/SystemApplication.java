package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SystemApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Appconfig.class);

        PatientAlert processor = context.getBean(PatientAlert.class);

        processor.sendRoutineAlert(101, "Your appointment is tomorrow.");

        processor.sendEmergencyAlert(102, "Patient needs immediate medical attention.");

        context.close();
    }
}