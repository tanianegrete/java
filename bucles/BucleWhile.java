package bucles;

import java.util.Scanner;

public class BucleWhile {
	public static void main(String[] args) {
		int x=1;
		while (x<10) {
			System.out.println(x);
			x++;
		}
		
		//pedir dos numeros y visualizar todos los que estan entre ellos
		
		System.out.println("Escribe dos numero");
		Scanner numero = new Scanner(System.in);
		
		int n1;
		int n2;
		
		n1=numero.nextInt();
		n2=numero.nextInt();
		
		
		
		while (n1<=n2) {
			System.out.println(n1);
			n1++;
		}
	//numero.close();	
		
	

	}
}
