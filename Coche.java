package entregaCoches;

import java.util.*;



public class Coche {
	private  String color, marca, matricula;
	private  int numPuertas;
	private static int numCoches=0;

	
Coche (String color, String marca, String matricula, int numPuertas){
	    	this.color=color;
	    	this.marca=marca;
	    	this.matricula=matricula;
	    	this.numPuertas=numPuertas;
	    	numCoches++;
	    }

public static int getNC(){
	return numCoches;
}


public String color(){
	return color;	
}


public String marca(){
	return marca;	
}


public String matricula(){
	return matricula;	
}

public int numPuertas(){
	return numPuertas;	
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public int getNumPuertas() {
	return numPuertas;
}

public void setNumPuertas(int numPuertas) {
	this.numPuertas = numPuertas;
}

public static int getNumCoches() {
	return numCoches;
}

public static void setNumCoches(int numCoches) {
	Coche.numCoches = numCoches;
}

public  String toString(){
	return ("Color =  " + color + " Marca =  " + marca + " matricula " + matricula + " numero de puertas " + numPuertas);
}

}

	
