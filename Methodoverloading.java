package polymorphism;

public class Methodoverloading {
	
	public void sum()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
		
	}
	public void sum(long a,long b)
	{
		
		long c;
		c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
	
		Methodoverloading m=new Methodoverloading();
m.sum();
m.sum(10,10);
	}

}
