package restart;

import java.util.Scanner;

public class restart {

	public static void main(String[] args)
	{
		System.out.println("Restart Project");
		final int MULTIPLY_FAC = 5;
		short i = 0, j = 0;
		
		// To get input from the console
		Scanner in = new Scanner (System.in);
		// j = in.nextShort();
		
		char aChar = 'A';
		for (i = 1; i<=10; i++)
		{
			j += MULTIPLY_FAC; 
			if (j > 250) break;
		}
		String str1 = null;
		str1 = Integer.toString(j);
		str1 = str1 + "Test"; // How Immutable ???
		
		System.out.println("Restart Project = " + j + " String Value = " + str1);
		
		String names[] = {"A", "B", "C", "D"};
		i = 0;
		while (i < names.length)
		{
			System.out.println("Names Array :" + names[i]);
			i++;
		}
		
		int[][] matrix = new int[3][3];
		for (int ii=0;ii<3;ii++)
		{
			for (int jj=0;jj<3;jj++)
			{
				matrix[ii][jj] = ii*jj;
			}
		}
		System.out.println(" Int Array :" + matrix[0][0] + "  " + matrix[1][1] + "  " + matrix[2][2]);
	}
}
