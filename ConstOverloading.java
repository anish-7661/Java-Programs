class Const
{
   Const()
   {
     System.out.println(" Default constructor ");
   }
   Const(int i,int j)
   {
       System.out.println("i : "+i+"\nj : "+j);
   }
   Const(String st1,double do1)
   {
     System.out.println("String : "+st1+"\nValue : "+do1);
   }
}
class ConstOverloading
{  public static void main(String a[])
	{ 
		System.out.println(" \n   ******This example of constructor overloading******");
	    System.out.println();
		Const con =new Const();
        Const con1=new Const(32,89);
       Const con2=new Const(" hello ",345.678);
	}
   
}