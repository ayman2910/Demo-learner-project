package ScannerComponents;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class SlackNotification implements NotificationService{
    public SlackNotification(){
        System.out.println("In conStructor: "+getClass().getSimpleName());
    }
    @Override
    public String sendAlert(String msg){
        return "[SLACK-WEBHOOK] DEV-ALERT: "+msg;
    }
}
