package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;


/**
 * driver adapter to drawer with several bugs.
 */
public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0, startY = 0;
    private final ILine line;
    public LineDrawerAdapter(ILine line) {
        super();
        this.line = line;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        edu.kis.powp.jobs2d.features.DrawerFeature.getDrawerController().drawLine(line);
        setPosition(x,y);
    }

    @Override
    public String toString() {
        return "Line drawer adapter";
    }
}
