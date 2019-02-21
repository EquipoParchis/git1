package entregaCoches;
import java.util.*;

import javax.swing.JOptionPane;

import entregas.Coches;
public class Principal {
	static int menu(int tope_op, Scanner sc)
	{
		int opcion_menu;
		
		JOptionPane.showInputDialog(
				"1.Crear un coche y añadirlo a la lista de coches"
				+ "\n2.Borrar un coche buscándolo por matrícula."
				+ "\n3.Mostrar los datos de un coche buscándolo por matrícula."
	    			+ "\n4.Ordenar los coches por matricula de forma descendente."
	    			+ "\n5.Mostrar los datos de todos los coches."
	    			+ "+\n6.Salir\n");
	      
		do
		{
			JOptionPane.showInputDialog("\n\n\tElija opcion:");
			opcion_menu=sc.nextInt();
		} while (opcion_menu  < 1 || opcion_menu > tope_op);
		
	    return opcion_menu;
	}
	
    public static void main(String[] args){
    		
    	 
    	
    	final int MAX_OPC=6;
         Scanner teclado=new Scanner(System.in);
         int opcion=0,i;
         Coche coche;  
         Garage Acoches= new Garage();
         
         
         while(opcion!=MAX_OPC){
        	 	opcion = menu(MAX_OPC, teclado);
       	switch(opcion){
       	
       	case 1:
       		Acoches.añadirCoche(teclado);
    		
       	case 2:      	 
       		Acoches.eliminarCoches();
    	 	 
       	case 3:
       		Acoches.BuscarMatricula();
       	case 4:
       		Acoches.buscarCochedescendente();
       	case 5: 
       		Acoches.mostrarCoches();
       	case 6: 
    	 	opcion=MAX_OPC;
    	 
    	 	break;
 	} 
       }
       teclado.close();
     }
    }
	


