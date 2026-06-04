package com.firstProject.demo.DependencyExercise;

import org.springframework.stereotype.Component;

@Component
public class SMSNotification implements NotificationService{
    @Override
    public String sendAlert(String msg){
        return "[SMS-GATEWAY] CRITICAL: "+msg;
    }
}
