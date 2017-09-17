/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrhiscom;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.SwingWorker;

/**
 *
 * @author arturo
 */
public class UsingSwingWorkerAction extends AbstractAction{
	
	private ExamenRhiscom obj;
	
	public UsingSwingWorkerAction(ExamenRhiscom usingSwingWorkerFrame){
		this.obj = usingSwingWorkerFrame;
	}
 
	public void actionPerformed(ActionEvent arg0) {
		final SwingWorker worker = new SwingWorker(){
 
			@Override
			protected Object doInBackground() throws Exception {
				int ite = 0;
				while (ite < ExamenRhiscom.MAX_ITE){
					ite = ite + 1;
					obj.getTextField().setText("" + ite);
				}	
				return null;
			}	
		};
		worker.execute();
	}
}
