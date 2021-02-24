package Array;

public class ClaseArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
      
      int[] array3= {20,30,40,34,37,00,45};
      
      System.out.println("Recorro el bucle");
      
      for(int contador=0;contador<=4;contador++)
      {
    	  System.out.print(array3[contador]+"-");
      }
      
      System.out.println("\n Recorro el bucle al reves");
      
      for(int contador=4;contador>=0;contador--)
      {
    	  System.out.print(array3[contador]+"-");
      }
	}
}
