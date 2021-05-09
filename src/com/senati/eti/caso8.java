package com.senati.eti;

import java.util.ArrayList;
import java.util.Scanner;

public class caso8 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		ArrayList<String> arrnombre = new ArrayList<String>();
		ArrayList<Integer> arredad = new ArrayList<Integer>();
		String rp ="S", nombre="";
		int nr =0, edad =0;
		
		while (rp.equals("S") || rp.equals("S")) {
			nr++;
			System.out.println("Registro N."+ nr);
			System.out.println("-------------");
			System.out.println("Nombre....:");
			nombre= x.nextLine();
			System.out.println("Edad......:");
			edad= x.nextInt();
			
			//Agregar valores leidos a cada ArrayList
			arrnombre.add(nombre);
			arredad.add(edad);
			
			
			
			System.out.println("¿Continua? [S|N]: ");
			rp = x.nextLine();
		}
		
		
	

	

}
}
