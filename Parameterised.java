package constructor;

public class Parameterised
{
	int idstudent;
	String namestudent;
	String emailidstudent;
	long mobileparent;
	
	Parameterised(int id,String name,String emailid,long mobile)
	{
		 idstudent=id;
		 namestudent=name;
		 emailidstudent=emailid;
		 mobileparent= mobile;
		
	}
	void display()
	{
		System.out.println("Student information : "+idstudent+ "  "+namestudent+"  "+emailidstudent+"  "+mobileparent);
		
	}
	

	public static void main(String[] args) 
	{
		Parameterised P=new Parameterised(101, "Sneha", "snehashete@gamail.com", 9860418529L);
		P.display();
		Parameterised P2=new Parameterised(102, "Swapnil", "swpnilshete@gamail.com", 9158935808L);
		P2.display();
		Parameterised P3=new Parameterised(103, "Sushant", "sushantlambe@gamail.com", 8007158178L);
		P3.display();
		Parameterised P4=new Parameterised(104, "Divisha", "divishashete@gamail.com", 9158935808L);
		P4.display();
	}

}
