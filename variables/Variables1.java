package variables;

public class Variables1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		double d1 = 6.111;
		double salario = 18.000;
		String nombre = "Tania ";
		String apellido = " Morales Negrete";
		double total = d1 / salario; 
		double sueldo= total * 100;
		
		System.out.println("Te llamas:"+ nombre + apellido);
		System.out.println("Tu irpf es:"+ sueldo);//cast to string

	}
}
