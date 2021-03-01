package ejercicios; 
import java.util.Scanner;

public class Vocales {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir un texto por  pantala
		//Pintar solo las consonantes
		//Esto es una prueba --> st s n prb

		String cadena= new String();

		Scanner teclado= new Scanner(System.in) ;
		String frase;
		frase= teclado.nextLine();

		for (int posicion=0;posicion<frase.length();posicion++) {
			char letra=frase.charAt(posicion);
			if (letra =='a' ||letra=='e'  ||letra=='i' ||letra=='o' ||letra=='u')
			{
				continue;
			}
			System.out.print(frase.charAt(posicion));
		}

teclado.close();

	}
}
