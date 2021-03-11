package students;
public class Librarian 
{
	private String borsta;
	public String getBorsta()
	{
		return borsta;
	}
	public void setBorsta(String borsta)
	{
		this.borsta = borsta;
	}
	public void borrow(int n,int n1)
	{
		if(n==n1)
			setBorsta("Borrowed");
		else
			setBorsta("Not Borrowed");
	}
}
