package estados4;

public class Proceso implements Runnable {
	private String name;
	private String state;
	private boolean pausa;
	private int time;
	
	public Proceso(String name, int time) {
		this.name= name;
		this.time = time;
	}
	
	public String toString() {
		return "Proceso " + name + " "+ state;
	}
	
	
	public void run() {
		for (int i = 0; i <= 100; i+=5) {
			System.out.println("El proceso "+getName()+" esta en ejecución.... "+ i+"%");
			try {
				Thread.sleep(time*100);
			} catch (InterruptedException e) {
				System.err.print("-------- PROCESO "+ getName()+ " INTERRUMPIDO --------\\n\\n");
			}
			if (i==100) {
				System.out.println("-------- PROCESO "+ getName() +" TERMINADO --------\n\n");
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
