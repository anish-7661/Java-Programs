class Sample
{
	int val1,val2;
	Sample(int val1,int val2)
	{
       this.val1=val1;
       this.val2=val2;
	}
	void display()
	{
		System.out.println(" val1 = "+val1+"\nval2 = "+val2);
	}

}
class This
{ public static void main(String a[])
	{
		System.out.println(" \n  ****** This example of This keyword ****** ");
	    System.out.println();
		Sample t1=new Sample( 3,4);
          t1.display();
	}
   
}