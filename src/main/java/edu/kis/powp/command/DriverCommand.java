package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public interface DriverCommand {
    public abstract void execute(Job2dDriver driver);
}
