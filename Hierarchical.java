package inheritance;
class A
{
	int a=10;
	int b=10;
	void enter()
	{
		System.out.println("enter value of a...."+a);
		System.out.println("enter value of b...."+b);
	}
	
}
class B extends A
{
	int c;
	void sum()
	{
		c=a+b;
		System.out.println("Addition....."+c);
	}
	
}
class C extends A
{
	int d;
	void sub()
	{
		d=a-b;
		System.out.println("Substraction...."+d);
	}	
	
}
public class Hierarchical
{

	public static void main(String[] args) 
	{
		B s=new B();
		C r=new C();
		s.enter();
		s.sum();
		r.enter();
	r.sub();
		
	}

}
