interface Printable
{
	void prin

interface Showable extends Printable
{
	void show();
}

class Interface2 implements Showable
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
		Interface2 obj = new Interface2();
		obj.print();
		obj.show();
	}
}