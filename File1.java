class Add1 // sub class1
{
	void add(int a, int b)
	{
		System.out.println("Add is "+(a+b));
	}
}
class Sub1 // sub class2
{	
	void sub(int x, int y)
	{
		Add1 obj = new Add1();
		obj.add(10,20);
		System.out.println("Sub is "+(x-y));
	}
}

public class File1  // main class
{
	public static void main(String[] args) 
	{
		System.out.println("Main class");
		//creation of object
		
		Sub1 obj2 = new Sub1();
		obj2.sub(33, 11);
	}
}