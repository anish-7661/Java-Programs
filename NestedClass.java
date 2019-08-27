 class NestedClass
{   int roll;
	String name;
	void sample()
	{
		roll=176156;
		name="Dhanashri";
		System.out.println("Roll no : "+roll+"\nName : "+name);

		class InnerClass
	    {
		    String dept=" Computer Technology ";
		    int year=3;
	     	void display1()
		 	{
		   		System.out.println("Department : "+dept+"\nYear : "+year+"rd");
		 	}
			
		}
		InnerClass obj2=new InnerClass();
            obj2.display1();
	
		
	}
	 	public static void main(String args[])
		{
			NestedClass obj1=new NestedClass();
			
			obj1.sample();
			
		}
}

	
	
