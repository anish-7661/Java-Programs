class GarbageCollector
{
	protected void finialize()
	{
		System.out.println("Object is garbage collector");
	}
	public static void main(String ar[])
	{
		GarbegeCollector s1=new GarbegeCollector();
		GarbegeCollector s2=new GarbegeCollector();
		s1=null;

	}
}