package estados4;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<Proceso> listaProcesos = new ArrayList<Proceso>();
		
		listaProcesos.add(new Proceso("Imprimir0",3));
		listaProcesos.add(new Proceso("Reproducir musica",6));
		
		for (int i = 0; i < listaProcesos.size(); i++) {
			Thread t1 = new Thread(listaProcesos.get(i));
			t1.start();
			t1.join();
			
		}
	}
}
