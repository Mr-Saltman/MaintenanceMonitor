package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MaintenanceController {

    MaintenanceMonitor maintenanceMonitor = new MaintenanceMonitor();

    @RequestMapping("/getMessage")
    public String getMessage(){
        return maintenanceMonitor.getMessage();
    }

    @RequestMapping("/reset")
    public void resetMessage(){
        maintenanceMonitor.reset();
    }

    @RequestMapping("/setMessage")
    public void setMessage(@RequestParam String msg){
        maintenanceMonitor.setMessage(msg);
    }

}
