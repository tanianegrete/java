package bucles;

import java.util.Scanner;

public class ComandoBreak {
	public static void main(String[] args) {
		
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
			if (n1==12)break;
		}
		System.out.println("Te ha salido el valor: "+n1);
	numero.close();	
		
	
	

	}

}
