package ejercicios; 
import java.util.Scanner;

public class Calculadora {
public static void main(String[] args) {
		
		//pedir dos numeros para calculadora
		System.out.println("Escribe dos numero para calcular");
		Scanner entrada = new Scanner(System.in);
		float n1;
		float n2;
		String simbolo;
		
		n1=entrada.nextFloat();
		n2=entrada.nextFloat();
		System.out.println("Escribe que deseas calcular: suma, resta, divicion o multiplicacion");
		
		simbolo=entrada.next(); //string
		
  
		//do {
		//if(!simbolo.equals("F")) {
		//comprobación de simbolo para operacion
		 if(!simbolo.equals("+") && !simbolo.equals("-")&& !simbolo.equals("*")&& !simbolo.equals("%")) {
			
			 System.out.println("Introduce un caracter valido para la calculadora");
							
			}else {
					
					switch(simbolo) {
					case "+":System.out.println("La suma es: " + (n1+n2));
					break;
					case "-":System.out.println("La resta es :"+ (n1-n2));
					break;
					case "*":System.out.println("La multiplicacion es:" + (n1*n2));
					break;
					case "%":System.out.println("La divicion es:"+ (n1%n2));
					break;
					}
			}
			 
		// }while(!simbolo.equals("F"));
        //  entrada.close();
		
		
				
		
 }
}
