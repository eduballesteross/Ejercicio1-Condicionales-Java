package edu.EjercicioCondicionales1.Controladores;

import java.util.Scanner;

import edu.EjercicioCondicionales1.Servicios.OperativaImplementacion;
import edu.EjercicioCondicionales1.Servicios.OperativaInterfaz;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
		
	OperativaInterfaz operativaI = new OperativaImplementacion();
	
		int nota, edad;
		char sexo;
		
			System.out.println("Intruduce su nota, su edad y su sexo para comprobar su estado de solicitud.");
		
		do {
			System.out.println("Introduzca la nota obtenida.");
			
			while(!sc.hasNextInt()) {
			System.out.println("Debe introducir un número entero.");
			sc.nextLine();}
			
			nota=sc.nextInt();
			
			if(nota<=0 || nota>10) {
				System.out.println("La nota debe ser entre 1-10.");
			}
		}while(nota<=0 || nota>10);
			
		
		
			do {
				System.out.println("Introduzca su edad.");
				
				while(!sc.hasNextInt()) {
					System.out.println("Debe de introducir un número entero.");
				sc.nextLine();}
				
				edad=sc.nextInt();
				
				if(edad<0) {
					System.out.println("No se puede tener menos de 0 años.");
				}
			}while(edad<0);
				
			
			do {
				System.out.println("Introduzca su sexo (MASCULINO/M FEMENINO/F)");
				
				sexo =sc.next().charAt(0);
				
				if (sexo=='M'||sexo=='F'||sexo=='m'||sexo=='f') {
					
					  break;
				}else 
					System.out.println("Sexo no válido. Inténtelo de nuevo.");
				
            }while(sexo!='M'||sexo!='F'||sexo!='m'||sexo!='f');
			sc.close();
			
			operativaI.Aprobacion(nota, edad, sexo);
		
		
		
		
	}

}
