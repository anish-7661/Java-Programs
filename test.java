class test
{
	protected void finalize()
	{
		System.out.println("Object is garbage collector");
	}
	public static void main(String ar[])
	{
		test s1=new test();
		test s2=new test();
		s1=null;
		System.gc();

	}
}