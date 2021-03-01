package Clases;

import Metodos.Metodo;

public class ObtenerDatos {

	
	//metodo que devuelva un objeto de clase persona y que reciba de argumento sus datos y los llene en el objeto persona
	
	
	public Persona llenaDatos(String nombre, String colorPelo, int edad ) { 
		
		
		Persona p1= new Persona();
		p1.setNombre(nombre);
		p1.setColorPelo(colorPelo);
		p1.setEdad(edad);
		return p1;
		
	} 

	
	public void imprimeDatosDeTodasLasPersona (Persona[] personas) {
	
		for (int i=0; i<personas.length;i++) {			
			Persona persona=personas[i];
			imprimeDatosPersona(persona);
			
		}
		System.out.println( "Total de personas: "+ personas.length);
	} 
			
			
	public void imprimeDatosPersona(Persona persona) {
		System.out.println( "El nombre es: "+ persona.getNombre());
		System.out.println("El color de pelo es: "+ persona.getColorPelo());
		System.out.println("Tiene "+ persona.getEdad()+ " años. ");
		
	}
	
	public static void main(String[]args) {
		
		ObtenerDatos obtenerDatos= new ObtenerDatos();
		//crear 3 personas, e imprimir los nombres despues de haber creado las 3
		
		Persona tatito= obtenerDatos.llenaDatos("tatito","verde",1991);
		Persona carina= obtenerDatos.llenaDatos("Carina","rosa",1980);
		Persona ricardo= obtenerDatos.llenaDatos("Ricardo","azul",1920);
		
		//obtenerDatos.imprimeDatosPersona(tatito);
		//obtenerDatos.imprimeDatosPersona(carina);
		//obtenerDatos.imprimeDatosPersona(ricardo);
		
		Persona[] personas =  {tatito,carina,ricardo};
		Persona[] personas2 = new Persona[3];
		
		obtenerDatos.imprimeDatosDeTodasLasPersona(personas);
		
	}
}
