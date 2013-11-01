/**
 * esta clase se encarga de .
 */
package presentation;

import javax.swing.JFrame;

import logic.Hilo;

/**
 * @author Juan Nicolas Martinez Fagua
 *
 */
public class Frame extends JFrame{

	
	private Pelota pelota;
	/**
	 * este es el metodo constructor de la clase Frame.java
	 */
	public Frame() {
		super();
		setLayout(null);
		setSize(200, 300);
		
		
		pelota = new Pelota(this);
		pelota.setBounds(10, 10, 30, 30);
		
		add(pelota);
		
		Thread thread = new Thread(pelota);
		thread.start();
		
		setVisible(true);
		
	}
	
//	
//	public static void main(String[] args) {
//		//Frame frame = new Frame();
//		Hilo hilo = new Hilo();
//		hilo.start(true);
//	}
}
