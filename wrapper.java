class wrapper
{
	public static void main(String arg[])
	{
		int b=20;
		Integer m=Integer.valueOf(b);
		Integer n=b;
		System.out.println(" Value of a = "+n); 
		Character ch='a';
		char a=ch;
		System.out.println(" Value of a = "+a);
       // Integer a2=new Integer(a1);
		Integer a1=3;
        int i=a1.intValue();
        int j=a1;
        System.out.println(a1+" "+i+" "+j);

	}
}