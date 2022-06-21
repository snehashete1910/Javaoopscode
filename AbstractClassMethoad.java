package interfaceabstract;

abstract class base
{
	base()  //Default constructor
	{
		System.out.println("Its a constrcutor....");
	}
	abstract void fun(); //abstract method don't have body
}

class Derived extends base
{
	@Override
	void fun() {
		System.out.println("its abstrct method.....");
	}
	void run()
	{
		System.out.println("class is running.....");
	}
	
}
public class AbstractClassMethoad {

	public static void main(String[] args)
	{
		Derived d=new Derived();
		d.fun();
		d.run();
	}

}
