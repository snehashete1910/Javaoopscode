package polymorphism;

public class Compiletimepolymorphism
{
	void method(int i ,String p)
	{
		System.out.println("method from runtime");
	}
	void method(int j)
	{
		j=15;
		System.out.println(" method number ...." +j);
	}
static void method(char c)
{
	System.out.println(" its char...");
}
	public static void main(String[] args) 
	{
		Compiletimepolymorphism n=new Compiletimepolymorphism();
		n.method(15);
		n.method(23, "sneha");
		method('m');
	}

}
