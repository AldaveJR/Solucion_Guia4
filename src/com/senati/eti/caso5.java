package com.senati.eti;
import java.util.Scanner;

public class caso5 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		
		String[] arrcodigo = {"A-123", "A-456", "A-789", "A-159"};
		String estado = "";
		String[] arrnombre = {"Balmer aldave", "Juan Gomez","Felipe Ramos","Pedro Lopez"};
		int [] arrnota= {13,8,18,10};
		
		
		
			
		
		String codigo ="";
		
		System.out.println("\n----------------------------------");
		System.out.println("COLEGIO SENATI - MÓDULO DE BÚSQUEDAS");
		System.out.println("------------------------------------");
		
		System.out.print("Codigo a buscar: ");
		codigo = x.nextLine();
		
		
		//Realizar la busqueda del codigo en el arreglo arrcodigo
		
		int posicion = -1;
		for (int i=0; i< arrcodigo.length; i++) {
			if(arrcodigo [i].equals(codigo)) {
				posicion = i;
				break;
				
				
			}
	
		}

		System.out.println("\nResultados");
		System.out.println("------------------------------------");
		
		if (posicion == arrcodigo.length) {
			//codigo no se encontro
			System.out.println("\nCodigo no encontrado");
		}else {
			System.out.println("Datos del participante" );
			System.out.println("----------------------" );
			System.out.println("Código....:" + arrcodigo[posicion]);
			System.out.println("Nombre....:" + arrnombre[posicion] );
			System.out.println("Nota......:" + arrnota[posicion] );
			
			//Muestre un estado: aprobado desaprobado
			
			//*otra forma de hacer*
			//System.out.println("nOTA..:"+ ARRNOTA[posicion]):
			//if ( arrnota[posicion] >=11)
				//System.out.println("Estado....:Aprobado");
			//else
				//System.out.println("Estado....:Desaprobado");
		}
		
		

	}
	

}
