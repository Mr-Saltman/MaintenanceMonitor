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
}
