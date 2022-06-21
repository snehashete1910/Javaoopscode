package inheritance;

class summ
{
	int a=10,b=20;
	void enter()
	{
		System.out.println("Enter value of a.........."+a);
		System.out.println("Enter value of b......."+b);
	}
}
class  subb extends summ
{
	int c;
	void sum()
	{
		c=a+b;
		System.out.println("Addition........."+c);
	}
}
class sunn extends subb
{
	int d;
	void sub()
	{
		d=a-b;
		System.out.println("substraction......."+d);
	}
}
public class Multilevel{

	public static void main(String[] args) 
	{
	sunn r=new sunn();
	r.enter();
	r.sum();
	r.sub();
	}

}
