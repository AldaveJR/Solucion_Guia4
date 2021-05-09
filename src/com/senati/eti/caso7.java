package com.senati.eti;

import java.util.Scanner;

public class caso7 {

	public static void main(String[] args) {
		Scanner x =new Scanner(System.in);
		
		//Definir la matriz de numeros 3x4
		int [][] nNumeros= new int[3][4];
		int num_mayor =0;
		System.out.println("LECTURA DE NUMEROS");
		System.out.println("------------------");
		
		for (int f =0; f<nNumeros.length; f++){
			System.out.println("Fila: "+ (f+1));
			System.out.println("-------");
			
			for (int c =0; c < nNumeros[0].length; c++) {
				System.out.print("Numero "+ (c+1)+ ": ");
				nNumeros[f][c] = x.nextInt();
			
			if (f==0 && c ==0) {
				num_mayor = nNumeros[0][0];
				
			}else {
				if (nNumeros[f][c] > num_mayor) num_mayor = nNumeros[f][c];
			}
			
			
			}
		}
			
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Número mayor....: "+ num_mayor);
		
		
			

	}

}
