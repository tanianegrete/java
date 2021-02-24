package Array;

public class ArrayMultiArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]=new int[3][4];
		
		x[0][0]=1;
		x[1][0]=1;
		x[1][1]=1;

		//System.out.println(x[0][0]);
		for (int z=0; z<x.length;   z++)			
		{
			for (int h=0;h<x[z].length;h++)
			{
				System.out.print(x[z][h]);
			}
			System.out.println();
		}
		
	}
		
	
}
