package ScannerComponents;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Lazy
@RestController
public class AlertDispatchController {
    private final NotificationService primaryService;
    private final NotificationService backupService;

    @Autowired

    public AlertDispatchController( NotificationService primaryService,@Qualifier("slackNotification") NotificationService backupService) {
        this.primaryService = primaryService;
        this.backupService = backupService;
        System.out.println("In conStructor: "+getClass().getSimpleName());
    }
    @GetMapping("/dispatch")
    public String sendAlert(@RequestParam("msg") String msg){
        return primaryService.sendAlert(msg)+" | "+backupService.sendAlert(msg);
    }
}
