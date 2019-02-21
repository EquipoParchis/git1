package entregaCoches;
import java.util.*;

import javax.swing.JOptionPane;

import entregas.Coches;
public class Garage {
	private ArrayList<Coche> arrayCoches;
	
	public Garage() {
		arrayCoches = new ArrayList<Coche>();
	}
	
	  public void añadirCoche(Scanner sc){
		    String color, matricula, marca;
		    
		    Coche coche=null;
		    
		    color=JOptionPane.showInputDialog("Introducir color ");
			
			matricula=JOptionPane.showInputDialog("Introducir matricula ");
		
			marca=JOptionPane.showInputDialog("Introducir marca ");
			
			int numPuertas=JOptionPane.showInternalConfirmDialog(null,"Introducir numero de puertas ");
			
			coche=new Coche(matricula,color,marca,numPuertas);           
				      	
			JOptionPane.showInputDialog(coche);
			arrayCoches.add(coche);
		   }	
	 public void mostrarCoches() {
 	    for(int j=0;j<Coche.getNC();j++){
 	   		if (arrayCoches.get(j) != null) {
 	   			arrayCoches.get(j).toString();
 	   		}
 	    }
     }
	 
	 public void eliminarCoches() {
		 Scanner teclado = new Scanner (System.in);
		 String buscar=JOptionPane.showInputDialog("¿Que matricula quieres eliminar?");
		
		 
			 for (int i = 0; i < arrayCoches.size(); i++) {
				if (arrayCoches.get(i).getMatricula().equals(buscar)) {
					JOptionPane.showInputDialog("coche" + arrayCoches.get(i) + "eliminado");
		 
			}else {
				JOptionPane.showInputDialog("No hay ningun coche con esa matricula");
				JOptionPane.showInputDialog(arrayCoches.get(i));
			}
			}
	 	   	
	 	   		
	 	    
	     }
	 public void  BuscarMatricula() {
		
		 Scanner teclado = new Scanner (System.in);
		 JOptionPane.showInputDialog("¿Que matricula quieres buscar?");
		 String buscar = teclado.next();
		 
			 for (int i = 0; i < arrayCoches.size(); i++) {
				if (arrayCoches.get(i).getMatricula().equals(buscar)) {
					JOptionPane.showInputDialog(arrayCoches.get(i)); 
		 
			}else {
				JOptionPane.showInputDialog("No hay ningun coche con esa matricula");
				JOptionPane.showInputDialog(arrayCoches.get(i));
			}
			}
 	
		}
	 public void buscarCochedescendente() {
		 for (int i = 0; i < arrayCoches.size(); i++) {
			 
		 }


			}
	 }

