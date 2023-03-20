class Datatypesizes
{
	public static void main(String args[])
	{
		System.out.println("*****IN BITS*****");
		System.out.println("Byte = "+Byte.SIZE+" bits");
		System.out.println("Short = "+Short.SIZE+" bits");
		System.out.println("Integer = "+Integer.SIZE+" bits");
		System.out.println("Long = "+Long.SIZE+" bits");
		System.out.println("Float = "+Float.SIZE+" bits");
		System.out.println("Double = "+Double.SIZE+" bits");
		System.out.println("Character = "+Character.SIZE+" bits");
		System.out.println("Boolean is 1 bit");

		System.out.println("*****IN BYTES*****");
		System.out.println("Byte = "+Byte.SIZE/8+" bytes");
		System.out.println("Short = "+Short.SIZE/8+" bytes");
		System.out.println("Integer = "+Integer.SIZE/8+" bytes");
		System.out.println("Long = "+Long.SIZE/8+" bytes");
		System.out.println("Float = "+Float.SIZE/8+" bytes");
		System.out.println("Double = "+Double.SIZE/8+" bytes");
		System.out.println("Character = "+Character.SIZE/8+" bytes");
		System.out.println("Boolean is 1 bit");
	}
}