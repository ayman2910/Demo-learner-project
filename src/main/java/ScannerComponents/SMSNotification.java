package ScannerComponents;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Lazy
@Primary
@Component
public class SMSNotification implements NotificationService{
    public SMSNotification(){
        System.out.println("In conStructor: "+getClass().getSimpleName());
    }
    @Override
    public String sendAlert(String msg){
        return "[SMS-GATEWAY] CRITICAL: "+msg;
    }
}
