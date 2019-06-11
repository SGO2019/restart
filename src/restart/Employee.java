package restart;

import java.util.Comparator;

public class Employee implements IEmployee, Comparator<Employee> {

	public String name;
	public int age;
	private int sal = 0;
	
	static int iStatic = 0;
	
	public Employee(String iname, int iage)
	{
		this.name = iname;
		this.age = iage;
	}
	
	public void computeSal()
	{
		this.sal = this.age * 10000;
	}
	
	public int getSal()
	{
		return this.sal;
	}
	
	public int compare(Employee e1, Employee e2)
	{

		if (e1.age == e2.age) 
		{
			return 0;
		}
		else
		{
			return 1;
		}
		
	}
}
