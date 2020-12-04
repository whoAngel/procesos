package estados4;

import java.util.ArrayList;



public class test {
	
	
	public static void main(String[] args) throws InterruptedException {
		String opcion1="";
		ArrayList<Proceso> listaProcesos = new ArrayList<Proceso>();
		
		listaProcesos.add(new Proceso("Imprimir",3,false));
		listaProcesos.add(new Proceso("Reproducir musica",9, false));
		listaProcesos.add(new Proceso("Abrir task manager",6, true));
		
		for (int i = 0; i < listaProcesos.size(); i++) {
			Thread t1 = new Thread(listaProcesos.get(i));
			
			t1.start();
			t1.join();
			if (i == 2) {
				System.out.println("Proceso en espera");
				t1.wait(1000);
			}
			
			
			
		}
	}
}
