import java.util.*;
public class staticp
{
	static int a;
	static int b;
	//int x=10;
	static
	{
		//System.out.println(x);
		a=10;
		b=20;
		System.out.println("Methods are caqlled in static block:");
		Variable.count();
		Variable p=new Variable();;
		p.show();
	}
	public static void main(String args[])
	{

		Variable v=new Variable();
		System.out.println("Static count() is called with help of object:");
		v.count();
		System.out.println("Show() is called:");
		v.show();
		System.out.println("Static count() is called with help of class name:");
		Variable.count();
		System.out.println("Static block is called:");
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);

	}
}
class Variable
{
	int x=16;
			static int i=0;

			public static  void count()
			{
				i++;
				System.out.println("Static variable count:"+i);
				//System.out.println("Instance variable:"+x);
			}
			void show()
			{
				System.out.println("Instance variable:"+x);
				System.out.println("Static variable:"+i);
			}
}