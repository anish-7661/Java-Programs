class Parent
{
	 void demo()
	{
		 System.out.println(" class1");
	}
  
}
 class Child extends Parent
{
	 void demo()
	{
		System.out.println(" class 3");
	}
	public static void main(String a[])
	{   System.out.println(" \n  ****** This example of upcasting ******");
	    System.out.println();
		Parent obj=new Child();
		obj.demo();

	}
}
