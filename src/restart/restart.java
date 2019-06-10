package restart;

import java.util.Scanner;

import restart.Employee;

public class restart {

	public static void main(String[] args)
	{
		System.out.println("Restart Project");
		restart res = new restart();
		res.testFunction();
		res.testEmpClass();
		System.out.println("Restart Project End");
	}
	
	private void testEmpClass()
	{
		Employee E1, E2, E3;
		E1 = new Employee("E1", 25);
		E2 = new Employee("E2", 35);
		E3 = new Employee("E3", 45);
		
		E1.iStatic = 50;
		System.out.println("iStatic Value : " + E1.iStatic);
		E3.iStatic = 100;
		System.out.println("iStatic Value : " + E1.iStatic);
		
		E1.computeSal();
		E2.computeSal();
		E3.computeSal();
		
		System.out.println("Sal of " + E1.name + " = " + E1.getSal());
		System.out.println("Sal of " + E2.name + " = " + E2.getSal());
		System.out.println("Sal of " + E3.name + " = " + E3.getSal());
		
	}
	
	private void testFunction()
	{
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
