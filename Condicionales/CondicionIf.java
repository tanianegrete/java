package Condicionales;

import java.util.Scanner;

public class CondicionIf {
	public static void main(String[] args) {
		int n1=11;
		int n2=2;
		if (n1%n2==0) {
			System.out.println("es par");
		}else {
			System.out.println("es impar");
		}
		
		//
		Scanner nombre = new Scanner(System.in);
		System.out.println("Escribe tu nombre:");
		String cadena1= nombre.nextLine();
		System.out.println("Tu nombre es: "+ cadena1);
				
	}
}
