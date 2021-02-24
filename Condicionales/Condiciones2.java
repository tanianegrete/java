package Condicionales;

import java.util.Scanner;

public class Condiciones2 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int n1;
		int n2;
		n1=numero.nextInt();
		n2=numero.nextInt();
		//System.out.println("el numero que escribiste es:");
		//System.out.println(n1);
		
		if (n1>n2) {
			System.out.println("el numero es mayor"+ n1);
		}else {
			System.out.println("el numero es mayor"+ n2);
			numero.close();
		}
		
		
		
		
		
	}
	
}
