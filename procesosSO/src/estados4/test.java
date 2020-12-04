package estados4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class test {
	
	
	public static void main(String[] args) throws InterruptedException {
		String opcion1="";
		ArrayList<Proceso> listaProcesos = new ArrayList<Proceso>();
		
		listaProcesos.add(new Proceso("Imprimir",3));
		listaProcesos.add(new Proceso("Reproducir musica",6));
		
		for (int i = 0; i < listaProcesos.size(); i++) {
			Thread t1 = new Thread(listaProcesos.get(i));
			
			t1.start();
			t1.join();
			
			
			
		}
	}
}
