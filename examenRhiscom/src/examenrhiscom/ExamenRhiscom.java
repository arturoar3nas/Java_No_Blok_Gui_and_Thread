/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrhiscom;

import java.awt.BorderLayout;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 *
 * @author arturo
 */
public class ExamenRhiscom extends JFrame  {

	public static int MAX_ITE = 100000;
	
	private JTextField jtfInformacion = new JTextField();
	private JButton jbWhitoutSwingWorker = new JButton();
	private JButton jbUsingSwingWorker = new JButton();
	private JPanel jpMarco = new JPanel();
	private JPanel jpAccciones = new JPanel();
	
	public ExamenRhiscom(){
		initComponents();
	}
	
	private void initComponents(){
		jpMarco.setLayout(new BorderLayout());
		jpMarco.add(jtfInformacion, BorderLayout.NORTH);
		
 
		jbWhitoutSwingWorker.setAction(new WhitoutSwingWorkerAction(this));
		jbWhitoutSwingWorker.setText("Incrementar con Bloqueo Interfaz");// sin swing worker
		jbUsingSwingWorker.setAction(new UsingSwingWorkerAction(this));
		jbUsingSwingWorker.setText("Incrementar sin Bloquear la interfaz");//con swing worker
		
		jpAccciones.add(jbWhitoutSwingWorker);
		jpAccciones.add(jbUsingSwingWorker);
		
		jpMarco.add(jpAccciones, BorderLayout.CENTER);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		getContentPane().add(jpMarco);
		
		this.setTitle("Examen Rhiscom");
		
		pack();
	}
	
	public JTextField getTextField(){
		return this.jtfInformacion;
	}        
        
	public static void main(String[] args) {
            
		
                SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new ExamenRhiscom().setVisible(true);
			}
		});
                
                // Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		SubProcess sp_1 = new SubProcess("SubProcess 1",initialTime);
		SubProcess sp_2 = new SubProcess("SubProcess 2",initialTime);

                sp_1.start();
		sp_2.start();
                
		
	}
    
}


