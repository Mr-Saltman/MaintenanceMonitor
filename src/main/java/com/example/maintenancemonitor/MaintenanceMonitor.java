package com.example.maintenancemonitor;

public class MaintenanceMonitor {

    public String message = "test123";
    public boolean status = true;

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage(){
        return this.message;
    }

    public String reset(){
        this.message = "";
        return this.message;
    }

    public String setMessage(String msg){
        this.message = msg;
        return this.message;
    }

}
