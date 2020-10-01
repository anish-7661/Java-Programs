// Program for concept of Function Overloading...(Same function name with different no/datatype of arguments...)
class MethodOverloading
{
	void calculation()// Function with no parameters
	{
       		System.out.println(" This is a without parameter function ");
	}
	void calculation(int no1, int no2) //Function with integer parameters
	{
       		int res=no1*no2;
       		System.out.println(" Result :"+res);
 	}
	void calculation(double num1, double num2)  //Function with double datatype parameters
	{
      		double res=num1+num2;
      		System.out.println(" Result : "+res);
	}
	void calculation(String st)  // Funtion with string parameter
	{
       		System.out.println(" String : "+st);
	}

	public static void main(String a[])
	{   System.out.println(" \n  ******This example of method overloading******");
	    System.out.println();
		MethodOverloading mo=new MethodOverloading();
		mo.calculation(); //Calling function having no parameters
		mo.calculation(33,77);	//Calling function having integer parameters
		mo.calculation(56.56,43.43); 	//Calling function having double values as parameters
		mo.calculation(" Hello world ");	// Calling function having string as parameter
	}
}
