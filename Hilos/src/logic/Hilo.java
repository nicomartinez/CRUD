/**
 * esta clase se encarga de .
 */
package logic;

/**
 * @author Juan Nicolas Martinez Fagua
 *
 */
public class Hilo extends Thread{

		private boolean stop;
		private boolean pause;
		private int speed;

		
		/**
		 * este es el metodo constructor de la clase Hilo.java
		 */
		public Hilo() {
			stop = false;
			pause = false;
			speed = 1000;
		}
		
		/* (non-Javadoc)
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {	
			while(!pause){
				try {					
					System.out.println("Hola Mundo");
					if(stop){
						break;
					}
					sleep(speed);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		
		}

		public void start(boolean start){
			if(start = true)
				start();
		}
		
		public void pause(boolean pause){
			this.pause = pause;
		}
		
		public void stop(boolean stop){
			this.stop = stop;
		}
		
		public void speed(int speed){
			this.speed = speed;
		}
}
