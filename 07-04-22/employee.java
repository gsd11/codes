public class employee
{
	int salary;
	String name,loaction;
	
	public employee(String n,int s,String l)
	{
        name = n;
        salary = s;
        loaction=l;
	}
	void show()
	{
		System.out.println(name+" "+salary+" "+loaction);
	}
	public static void main(String args[])
	{
        System.out.println("Enter the value for name, salary,location");
        java.util.Scanner sc=new java.util.Scanner(System.in);
        String n=sc.next();
        int s=sc.nextInt();
        String l=sc.next();
		employee emp1 = new employee(n,s,l);
		emp1.show();
	}
}