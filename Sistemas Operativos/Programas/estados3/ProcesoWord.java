 package estados3;

public class ProcesoWord implements Runnable{
	String name;
	boolean suspender;
	boolean pausar;
	
	public ProcesoWord(String name) {
		this.name = name;
		suspender = false;
		pausar = false;
	}
	
	public static void pausar() {
		Thread.yield();
		
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 100; i+=5) {
			
			System.out.println("Proceso " + getName()+ " ejecutansdose.... "+ i+"% ");
			if(i==100) {
				System.out.println("*****************Proceso "+ getName() + " terminado*****************");
			}
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
