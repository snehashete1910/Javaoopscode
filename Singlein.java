package inheritance;

class Animal
{
	void animal()
	{
		System.out.println("Animal are everywhere........");
	}
}
class Dog extends Animal
{
	void dog()
	{
		System.out.println("Dog is part of animal........");
	}
}

public class Singlein {

	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.animal();
		d.dog();
		

	}

}
