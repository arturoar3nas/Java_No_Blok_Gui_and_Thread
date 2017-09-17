/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrhiscom;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author arturo
 */
public class WhitoutSwingWorkerAction extends AbstractAction{
	
	private ExamenRhiscom obj;
	
	public WhitoutSwingWorkerAction(ExamenRhiscom whitoutSwingWorkerFrame){
		this.obj = whitoutSwingWorkerFrame;
	}

	public void actionPerformed(ActionEvent arg0) {
		int ite = 0;
		while (ite < ExamenRhiscom.MAX_ITE){
			ite = ite + 1;
			this.obj.getTextField().setText("" + ite);
		}		
	}	
}
