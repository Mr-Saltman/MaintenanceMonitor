package com.example.maintenancemonitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaintenanceMonitorTest {

    MaintenanceMonitor maintenanceMonitor = new MaintenanceMonitor();

    @Test
    void getMessageTest(){
        // Arrange
        String expectedResult = "test123";

        // Act
        String result = maintenanceMonitor.getMessage();

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void resetTest(){
        String expectedResult = "";

        String result = maintenanceMonitor.reset();

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void setMessageTest(){
        String expectedResult = "success";

        String result = maintenanceMonitor.setMessage("success");

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void getStatusTest(){
        boolean expectedResult = true;

        boolean result = maintenanceMonitor.getStatus();

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void setStatusTest(){
        boolean expectedResult = false;

        boolean result = maintenanceMonitor.setStatus(false);

        Assertions.assertEquals(expectedResult, result);
    }
}
