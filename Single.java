package inheritance;
class Singlee
{
	protected int rollno,marks;
	String name;
	void input()
	{
		System.out.println("Enter value of student......");
	}
	
}
public class Single extends  Singlee{
	void dispay()
	{
		rollno=101;
		marks=99;
		name="sneha";
		System.out.println(rollno+" "+marks+" "+name);
	}

	public static void main(String[] args) 
	{
		Single s=new Single();
		s.input();
		s.dispay();
	
	}

}
