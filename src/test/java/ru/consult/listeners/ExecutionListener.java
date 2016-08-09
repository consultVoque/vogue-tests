package ru.consult.listeners;

import org.testng.IExecutionListener;

/**
 * User: Sidelnikov Mikhail
 * Date: 09.08.16
 */
public class ExecutionListener implements IExecutionListener {

    public void onExecutionStart() {
        System.out.println("Execution");
    }

    public void onExecutionFinish() {

    }
}
