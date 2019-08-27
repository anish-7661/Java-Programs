class MethodOverloading
{
	void calculation()
	{
       System.out.println(" this is a without parameter function ");
	}
	void calculation(int no1, int no2)
	{
       int res=no1*no2;
       System.out.println(" Result :"+res);
 	}
	void calculation(double num1, double num2)
	{
      double res=num1+num2;
      System.out.println(" Result : "+res);
	}
	void calculation(String st)
	{
       System.out.println(" String : "+st);
	}

	public static void main(String a[])
	{   System.out.println(" \n  ******This example of method overloading******");
	    System.out.println();
		MethodOverloading mo=new MethodOverloading();
		mo.calculation();
		mo.calculation(33,77);
		mo.calculation(56.56,43.43);
		mo.calculation(" Hello world ");
	}
}