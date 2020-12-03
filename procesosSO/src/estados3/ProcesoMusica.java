package estados3;

public class ProcesoMusica implements Runnable {

	String name;
	private boolean paused = false;
	private boolean stopped = false;
	
	public ProcesoMusica(String name) {
		this.name = name;
		//suspender = false;
		//pausar = false;
	}
	
	/*
	 * public void play() { paused = false; stopped = false; new
	 * Thread("ProcesoMusica").start(); }
	 * 
	 * public synchronized void pause() { paused = true; }
	 * 
	 * public synchronized void resume() { paused = false; notify(); }
	 * 
	 * public static void pausar() { Thread.yield();
	 * 
	 * }
	 */
	
	
	@Override
	public void run() {
		while(!stopped) {
			for (int i = 0; i <= 100; i+=5) {

				System.out.println("Proceso " + getName()+ " ejecutansdose.... "+ i+"% ");
				if(i==100) {
					System.out.println("*****************Proceso "+ getName() + " terminado*****************");
				}
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}//end run
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
