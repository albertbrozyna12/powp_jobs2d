package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class Job2dDriverAbstractAdapter extends AbstractDriver {
    private final Job2dDriver job2dDriver;

    public Job2dDriverAbstractAdapter(Job2dDriver job2dDriver){
        super(0,0);
        this.job2dDriver = job2dDriver;
    }

    @Override
    public void operateTo(int x, int y) {
        job2dDriver.setPosition(getX(),getY());
        job2dDriver.operateTo(x,y);
        setPosition(x,y);
    }
}
