package com.senati.eti;

public class caso6 {

	public static void main(String[] args) {
		String[][] mDatos = {{"Joe castillo","Rosa Alvarez","Carlos Santos"},
				              {"Callao","Comas","San miguel"}};
		System.out.println("Impresion de valores por filas");
		System.out.println("------------------------------------");
		for (int f=0; f< mDatos.length; f++) {
			for (int c=0; c<mDatos[0].length; c++) {
				System.out.print(String.format("%-20s", mDatos[f][c]));
			}
			System.out.println();
		}
		System.out.println("Impresion de valores por columnas");
		System.out.println("------------------------------------");
		for (int c=0; c < mDatos[0].length; c++) {
			for (int f=0; f<mDatos.length; f++) {
				System.out.print(String.format("%-20s", mDatos[f][c]));
			}
			System.out.println();
		
		}

	}
}


