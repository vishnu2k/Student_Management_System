package students;
public class DisplayStatus extends Database
{
	private String Status;
	public String getStatus()
	{
		return Status;
	}
	public void setStatus(String Status)
	{
		this.Status=Status;
	}
	public void reqStatus(String s)throws Exception
	{
		super.reqStatus(s);
		setStatus(super.getH());
	}
}
