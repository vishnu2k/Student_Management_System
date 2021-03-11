package students;
public class Student extends Person 
{
	private String rollNo,bookStatus,transport,details,passStatus,course,status="";
	public Student(String name,String rollNo)
	{
		super(name);
		this.rollNo=rollNo;
	}
	public String getCourse() 
	{
		return course;
	}
	public void setCourse(String course)
	{
		status=status+"\nCourse Status: "+course;
		this.course = course;
	}
	public String getDetails()
	{
		return details;
	}
	public void setDetails(String details) 
	{
		status=status+"Details: "+details+"\n";
		this.details = details;
	}
	public String getName()
	{
		return super.getName();
	}
	public String getRollNo()
	{
		return rollNo;
	}
	public String getTransport() 
	{
		return transport;
	}
	public void setTransport(String transport) 
	{
		status=status+"Transport Details:\n"+transport+"\n";
		this.transport = transport;
	}
	public String getBookStatus() 
	{
		return bookStatus;
	}
	public void setBookStatus(String bookStatus) 
	{
		status=status+"\nBook Status: "+bookStatus;
		this.bookStatus = bookStatus;
	}
	public String getPassStatus() 
	{
		return passStatus;
	}
	public void setPassStatus(String passStatus)
	{
		status=status+"PassStatus: "+passStatus;
		this.passStatus = passStatus;
	}
	public void displaystatus()
	{
		System.out.println(status);
	}
}
