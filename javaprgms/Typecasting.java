class Typecasting
{
	public static void main(String args[])
	{
		System.out.println("****WIDENING****");
		int x=10;
		float y=x;
		double z=y;
		System.out.println("The value before changed = "+x);
		System.out.println("The value after int changed = "+y);
		System.out.println("The value after float changed = "+z);

		System.out.println("****NARROWING****");
		double a=10.8935627;
		float b=(float)a;
		int c=(int)b;
		System.out.println("The value before changed = "+a);
		System.out.println("The value after int changed = "+b);
		System.out.println("The value after float changed = "+c);
	}
}