package Condicionales;

import java.util.Scanner;

public class IfMultiple {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		n1=numero.nextInt();
		n2=numero.nextInt();
		n3=numero.nextInt();
		
		
		if (n1>n2 && n1>n3) {
			System.out.println("el numero es mayor el numero 1 :"+ n1);
		}else if(n2>n1 && n2>n3) {
			System.out.println("el numero es mayor el numero 2 :"+ n2);
		}
		else {
			System.out.println("el numero es mayor el numero 3 :"+ n3);
			numero.close();
		}
		
		
		
		
		
	}

}
