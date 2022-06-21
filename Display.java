package interfaceabstract;

class login implements InterfaceAbstract
{

	@Override
	public void run() {
		System.out.println(" using inter i tried.....");
			}

	@Override
	public void catchr() {

System.out.println(" its override because...its inherit parent class property..");
		
	}
}

public class Display
{
 
	public static void main(String[] args) 
	{
		login l=new login();
		l.catchr();
		l.run();
	}

}
