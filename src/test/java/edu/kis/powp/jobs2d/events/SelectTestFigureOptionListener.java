package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.Job2dDriverAbstractAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.Figures;


public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals(Figures.FIGURE_JOE_1.getCommand())){
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}else if(e.getActionCommand().equals(Figures.FIGURE_JOE_2.getCommand())){
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
		else if(e.getActionCommand().equals(Figures.FIGURE_JANE.getCommand())){
			FiguresJane.figureScript(new Job2dDriverAbstractAdapter(driverManager.getCurrentDriver()));
		}
	}
}

