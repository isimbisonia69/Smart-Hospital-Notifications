# Smart Hospital Notification System

## Project Description
This project demonstrates a Smart Hospital Notification System using Java and Spring Framework .

The application manages routine and emergency patient notifications. Notifications are simulated by printing messages to the console. .

## Technologies
- Java 25
- Maven
- Spring Framework
- Spring  and Dependency Injection

## Features
- Email notification as the default service using `@Primary`.
- SMS notification using `@Component("smsService")`.
- Emergency notification using `@Component("emergencyService")`.
- Dependency Injection using `@Autowired`.
- Service selection using `@Qualifier`.
- Hospital configuration using `@Value`.

## Project Files
- `NotificationService.java` – Notification interface.
- `EmailNotification.java` – Email notification implementation.
- `SmsNotification.java` – SMS notification implementation.
- `EmergencyNotification.java` – Emergency notification implementation.
- `PatientAlert.java` – Handles routine and emergency alerts.
- `Appconfig.java` – Spring configuration.
- `SystemApplication.java` – Application entry point.

## How to Run
1. Open the project in IntelliJ IDEA.
2. Reload Maven dependencies.
3. Open `SystemApplication.java`.
4. Run the `main` method.

## Configuration
The hospital name defaults to `General City Hospital`.

A sample `HOSPITAL_API_SECRET` value is injected for configuration demonstration only. No real API is called.

