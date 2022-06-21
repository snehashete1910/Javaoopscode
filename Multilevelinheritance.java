package inheritance;
class Animal1
{
	void animal() 
	{
	System.out.println("Animal is strong class.......");
}
	}
class Cat extends Animal1
{
	void cat()
	{
		System.out.println("cat is subpart of animal........");
	}
	
}
class Meow extends Cat
{
	void meow()
	{
		System.out.println("cat doing mewo.....");
	}
	
	
}
public class Multilevelinheritance {

	public static void main(String[] args) 
	{
		Meow m=new Meow();
		m.animal();
		m.cat();
		m.meow();
		
	}

}
