package ru.consult;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

/**
 * User: Sidelnikov Mikhail
 * Date: 09.08.16
 */

public class SecondTest {

    @Test
    public void secondPassedTest() {
        System.out.println("This is second passed test");
    }

    @Test
    public void failedTest() {
        assertTrue(false);
    }
}
