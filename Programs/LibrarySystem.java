package students;
import java.io.BufferedReader;
import java.io.FileReader;

public class LibrarySystem 
{
	private String bookStatus,book;
	public String getBook() 
	{
		return book;
	}
	public void setBook(String book) 
	{
		this.book = book;
	}
	private int billno;
	public int getBillNo()
	{
		return billno;
	}
	public void setBillNo(int n)
	{
		billno=n;
	}
	public String getBookStatus() 
	{
		return bookStatus;
	}
	public void setBookStatus(String bookStatus)
	{
		this.bookStatus = bookStatus;
	}
	public void borrowBook(String s)throws Exception
	{
		String g1,t="Book not Available";
		FileReader o2=new FileReader("C:\\Users\\S vishnu kumar\\Desktop\\mini project final\\Library.csv");
		BufferedReader ob2=new BufferedReader(o2);
		while((g1=ob2.readLine())!=null)
		{
			String s1[]=g1.split(",");
			if((s1[0].trim()).equalsIgnoreCase(s) && (s1[4].trim()).equalsIgnoreCase("yes"))
			{
				int k=(int)(Math.random()*20);
				setBillNo(k);
				t="\n\nBILL:\n\nTittle:\t"+s1[1]+"\nAuthor:\t"+s1[3]+"\nCategory:\t"+s1[2]+"\nBill Number:\t"+Integer.toString(k);
				setBook(s1[1]);
				break;
			}
		}
		ob2.close();
		o2.close();
		setBookStatus(t);
	}
}
