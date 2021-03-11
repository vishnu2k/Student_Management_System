package students;
public class Faculty extends Person implements Pass
{
	private int id;
	public Faculty()
	{
		super("Senthil");
		this.id=45;
	}
	public boolean approvePass()
	{
		return true;
	}
	public String toString() 
	{
		return "Faculty [id=" + id + ", name=" + name + " ]";
	}
}