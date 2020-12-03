package estados3;

import java.awt.Button;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class Principal extends ProcesoMusica{

	public Principal(String name) {
		super(name);
	}

	static int select = -1;
	static String opcion1;
	String opcion2;
	
	public static void main(String[] args) {
		
		Thread pW = new Thread(new ProcesoWord("ProcesoWord"));
		Thread pM = new Thread(new ProcesoMusica("ProcesoMusica"));
		
		
		while (select != 0) {
			//un bloque try catch para evitar que el programa terminr si hay un error
			try {
				
				
				String lectura = JOptionPane.showInputDialog(null,"****************************************\n"
						+ "Elige una opción: \n"
						+ "1.- Abrir Word.\n"
						+ "2.- Reproducir Musica\n"
						+ "0.- Salir\n"
						+ "****************************************");
				//recoger una variable
				select = Integer.parseInt(lectura);
				switch (select) {
				case 1:
					System.out.println("Proceso Word iniciando.");
					pW.start();
					JOptionPane.showInputDialog("¿Quiere pausar el proceso actual?");
					if (opcion1.equals("si")|| opcion1.equals("sI") || opcion1.equals("Si") || opcion1.equals("SI")) {
						Thread.yield();
						pM.start();
						System.out.println("El proceso Word se ha reanudado.");
						pW.join();
					}else {
						if(opcion1.equals("no") || opcion1.equals("nO") || opcion1.equals("No") || opcion1.equals("NO")){
                           System.out.println( "El proceso word ya se esta ejecutando, espere a que finalice");
                        }
					}
					break;
				case 2:
					System.out.println("Proceso Musica iniciando.");
					pW.start();
					JOptionPane.showInputDialog("¿Quiere pausar el proceso actual?");
					if (opcion1.equals("si")|| opcion1.equals("sI") || opcion1.equals("Si") || opcion1.equals("SI")) {
						
						pM.start();
						pW.yield();
						System.out.println("El proceso Word se ha reanudado.");
						pW.start();
					}else {
						if(opcion1.equals("no") || opcion1.equals("nO") || opcion1.equals("No") || opcion1.equals("NO")){
	                           System.out.println( "El proceso musica ya se esta ejecutando, espere a que finalice");
	                        }
						}
					break;
				
				case 0:
					JOptionPane.showMessageDialog(null,	"Adios! ^-^");
					break;
				
				default:
					JOptionPane.showMessageDialog(null,"Opcion no reconocida.");
					break;
				}
				
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Ups, ha ocurrido un error!","ERROR", JOptionPane.ERROR_MESSAGE);
			}
			
		}//end while
	}
	
	
}
