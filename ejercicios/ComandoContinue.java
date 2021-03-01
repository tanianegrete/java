package ejercicios; 
public class ComandoContinue {
	 public static void main(String[] args) {
		 int x=0;
		 while(x<10) {
			 x++;
			 if(x==6) {
				 continue;
			 }
			System.out.println("pasa"+ x);
		 }
	 }

}
