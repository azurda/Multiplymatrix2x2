//public void setDecimalseparator(char DecimalSeparator);
package matrixcalc;
import java.util.Scanner;
public class main {

	public static void main(String[] ar) {
	     
	     Scanner entradaA = new Scanner(System.in);
	     Scanner entradaB = new Scanner(System.in);
	     Scanner entradaC = new Scanner(System.in);
	     int[][] a = new int[4][4];
	     int[][] b  = new int [4][4];
	     int[][] c = new int [4][4];
	     int i, j, k;
	     System.out.println("Valor de la matriz A:");
	     for(i=0; i<2; i++)
	     {
	    	 for (j = 0; j < 2; j++)
	    	 {
	    		 a[i][j] = entradaA.nextInt(); 
	    	 }
	     }
	     System.out.println("Valor de la matriz B:");
	     for(i=0; i<2; i++)
	     {
	    	 for (j = 0; j < 2; j++)
	    	 {
	    		 b[i][j] = entradaB.nextInt(); 
	    	 }
	     }
		System.out.println("Valor de la matriz multiplicada:");
		for(i= 0; i<2;i++)
		{
			for(j=0; j<2; j++)
			{
				c[i][j] = 0;
				for (k=0; k<2; k++)
				{
					c[i][j] = c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		for(i = 0; i <2; i++)
		{
			for(j=0; j<2;j++)
			{
				System.out.print(c[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}
		
		
	entradaA.close();
	entradaB.close();
	entradaC.close();
	}
	
}
