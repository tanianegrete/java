package variables;

public class OperadoresLogicos {
	public static void main(String[] args) {
		int z =10;
		int r = 9;
		System.out.println(z<r);
		
		//&& y
		//||  o
		//!  not
		int x =90;
		System.out.println(z<r || x>r);
		String cadena = z<r?"SI":"No";
		System.out.println(z<r || x>r);
		
		int num= 10;
		int num2=2;	
		System.out.println(num % num2 ==0 ?"Par":"impar");
		
		
		
	}
}
