package ScannerComponents;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertDispatchController {
    private final NotificationService primaryService;
    private final NotificationService backupService;

    @Autowired

    public AlertDispatchController(@Qualifier("SMSNotification") NotificationService primaryService, @Qualifier("slackNotification")NotificationService backupService) {
        this.primaryService = primaryService;
        this.backupService = backupService;
    }
    @GetMapping("/dispatch")
    public String sendAlert(@RequestParam("msg") String msg){
        return primaryService.sendAlert(msg)+" | "+backupService.sendAlert(msg);
    }
}
