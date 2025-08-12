package com.riesmeyer.schedulenotifier;

import org.springframework.stereotype.Service;

@Service
public class AWSSendNotificationService implements NotificationService {

    @Override
    public void sendDailyNotification() {

        String events = "Meeting at 10AM, Lunch with Bob at 12PM";

        System.out.println("Sending Daily Notification: " + events);

    }
}
