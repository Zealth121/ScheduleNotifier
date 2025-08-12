package com.riesmeyer.schedulenotifier;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendNotificationController {

    private final NotificationService notificationService;

    public SendNotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("{username}/sendNotification")
    public String sendNotification(@PathVariable String username){
        try{
            notificationService.sendDailyNotification();
            return "Notification sent successfully to " + username;
        } catch (Exception e){
            e.printStackTrace();
            return "Error sending notification: " +  e.getMessage();
        }
    }
}
