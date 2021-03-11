package students;

import java.io.BufferedReader;
import java.io.FileReader;

public class Database 
{
	private String h;
	public String getH()
	{
		return h;
	}
	public void setH(String s)
	{
		h=s;
	}
	public void reqStatus(String s)throws Exception
	{
		FileReader o=new FileReader("C:\\Users\\S vishnu kumar\\Desktop\\mini project final\\Status.csv");
		BufferedReader ob=new BufferedReader(o);
		String g;
		while((g=ob.readLine())!=null)
		{
			String w[]=g.split(",");
			if(w[0].trim().equalsIgnoreCase(s))
			{
				setH("Roll No: "+w[2]+"\nCGPA: "+w[3]+"\nAttendance: "+w[4]+"\n");
				break;
			}
		}
		ob.close();
		o.close();
	}
}
