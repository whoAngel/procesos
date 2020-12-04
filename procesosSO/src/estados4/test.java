package estados4;

import java.util.ArrayList;



public class test {
	
	
	public static void main(String[] args) throws InterruptedException {
		String opcion1="";
		ArrayList<Proceso> listaProcesos = new ArrayList<Proceso>();
		
		listaProcesos.add(new Proceso("Imprimir",3,false));
		listaProcesos.add(new Proceso("Reproducir musica",8, false));
		listaProcesos.add(new Proceso("Abrir task manager",5, true));
		listaProcesos.add(new Proceso("Abrir Word", 4, true));
		
		for (int i = 0; i < listaProcesos.size(); i++) {
			Thread t1 = new Thread(listaProcesos.get(i));
			
			t1.start();
			t1.join();
		}
		
	}
}
