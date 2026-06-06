package ScannerComponents;

import org.springframework.stereotype.Component;

@Component
public class SlackNotification implements NotificationService{
    @Override
    public String sendAlert(String msg){
        return "[SLACK-WEBHOOK] DEV-ALERT: "+msg;
    }
}
