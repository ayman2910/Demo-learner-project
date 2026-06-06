package ScannerComponents;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
public class SMSNotification implements NotificationService{
    @Override
    public String sendAlert(String msg){
        return "[SMS-GATEWAY] CRITICAL: "+msg;
    }
}
