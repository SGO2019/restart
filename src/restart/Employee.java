package restart;

public class Employee {

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
}
