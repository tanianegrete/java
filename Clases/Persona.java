package Clases;

public class Persona {
	
	private String colorPelo;
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return this.nombre;
	}
	
	

	public String getColorPelo() {
		return colorPelo;
	}



	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int ayo) {
        int ayoActual= 2021;
        this.edad = ayoActual- ayo;
		
		
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	
	

}
