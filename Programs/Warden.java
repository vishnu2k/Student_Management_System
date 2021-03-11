package students;
public class Warden extends Person implements Pass
{
	private String hostelName;
	public Warden()
	{
		super("Sivabalan");
		this.hostelName="YB";
	}
	public boolean approvePass()
	{
		return true;
	}
	public String toString()
	{
		return "Warden : hostelName=" + hostelName + ", name=" + name + "]";
	}
}
