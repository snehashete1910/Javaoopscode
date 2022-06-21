package polymorphism;

 class Dyanmic
{
	void display(int m,int ml)
	{
		System.out.println(" its a dynamic polymorphism......");
		
	}
}

public class Runpolymorphism extends Dyanmic{
	void display(int p,int y)
	{
		System.out.println(" its a runtimepolymorphism......");
	}

	public static void main(String[] args) 
	{
		 Runpolymorphism h=new  Runpolymorphism();
		 h.display(0, 0);
		 h.display(0, 0);
	

	}

}
