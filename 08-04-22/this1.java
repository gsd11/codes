
class this1
{
	int a;
	int b;
	this1(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	void display()
	{
		System.out.println("a = " + a + " b = " + b);
	}

	public static void main(String[] args)
	{
		this1 t = new this1(10, 20);
		t.display();
	}
}
