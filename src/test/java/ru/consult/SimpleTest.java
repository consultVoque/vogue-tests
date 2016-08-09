package ru.consult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import ru.consult.listeners.ExecutionListener;
import ru.consult.listeners.SimpleTestListener;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

/**
 * Created by mike-sid on 08.04.16.
 */
public class SimpleTest {

    @Test
    public void passedTest() {
        assertTrue(true);
    }

    @Test
    public void failedTest() {
        failMe();
    }


    public void failMe(){
        assertTrue(false, "This is an error message");
    }

}
