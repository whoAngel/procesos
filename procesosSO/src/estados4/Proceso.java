package estados4;

public class Proceso implements Runnable {
	private String name;
	private boolean pausa = false;
	private int time;
	
	
	int random = (int) (Math.random()*9+1);
	
	public Proceso(String name, int time, boolean pausa) {
		this.name= name;
		this.time = time;
		this.pausa = pausa;
	}
	
	
	 //public String toString() { return "Proceso " + name + " "+ state; }
	 
	
	
	public void run() {
		
		System.out.println("\tPROCESO "+ getName()+" LISTO");
			//Asigno recursos
			try {
				System.out.println("\tASIGNANDO RECURSOS::::::::::");
				Thread.sleep(time*1500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		// un for para que simule un progreso	
		for (int i = 0; i <= 100; i+=5) {
			if (pausa==false) {
				System.out.println("El proceso "+getName()+" esta en ejecución.... "+ i+"%");
				
				try {
					Thread.sleep(time*100);
				} catch (InterruptedException e) {
					System.err.print("-------- PROCESO "+ getName()+ " INTERRUMPIDO --------\n\n");
				}
				if (i==100) {
				System.out.println("-------- PROCESO "+ getName() +" TERMINADO --------\n\n");
				}
			}
			
			//para los procesos que se pausan o interrumpen
			else {
				System.out.println("El proceso "+getName()+" esta en ejecución.... "+ i+"%");
				if (i==random*10) {
					System.out.println("***** Proceso INTERRUMPIDO *****");
					System.out.println("Espere...");
					try {
						Thread.sleep(8000);
						System.out.println("***** Proceso REANUDADO *****");
						Thread.sleep(time*100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				try {
					Thread.sleep(time*100);
				} catch (InterruptedException e) {
					System.err.print("-------- PROCESO "+ getName()+ " INTERRUMPIDO --------\n\n");
				}
				
				
				if (i==100) {
				System.out.println("-------- PROCESO "+ getName() +" TERMINADO --------\n\n");
				}
			}//end else
			
		}//end for
	}//end run

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
