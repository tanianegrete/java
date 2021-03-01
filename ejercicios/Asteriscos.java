package ejercicios; 
import java.util.Scanner;

public class Asteriscos {
public static void main(String[] args) {
		
		//pedir nombre
		System.out.println("Escribe tu nombre para saber la longitud con asteriscos");
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		nombre=entrada.next(); //string
		nombre.length();
		
		System.out.println(nombre.length());
		int i;
		for(i=0;i<nombre.length(); i++) {
		System.out.print("*");
	    }
		//System.out.println("*");
  
     }
}

