package encapsulation;

class company
{
	private int empid;
	public void setempid(int eid)
	{
		empid=eid;
	}
	public int getempid()
	{
		return empid;
	}
}


public class Getset {

	public static void main(String[] args)
	{
		
		company c=new company();
		c.setempid(101);
		System.out.println(c.getempid());


	}

}
