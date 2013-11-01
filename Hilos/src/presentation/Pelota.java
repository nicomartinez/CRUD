/**
 * esta clase se encarga de .
 */
package presentation;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author Juan Nicolas Martinez Fagua
 *
 */
public class Pelota extends JPanel implements Runnable{

	
	private Frame frame;
	private boolean stop;
	private boolean pause;
	private boolean speed;
	/**
	 * este es el metodo constructor de la clase Pelota.java
	 */
	public Pelota(Frame frame) {
		this.frame = frame;
	}
	
	/* (non-Javadoc)
	 * @see java.awt.Container#paintComponents(java.awt.Graphics)
	 */
	@Override
	public void paintComponents(Graphics arg0) {
		super.paintComponents(arg0);
		arg0.fillOval(0, 0, getHeight(), getWidth());
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {	
		while(this.getY() < 100 && this.getY() > 0){
			try {					
				this.setLocation(this.getY() + 2, this.getX());						
				frame.repaint();
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	
	}

	
	
}
