package com.senati.eti;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class caso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// metodo dela burbuja si ve que la pregunta que hace es verdadera
		//cambia de valor 
		Scanner y = new Scanner(System.in);
		Integer[] arrNumero = new Integer[5];
		System.out.println("Registro de numeros");
		System.out.println("------");
		
		for (int x =0; x < arrNumero.length; x++) {
			System.out.print("Numero "+ (x+1) + ": ");
			arrNumero[x] = y.nextInt();

	}
		Arrays.sort(arrNumero);
		System.out.println("-------------------------------------");
		System.out.println("Numeros ordenados de forma ascendente");
		
		for (int x =0; x < arrNumero.length; x++)
			System.out.println("Numero "+ (x+1) + ": "+ arrNumero[x]);
		
		//ordenar el array de forma descendente
		Arrays.sort(arrNumero, Collections.reverseOrder());
		
		System.out.println("-------------------------------------");
		System.out.println("Numeros ordenados de forma ascendente");
		
		for (int x =0; x < arrNumero.length; x++)
			System.out.println("Numero "+ (x+1) + ": "+ arrNumero[x]);

	}
}

