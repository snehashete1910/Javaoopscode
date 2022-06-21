package polymorphism;

class shape
{
	void draw()
	{
		System.out.println("Draw shape........");
	}
}
class square extends shape
{
	@Override
	void draw()
	{
		super.draw();
		System.out.println("draw square.......");
	}
}
public class Methodoverriding
{
	public static void main(String[] args) 
	{
	square s=new square();
	s.draw();

	}

}
