package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
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
		}else if(e.getActionCommand().equals(Figures.FIGURE_CUSTOM.getCommand())){
			DriverCommand driverCommand = new SetPositionCommand(30,30);
			DriverCommand driverCommand1 = new OperateToCommand(-30,30);
			DriverCommand driverCommand2 = new OperateToCommand(-30,-30);
			DriverCommand driverCommand3 = new OperateToCommand(30,-30);
			DriverCommand driverCommand4 = new OperateToCommand(30,30);

			driverCommand.execute(driverManager.getCurrentDriver());
			driverCommand1.execute(driverManager.getCurrentDriver());
			driverCommand2.execute(driverManager.getCurrentDriver());
			driverCommand3.execute(driverManager.getCurrentDriver());
			driverCommand4.execute(driverManager.getCurrentDriver());
		}
	}
}

