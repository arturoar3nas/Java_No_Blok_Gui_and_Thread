/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrhiscom;

/**
 *
 * @author arturo
 */
public class SubProcess extends Thread {

	private String nombre;
	private long initialTime;

    SubProcess(String operacion, long initialTime) {
        nombre = operacion;
    }

	@Override
	public void run() {

                while(true) {
		System.out.println(this.nombre + " tiempo: "  
					+ (System.currentTimeMillis() - this.initialTime) / 1000 
					+ "seg");
		
		this.esperarXsegundos(1);		

		System.out.println(this.nombre + " Operacion "  
					+ (System.currentTimeMillis() - this.initialTime) / 1000 
					+ "seg");
                }
	}

	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}
