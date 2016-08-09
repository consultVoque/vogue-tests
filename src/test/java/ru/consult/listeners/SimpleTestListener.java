package ru.consult.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * User: Sidelnikov Mikhail
 * Date: 09.08.16
 */
public class SimpleTestListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("Test started");
    }

    public void onTestSuccess(ITestResult result) {

    }

    public void onTestFailure(ITestResult result) {
        //do screenshot
        System.out.println("failed test : " + result.getName());
    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }
}
