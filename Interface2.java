interface Printable
{
	void print();
}

interface Showable extends Printable
{
	void show();
}

class interface2 implements Showable
{
	public void print()
	{
		System.out.println("Welcome\n");
	}
	public void show()
	{
		System.out.println("Example of Interface\n");
	}
	public static void main(String args[])
	{
		interface2 obj = new interface2();
		obj.print();
		obj.show();
	}
}