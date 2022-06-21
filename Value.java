package encapsulation;
class Encap
{
	private int value;
	public void setvalue(int x)
	{
		 value=x;
	}
	public int getvalue()
			{
		return value;
			}
}

public class Value {

	public static void main(String[] args)
	{
Encap e=new Encap();

e.setvalue(26);
System.out.println(e.getvalue());

	}

}
